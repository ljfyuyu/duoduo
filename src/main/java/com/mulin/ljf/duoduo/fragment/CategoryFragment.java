package com.mulin.ljf.duoduo.fragment;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mulin.ljf.duoduo.R;
import com.mulin.ljf.duoduo.activity.SelectSchoolActivity;
import com.mulin.ljf.duoduo.adapter.HuodondAdapter;
import com.mulin.ljf.duoduo.adapter.MyPagerAdpater;
import com.mulin.ljf.duoduo.common.ProDemoContext;
import com.mulin.ljf.duoduo.model.CategoryHuodongModel;
import com.mulin.ljf.duoduo.model.HomepageModel;
import com.mulin.ljf.duoduo.rxJava.http.RetrofitManager;
import com.mulin.ljf.duoduo.rxJava.subscribers.ProgressSubscriber;
import com.mulin.ljf.duoduo.rxJava.subscribers.SubscriberOnNextListener;
import com.mulin.ljf.duoduo.utils.LogUtils;
import com.mulin.ljf.duoduo.utils.ViewUtil;
import com.mulin.ljf.duoduo.view.AutoLoadMoreRecyclerView;
import com.mulin.ljf.duoduo.view.ThreePointLoadingView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mulin on 16/9/20.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class CategoryFragment extends Fragment {

    @Bind(R.id.tabs)
    TabLayout tabLayout;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_school)
    TextView school;
    @Bind(R.id.scan)
    ImageView scan;
    @Bind(R.id.viewpager)
    ViewPager viewPager;
    @OnClick(R.id.toolbar_school)
    public void onClick(View view){
        Intent mIntent = new Intent(getActivity(), SelectSchoolActivity.class);
        startActivityForResult(mIntent, 11);
    };
    private View view;
    String Tag = "MainActivity";
    String Tag1 = "onNext处理";
    String SchoolId = "1024";
    boolean isRefreshInit = false;
    private SubscriberOnNextListener getCategoryHuodonNext,getCategoryNext,getCategoryBisaiNext;

    private ProDemoContext mContext = ProDemoContext.getInstance();
    private List<String> mTitleList = new ArrayList<>();//顶部资讯页卡标题集合
    private View view1, view2, view3 ;//顶部页卡视图
    private List<View> mViewList = new ArrayList<>();//顶部页卡视图集合
    private AutoLoadMoreRecyclerView huodongRecycle,jiangzuoRecycle,bisaiRecycle;
    private ThreePointLoadingView huoodngLoad,jiangzuoLoad,bisaiLoad;
    HuodondAdapter huodongAdapter,jiangzuoAdapter,bisaiAdapter;
    List<HomepageModel> huodongList,jiangzuoList,bisaiList;

    private LayoutInflater mInflater;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {   view = inflater.inflate(R.layout.fragment_home_layout, container, false);
        ButterKnife.bind(this,view);
//        initTheme();
        initPager();
        resolveRxNext();
        getCategoryInfo();
        return view;
    }

    /*
    初始化页卡滚动页面
     */
    private void initPager() {

        mInflater = LayoutInflater.from(getActivity());
        view1 = mInflater.inflate(R.layout.viewpager_newslist, null);
        huodongRecycle = (AutoLoadMoreRecyclerView) view1.findViewById(R.id.recycler_view);
        view2 = mInflater.inflate(R.layout.viewpager_newslist, null);
        jiangzuoRecycle = (AutoLoadMoreRecyclerView) view2.findViewById(R.id.recycler_view);
        view3 = mInflater.inflate(R.layout.viewpager_newslist, null);
        bisaiRecycle = (AutoLoadMoreRecyclerView) view3.findViewById(R.id.recycler_view);

        //添加页卡视图
        mViewList.add(view1);
        mViewList.add(view2);
        mViewList.add(view3);

        //添加页卡标题
        mTitleList.add("社团活动");
        mTitleList.add("讲座信息");
        mTitleList.add("比赛信息");

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);//设置tab模式，当前为系统默认模式
        tabLayout.addTab(tabLayout.newTab().setText(mTitleList.get(0)));//添加tab选项卡
        tabLayout.addTab(tabLayout.newTab().setText(mTitleList.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(mTitleList.get(2)));

        MyPagerAdpater mAdapter = new MyPagerAdpater(mViewList,mTitleList);
        viewPager.setAdapter(mAdapter);//给ViewPager设置适配器
        // 根据Tab的长度动态设置TabLayout的模式
        ViewUtil.dynamicSetTabLayoutMode(tabLayout);
        tabLayout.setupWithViewPager(viewPager);//将TabLayout和ViewPager关联起来。
        tabLayout.setTabsFromPagerAdapter(mAdapter);//给Tabs设置适配器
    }

    /**
     * 初始化主题
     */
    private void initTheme() {
        getActivity().setTheme(R.style.BaseAppTheme);
    }

    private void resolveRxNext() {

        getCategoryNext = new SubscriberOnNextListener<List<CategoryHuodongModel>>() {
            @Override
            public void onNext(List<CategoryHuodongModel> huodongModels) {

                //如果校区更换,就更新全部数据,并置位标志位为初始false
                if(isRefreshInit){
                    if(huodongList!=null)
                        huodongList.clear();
                    if(jiangzuoList!=null)
                        jiangzuoList.clear();
                    if(bisaiList!=null)
                        bisaiList.clear();
                    isRefreshInit = false;
                }
                if(huodongModels.size()!=0){

                    for(int i=0;i<huodongModels.size();i++)
                    {
                        CategoryHuodongModel huodongModel = huodongModels.get(i);

                        if(huodongModel.getCategory_id()==1){
                            if(huodongAdapter!=null){
                                for(int l=0;l<huodongModel.getItem().size();l++){
                                    huodongList.add(huodongModel.getItem().get(l));
                                }
                                huodongAdapter.notifyDataSetChanged();

                            }
                            if(huodongAdapter==null){
                                huodongList = huodongModel.getItem();
                                huodongAdapter = new HuodondAdapter(getActivity(),huodongList);
                                huodongRecycle.setAutoAdapter(huodongAdapter);
                                huodongRecycle.setLayoutManager(new LinearLayoutManager(getActivity()));
                            }
                            if(jiangzuoAdapter!=null){
                                for(int l=0;l<huodongModel.getItem().size();l++){
                                    jiangzuoList.add(huodongModel.getItem().get(l));
                                }
                                jiangzuoAdapter.notifyDataSetChanged();
                            }
                            if(jiangzuoAdapter==null){
                                jiangzuoList = huodongModel.getItem();
                                jiangzuoAdapter = new HuodondAdapter(getActivity(),jiangzuoList);
                                jiangzuoRecycle.setAutoAdapter(jiangzuoAdapter);
                                jiangzuoRecycle.setLayoutManager(new LinearLayoutManager(getActivity()));
                            }
                            if(bisaiAdapter!=null){
                                for(int l=0;l<huodongModel.getItem().size();l++){
                                    bisaiList.add(huodongModel.getItem().get(l));
                                }
                                bisaiAdapter.notifyDataSetChanged();
                            }
                            if(bisaiAdapter==null){
                                bisaiList = huodongModel.getItem();
                                bisaiAdapter = new HuodondAdapter(getActivity(),bisaiList);
                                bisaiRecycle.setAutoAdapter(bisaiAdapter);
                                bisaiRecycle.setLayoutManager(new LinearLayoutManager(getActivity()));
                            }
                        }
                        if(huodongModel.getCategory_id()==2){
                            if(jiangzuoAdapter!=null){
                                for(int l=0;l<huodongModel.getItem().size();l++){
                                    jiangzuoList.add(huodongModel.getItem().get(l));
                                }
                                jiangzuoAdapter.notifyDataSetChanged();
                            }
                            if(jiangzuoAdapter==null){
                                jiangzuoList = huodongModel.getItem();
                                jiangzuoAdapter = new HuodondAdapter(getActivity(),jiangzuoList);
                                jiangzuoRecycle.setAutoAdapter(jiangzuoAdapter);
                                jiangzuoRecycle.setLayoutManager(new LinearLayoutManager(getActivity()));
                            }
                        }
                        if(huodongModel.getCategory_id()==3){
                            if(bisaiAdapter!=null){
                                for(int l=0;l<huodongModel.getItem().size();l++){
                                    bisaiList.add(huodongModel.getItem().get(l));
                                }
                                bisaiAdapter.notifyDataSetChanged();
                            }
                            if(bisaiAdapter==null){
                                bisaiList = huodongModel.getItem();
                                bisaiAdapter = new HuodondAdapter(getActivity(),bisaiList);
                                bisaiRecycle.setAutoAdapter(bisaiAdapter);
                                bisaiRecycle.setLayoutManager(new LinearLayoutManager(getActivity()));
                            }
                        }
                    }
                    LogUtils.d(Tag,"获取到活动信息列表");

                }

            }
        };
    }

    private void getCategoryInfo(){
        RetrofitManager.getInstance(1).getCategoryInfo(new ProgressSubscriber(getCategoryNext, getActivity()), 1, SchoolId, mContext.getUserID());
    }
}
