package com.mulin.ljf.duoduo.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.mulin.ljf.duoduo.R;
import com.mulin.ljf.duoduo.base.BaseActivity;
import com.mulin.ljf.duoduo.base.BaseFragment;
import com.mulin.ljf.duoduo.base.BaseFragmentAdapter;
import com.mulin.ljf.duoduo.base.NewsFragment;
import com.mulin.ljf.duoduo.base.OnTabSelectedListenerAdapter;
import com.mulin.ljf.duoduo.utils.RxBus;
import com.mulin.ljf.duoduo.utils.ViewUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.tabs)
    TabLayout tabLayout;
    @Bind(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTheme();
        setContentView(R.layout.activity_main_ui);
    }

    /**
     * 初始化主题
     */
    private void initTheme() {
        if (this instanceof MainActivity) {
            setTheme( R.style.BaseAppTheme);
        }
    }

    public void initViewPager() {


        List<BaseFragment> fragments = new ArrayList<>();
        final List<String> title = new ArrayList<>();
        title.add("社团活动");
        title.add("讲座信息");
        title.add("比赛信息");

        if (viewPager.getAdapter() == null) {
            // 初始化ViewPager
            BaseFragmentAdapter adapter = new BaseFragmentAdapter(getSupportFragmentManager(),
                    fragments, title);
            viewPager.setAdapter(adapter);
        } else {
            final BaseFragmentAdapter adapter = (BaseFragmentAdapter) viewPager.getAdapter();
            adapter.updateFragments(fragments, title);
        }
        viewPager.setCurrentItem(0, false);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setScrollPosition(0, 0, true);
        // 根据Tab的长度动态设置TabLayout的模式
        ViewUtil.dynamicSetTabLayoutMode(tabLayout);

        setOnTabSelectEvent(viewPager, tabLayout);

    }

    /**
     * 用户已选择tab的情况再次点击该tab，列表返回顶部，需要在setupWithViewPager后设置比如监听会把覆盖
     *
     * @param viewPager
     * @param tabLayout TabLayout
     */
    protected void setOnTabSelectEvent(final ViewPager viewPager, final TabLayout tabLayout) {
        tabLayout.setOnTabSelectedListener(new OnTabSelectedListenerAdapter() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(), true);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                RxBus.get().post("enableRefreshLayoutOrScrollRecyclerView", tab.getPosition());
            }
        });
    }
}
