package com.example.my.simida.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.my.simida.App;
import com.example.my.simida.R;
import com.example.my.simida.base.BaseFragment;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.ui.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment {
    @BindView(R.id.btn_start_my)
    Button btnStartMy;
    @BindView(R.id.text_up_my)
    TextView textUpMy;
    @BindView(R.id.text_down_my)
    TextView textDownMy;
    @BindView(R.id.tv_my_showinfo)
    TextView tvMyShowinfo;
    @BindView(R.id.relative_header)
    RelativeLayout relativeHeader;
    @BindView(R.id.imageview_mileage_my)
    ImageView imageviewMileageMy;
    @BindView(R.id.imageview_coupon_my)
    ImageView imageviewCouponMy;
    @BindView(R.id.imageview_cart_my)
    ImageView imageviewCartMy;
    @BindView(R.id.imageview_corder_my)
    ImageView imageviewCorderMy;
    @BindView(R.id.linearlayout_icon_my)
    LinearLayout linearlayoutIconMy;
    @BindView(R.id.linearlayout_word_my)
    LinearLayout linearlayoutWordMy;
    @BindView(R.id.collapsingtoolbarlayout_my)
    CollapsingToolbarLayout collapsingtoolbarlayoutMy;
    @BindView(R.id.appbarlayout_my)
    AppBarLayout appbarlayoutMy;
    private boolean mLoginTrue;
    private String mUsername;
    private String mPsw;
    private Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        ButterKnife.bind(this, view);
        initButton();

        return view;
    }

    private void initData() {
        mUsername = App.APP_username;
        mPsw = App.APP_psw;
    }

    public static MyFragment newInstance() {
        MyFragment myFragment = new MyFragment();
        Bundle args = new Bundle();
        myFragment.setArguments(args);
        return myFragment;
    }

    private void initButton() {
        btnStartMy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        initData();
        isLoginTrue();

    }

    public void isLoginTrue() {
        boolean isLogin = App.isLogin;
        Log.e("log", "" + App.isLogin);
        if (isLogin) {
            btnStartMy.setVisibility(View.GONE);
            tvMyShowinfo.setVisibility(View.INVISIBLE);
            tvMyShowinfo.setText(mUsername + "级别 黄金1" + "\n");
            tvMyShowinfo.setTextSize(20);

        }
    }
}
