package com.mulin.ljf.duoduo;

import android.app.Application;
import android.content.Context;

import com.mulin.ljf.duoduo.common.ProDemoContext;

/**
 * Created by mulin on 16/9/12.
 */
public class DuoApplication extends Application {

    ProDemoContext mContext;
    private static Context sApplicationContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = ProDemoContext.getInstance();
        mContext.init(this);
        sApplicationContext = this;
    }

    // 获取ApplicationContext
    public static Context getContext() {
        return sApplicationContext;
    }
}
