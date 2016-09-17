package com.mulin.ljf.duoduo.rxJava.service;

import com.mulin.ljf.duoduo.model.User;
import com.mulin.ljf.duoduo.rxJava.entity.HttpResult;
import com.mulin.ljf.duoduo.rxJava.entity.SchoolModel;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by mulin on 16/9/11.
 */
public interface BaseService {
    @POST("schoolApi/index.html")
    Observable<HttpResult<List<SchoolModel>>> getSchoolsInfo();
    @GET("schoolApi/index.html")
    Observable<HttpResult<List<SchoolModel>>> getSchoolsInfo(@Query("start") int start, @Query("count") int count);

    @FormUrlEncoded @POST("siteApi/loginApi.html")
    Observable<HttpResult<String>> getLoginStatus(@Field("LoginForm[username]")String username,
                                                @Field("LoginForm[password]") String password,
                                                @Field("role")String role, @Field("deviceId")String deviceId);
    @POST("siteApi/loginApi.html")
    Observable<HttpResult<String>> getLoginStatus();

}
