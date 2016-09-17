package com.mulin.ljf.duoduo.rxJava.http;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ClassName: HostType<p>
 * Fuction: 请求数据host的类型<p>
 * UpdateUser:<p>
 * UpdateDate:<p>
 */
public class HostType {

    /**
     * 多少种Host类型
     */
    public static final int TYPE_COUNT = 2;

    /**
     * 哆哆主页的host
     */
    @HostTypeChecker
    public static final int DUODUO_INFO = 1;



    /**
     * 天气查询的host
     */
    @HostTypeChecker
    public static final int WEATHER_INFO = 2;

    /**
     * 替代枚举的方案，使用IntDef保证类型安全
     */
    @IntDef({DUODUO_INFO, WEATHER_INFO})
    @Retention(RetentionPolicy.SOURCE)
    public @interface HostTypeChecker {

    }

}
