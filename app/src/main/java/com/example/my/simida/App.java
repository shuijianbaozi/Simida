package com.example.my.simida;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by My on 2016/11/15.
 */

public class App extends Application {
    public static App mApp;
    public static boolean isLogin=false;
    public static String APP_username;
    public static String APP_psw;
    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }
    public static String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
