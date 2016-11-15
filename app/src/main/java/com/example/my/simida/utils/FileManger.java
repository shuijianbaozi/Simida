package com.example.my.simida.utils;

import android.os.Environment;

import com.example.my.simida.App;

import java.io.File;

/**
 * Created by apple on 16/11/15.
 */

public class FileManger {
    public static File getRootCacheFile() {
        if (Environment.getExternalStorageDirectory()
                .equals(Environment.MEDIA_MOUNTED)) {
            return App.mApp.getExternalCacheDir();
        } else {
            return App.mApp.getCacheDir();
        }
    }

    public static File getImageCacheFile() {
        return new File(getRootCacheFile(), "image");
    }

    public static File getHttpCache() {
        return new File(getRootCacheFile(), "http") {
        };
    }
}
