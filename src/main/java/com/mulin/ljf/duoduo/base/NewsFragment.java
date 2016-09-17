package com.mulin.ljf.duoduo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mulin.ljf.duoduo.R;
import com.mulin.ljf.duoduo.utils.RxBus;
import com.mulin.ljf.duoduo.view.AutoLoadMoreRecyclerView;
import com.mulin.ljf.duoduo.view.ThreePointLoadingView;
import com.mulin.ljf.duoduo.view.refresh.RefreshLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observable;
import rx.functions.Action1;

/**
 * Created by mulin on 16/9/14.
 */



public class NewsFragment extends Fragment {

    @Bind(R.id.refresh_layout)
    RefreshLayout refreshLayout;
    @Bind(R.id.recycler_view)
    AutoLoadMoreRecyclerView recyclerView;
    @Bind(R.id.tpl_view)
    ThreePointLoadingView pointLoadingView;
    View mFragmentRootView;
    /**
     * 监听AppbarLayout偏移量
     */
    private Observable<Object> mAppbarOffsetObservable;
    // 标示当前Fragment所在的Activity是否可见
    private boolean mIsStop;
    // 一般作为ViewPager承载的Fragment都会把位置索引传过来，这里放到基类，
    // 方便下面的initRefreshLayoutOrRecyclerViewEvent()方法处理订阅事件
    protected int mPosition;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentRootView = inflater.inflate(R.layout.fragment_newslist,container);
        ButterKnife.bind(this,mFragmentRootView);
        initRefreshLayoutOrRecyclerViewEvent();
        return mFragmentRootView;
    }

    /**
     * 订阅事件处理RefreshLayout
     */
    private void initRefreshLayoutOrRecyclerViewEvent() {

        mAppbarOffsetObservable = RxBus.get()
                .register("enableRefreshLayoutOrScrollRecyclerView", Object.class);
        mAppbarOffsetObservable.subscribe(new Action1<Object>() {
            @Override
            public void call(Object obj) {
                if (obj instanceof Integer) {
                    if (!mIsStop && recyclerView != null && (Integer) obj == mPosition) {
                        // 当前Fragment所在的Activity可见并且是选中的Fragment才处理事件
                        recyclerView.smoothScrollToPosition(0);
                    }
                } else if (obj instanceof Boolean) {
                    refreshLayout.setRefreshable((Boolean) obj);
                }
            }
        });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        RxBus.get().unregister("enableRefreshLayoutOrScrollRecyclerView", mAppbarOffsetObservable);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ViewGroup parent = (ViewGroup) mFragmentRootView.getParent();
        if (null != parent) {
            parent.removeView(mFragmentRootView);
        }
    }
    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        mIsStop = true;
    }

    @Override
    public void onResume() {
        super.onResume();
        mIsStop = false;
    }
}
