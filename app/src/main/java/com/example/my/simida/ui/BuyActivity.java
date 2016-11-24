package com.example.my.simida.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.my.simida.R;
import com.example.my.simida.bean.BuyBean;
import com.example.my.simida.bean.ShopDataCarBean;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.ui.adapter.RvBuyGoodsListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BuyActivity extends AppCompatActivity {

    @BindView(R.id.tv_buy_num)
    TextView tvBuyNum;
    @BindView(R.id.buybuybuy)
    Button buybuybuy;
    @BindView(R.id.activity_buy)
    LinearLayout activityBuy;
    @BindView(R.id.rc_buy)
    RecyclerView rcBuy;
    private Context mContext = this;
    private List<ShopDataCarBean> mListCarBean = new ArrayList<>();
    private RvBuyGoodsListAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        ButterKnife.bind(this);
        initData();
        initRecycle();
    }

    private void initData() {
        mListCarBean.addAll(((BuyBean) (getIntent()
                .getBundleExtra(ConstantString.BUY_BUNDLE_KRY)
                .getParcelable(ConstantString.BUY_KRY)))
                .getShopDataCarBeen());

    }

    private void initRecycle() {
        LinearLayoutManager manager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
        adapter = new RvBuyGoodsListAdapter(mContext, mListCarBean);
        rcBuy.setAdapter(adapter);
        rcBuy.setLayoutManager(manager);
    }
}
