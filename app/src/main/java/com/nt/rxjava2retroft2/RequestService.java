package com.nt.rxjava2retroft2;

import com.google.gson.JsonObject;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * HuangPengHua
 * 2019-04-08
 */
public interface RequestService {
    String BASE_URL = "https://news-at.zhihu.com/api/4/";

    @GET("news/latest")
    Observable<JsonObject> getNews();

}
