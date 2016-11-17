package com.example.my.simida.http;

import com.example.my.simida.bean.brandfragment.BrandBean;
import com.example.my.simida.config.UrlConfig;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by apple on 16/11/14.
 */

public class HttpUtils {

    //1 私有构造器
    //2 私有的静态的对象
    //3 公开的静态的方法


    //使用Retrofit的步骤
    //1 接口
    //2 实例化retrofit
    //3 实例化接口
    //4 使用接口调用方法
    private Retrofit mRetrofit;
    private IApi mApi;

    private HttpUtils() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(UrlConfig.URL_BASE_TLC)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mApi = mRetrofit.create(IApi.class);
    }

    private static HttpUtils mHttpUtils;

    public synchronized static HttpUtils newInstance() {
        if (mHttpUtils == null) {
            mHttpUtils = new HttpUtils();
        }
        return mHttpUtils;
    }


    public Observable<BrandBean> getBrandBean(String brandurl) {
        return mApi.getBrandBean(brandurl);
    }

}
