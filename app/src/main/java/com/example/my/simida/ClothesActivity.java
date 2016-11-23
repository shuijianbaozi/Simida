package com.example.my.simida;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.my.simida.base.BaseActivity;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.config.UrlConfig;
import com.example.my.simida.fragment.ClothesFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClothesActivity extends BaseActivity {
    @BindView(R.id.framelayout_clothes)
    FrameLayout framelayoutClothes;
    @BindView(R.id.textview_counsel_clothes)
    TextView textviewCounselClothes;
    @BindView(R.id.textview_brand_clothes)
    TextView textviewBrandClothes;
    @BindView(R.id.btn_joincart_clothes)
    Button btnJoincartClothes;
    @BindView(R.id.btn_buy_clothes)
    Button btnBuyClothes;
    @BindView(R.id.linearlayout_clothes)
    LinearLayout linearlayoutClothes;
    private Context mContext = null;
    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);
        ButterKnife.bind(this);

        initFragment();
    }

    private void initFragment() {
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(ConstantString.CLOTHES_ID, 0);
        String clothesUrl = UrlConfig.CLOTHES_ID + intExtra;
        mFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framelayout_clothes, ClothesFragment.newInstance(clothesUrl), "ClothesFragment");
        fragmentTransaction.commit();
    }
}
