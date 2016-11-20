package com.example.my.simida.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.my.simida.R;
import com.example.my.simida.bean.shopdata.HotTrendListBean;
import com.example.my.simida.bean.shopdata.MdPrdListBean;
import com.example.my.simida.bean.shopdata.MdRecommandBean;
import com.example.my.simida.bean.shopdata.PopPrdListBean;
import com.example.my.simida.bean.shopdata.ShopBean;
import com.example.my.simida.bean.shopdata.ShopDataBean;
import com.example.my.simida.http.HttpUtils;
import com.example.my.simida.ui.adapter.RvChaoliuAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ShopDataActivity extends AppCompatActivity {

    @BindView(R.id.iv_shopdata_toolbar_name)
    TextView ivShopdataToolbarName;
    @BindView(R.id.iv_shopdata_top_logo)
    ImageView ivShopdataTopLogo;
    @BindView(R.id.tv_shopdata_top_spname)
    TextView tvShopdataTopSpname;
    @BindView(R.id.tv_shopdata_style)
    TextView tvShopdataStyle;
    @BindView(R.id.tv_shopdata_subcnt)
    TextView tvShopdataSubcnt;
    @BindView(R.id.tv_shopdata_avrdate)
    TextView tvShopdataAvrdate;
    @BindView(R.id.tv_shopdata_pinpai)
    TextView tvShopdataPinpai;
    @BindView(R.id.tv_shopdata_care)
    TextView tvShopdataCare;
    @BindView(R.id.rv_shopdata_chaoliu)
    RecyclerView rvShopdataChaoliu;
    @BindView(R.id.rv_shopdata_reqi)
    RecyclerView rvShopdataReqi;
    @BindView(R.id.rv_shopdata_maishou)
    RecyclerView rvShopdataMaishou;
    @BindView(R.id.activity_shop_data)
    CoordinatorLayout activityShopData;
    RvChaoliuAdapter mChaoliuAdapter;
    private Context mContext = this;
    private List<HotTrendListBean> mHotTrendListBeens = new ArrayList<>();
    private List<MdPrdListBean> mMdPrdListBean = new ArrayList<>();
    private List<MdRecommandBean> mMdRecommandBeen = new ArrayList<>();
    private List<ShopBean> mShopBean = new ArrayList<>();
    private List<PopPrdListBean> mPoprdListBean = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_data);
        ButterKnife.bind(this);
        initView();
        getJson();
    }

    private void initView() {
        mChaoliuAdapter = new RvChaoliuAdapter(mContext, mHotTrendListBeens);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 1, OrientationHelper.HORIZONTAL, false);
        rvShopdataChaoliu.setAdapter(mChaoliuAdapter);
        rvShopdataChaoliu.setLayoutManager(gridLayoutManager);
    }

    private void getJson() {
        String url = "http://www.thestylewish.com/asia/api/brandshop/shopData.do?shop_no=10000155&prd_no=&sort_type=02&list_size=60&page_no=1";
        HttpUtils.newInstance().getShopDataBean(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ShopDataBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("error", "" + e.toString());
                    }

                    @Override
                    public void onNext(ShopDataBean shopDataBean) {
                        List<HotTrendListBean> hotTrendList = shopDataBean.getResult().getHotTrendList();
                        mHotTrendListBeens.addAll(hotTrendList);
                        mChaoliuAdapter.notifyDataSetChanged();
                    }
                });


    }


}
