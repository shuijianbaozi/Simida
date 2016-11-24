package com.example.my.simida;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.my.simida.base.BaseActivity;
import com.example.my.simida.bean.ShopDataCarBean;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.config.UrlConfig;
import com.example.my.simida.fragment.ClothesFragment;
import com.example.my.simida.utils.ToastUtils;
import com.example.my.simida.utils.UIManager;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

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
    private Context mContext = this;
    private FragmentManager mFragmentManager;
    private int mItemCount = 1;
    private ShopDataCarBean shopBean = null;
    private String buffer = null;
    private ClothesFragment clothesFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);
        ButterKnife.bind(this);

        initFragment();

        initShopcar();
    }

    private void initShopcar() {
        btnBuyClothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UIManager.startShopCar(mContext);
            }
        });
    }

    private void initFragment() {
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(ConstantString.CLOTHES_ID, 0);
        String clothesUrl = UrlConfig.CLOTHES_ID + intExtra;

        clothesFragment = ClothesFragment.newInstance(clothesUrl);

        mFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framelayout_clothes, clothesFragment, "ClothesFragment");
        fragmentTransaction.commit();
        btnJoincartClothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shopBean = clothesFragment.getShopBean();
                if (shopBean != null) {
                    if (buffer != null) {
                        shopBean.setItemcount(mItemCount);
                        shopBean.update(buffer, new UpdateListener() {
                            @Override
                            public void done(BmobException e) {
                                if (e == null) {
//                                    ToastUtils.showTost(mContext, "添加成功，当前商品数为=" + mItemCount);
//                                    runOnUiThread(new Runnable() {
//                                        @Override
//                                        public void run() {
//                                            ToastUtils.showTost(mContext, "添加成功，当前商品数为=" + mItemCount);
//                                        }
//                                    });
                                    mItemCount++;
                                } else {
                                    ToastUtils.showTost(mContext, "添加失败");
                                }
                            }
                        });
                    } else {
                        shopBean.save(new SaveListener<String>() {
                            @Override
                            public void done(String s, BmobException e) {
                                if (e == null) {
                                    mItemCount++;
                                    buffer = s;

                                } else {
                                }
                            }
                        });
                    }
                } else {
                    ToastUtils.showTost(mContext, "请在等等哦~");
                }
            }
        });

    }

}
//                                shopBean.setItemcount(mItemCount + "");
//                                shopBean.update(buffer, new UpdateListener() {
//                                    @Override
//                                    public void done(BmobException e) {
//                                        if (e == null) {
//                                            ToastUtils.showTost(mContext, "添加成功，当前商品数为=" + mItemCount);
//                                            mItemCount++;
//                                        } else {
//                                        }
//                                    }
//                                });
