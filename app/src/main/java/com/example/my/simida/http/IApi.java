package com.example.my.simida.http;

import com.example.my.simida.bean.brandfragment.BrandBean;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by apple on 16/11/14.
 */

public interface IApi {
    @GET
    Observable<BrandBean> getBrandBean(@Url() String url);

}
