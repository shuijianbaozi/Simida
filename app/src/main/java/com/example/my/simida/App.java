package com.example.my.simida;

import android.app.Application;

/**
 * Created by My on 2016/11/15.
 */

public class App extends Application {
    public static App mApp;

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
