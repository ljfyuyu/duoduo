package com.mulin.ljf.duoduo.rxJava.service;

import com.mulin.ljf.duoduo.rxJava.entity.HttpResult;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by mulin on 16/9/12.
 */
public interface StringService {

    @FormUrlEncoded
    @POST("siteApi/loginApi.html")
    Observable<HttpResult<String>> getLoginStatus(@Field("LoginForm[username]")String username,
                                                  @Field("LoginForm[password]") String password,
                                                  @Field("role")String role, @Field("deviceId")String deviceId);
}
