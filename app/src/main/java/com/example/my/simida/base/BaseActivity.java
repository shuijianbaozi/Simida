package com.example.my.simida.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cn.bmob.v3.Bmob;

/**
 * Created by apple on 16/11/14.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bmob.initialize(this, "5ff2c0f6c19fc726861928c81bc7b72c");
    }
}
