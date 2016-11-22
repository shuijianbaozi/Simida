package com.example.my.simida.http;

import com.example.my.simida.bean.brandfragment.BrandBean;
import com.example.my.simida.bean.findfragment.FindBean;
import com.example.my.simida.bean.shopdata.HotTrendListBean;
import com.example.my.simida.bean.shopdata.ShopDataBean;
import com.example.my.simida.bean.typefragment.TypeBean;

import com.example.my.simida.bean.firstpagefragment.CountInfo;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by apple on 16/11/14.
 */

public interface IApi {
    @GET
    Observable<BrandBean> getBrandBean(@Url() String url);

    @GET
    Observable<CountInfo> getCountInfo(@Url() String url);

    @GET
    Observable<TypeBean> getTypeBean(@Url() String url);

    @GET
    Observable<ShopDataBean> getShopDataBean(@Url() String url);

    @GET
    Observable<FindBean> getFindBean(@Url() String url);
}