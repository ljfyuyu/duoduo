package com.mulin.ljf.duoduo.rxJava.http;

/**
 * ClassName: NewsApi<p>
 * Fuction: 请求接口<p>
 */
public class Api {

    /**
     * 哆哆主页url
     */
    public static final String NETDUODUO_HOST = "http://duoduo.1366768.com/";


    /**
     * 天气预报url
     */
    public static final String WEATHER_HOST = "http://wthrcdn.etouch.cn/";



    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        switch (hostType) {
            case HostType.DUODUO_INFO:
                return Api.NETDUODUO_HOST;
            case HostType.WEATHER_INFO:
                return Api.WEATHER_HOST;
        }
        return "";
    }

}
