package com.example.pby.pagingdemo;


import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Service {


    @POST("getSongPoetry")
    @FormUrlEncoded
    Observable<Bean> getCall(@Field("page") int page, @Field("count") int count);
}
