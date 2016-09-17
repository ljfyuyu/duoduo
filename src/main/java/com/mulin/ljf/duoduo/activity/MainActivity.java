package com.mulin.ljf.duoduo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mulin.ljf.duoduo.R;
import com.mulin.ljf.duoduo.base.BaseActivity;

public class MainActivity extends AppCompatActivity {

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
}
