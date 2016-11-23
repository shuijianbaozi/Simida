package com.example.my.simida;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.my.simida.base.BaseActivity;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.config.UrlConfig;
import com.example.my.simida.fragment.ClothesFragment;

public class ClothesActivity extends BaseActivity {
    private Context mContext = null;
    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        initFragment();
    }

    private void initFragment() {
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(ConstantString.CLOTHES_ID, 0);
        String clothesUrl= UrlConfig.CLOTHES_ID+intExtra;
        mFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framelayout_clothes, ClothesFragment.newInstance(clothesUrl), "ClothesFragment");
        fragmentTransaction.commit();
    }
}
