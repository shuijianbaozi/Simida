package com.example.my.simida.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.App;
import com.example.my.simida.R;
import com.example.my.simida.base.BaseActivity;
import com.example.my.simida.bean.shopdata.HotTrendListBean;
import com.example.my.simida.bean.shopdata.MdPrdListBean;
import com.example.my.simida.bean.shopdata.MdRecommandBean;
import com.example.my.simida.bean.shopdata.PopPrdListBean;
import com.example.my.simida.bean.shopdata.ShopBean;
import com.example.my.simida.bean.shopdata.ShopDataBean;
import com.example.my.simida.bean.shopdata.ShopPrdListBean;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.http.HttpUtils;
import com.example.my.simida.ui.adapter.RvChaoliuAdapter;
import com.example.my.simida.ui.adapter.RvListAdapter;
import com.example.my.simida.ui.adapter.RvMaishouAdapter;
import com.example.my.simida.ui.adapter.RvRenqiAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ShopDataActivity extends BaseActivity {

    private static final String TAG = "imgurl";
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
    @BindView(R.id.rv_shopdata_list)
    RecyclerView rvShopdataList;
    @BindView(R.id.iv_shopdata_bg)
    ImageView ivShopdataBg;
    private Context mContext = this;
    private List<HotTrendListBean> mHotTrendListBeens = new ArrayList<>();
    private List<MdPrdListBean> mMdPrdListBean = new ArrayList<>();
    private List<MdRecommandBean> mMdRecommandBeen = new ArrayList<>();
    private List<ShopBean> mShopBean = new ArrayList<>();
    private List<PopPrdListBean> mPoprdListBean = new ArrayList<>();
    private List<ShopPrdListBean> mShopPrdListBean = new ArrayList<>();

    private RvRenqiAdapter mRenqiAdapter;
    private RvMaishouAdapter mMaishouAdapter;
    private RvListAdapter mRvListAdapter;
    //人气Recycle 的监听器
    RvRenqiAdapter.IOnRenqiClickListener mRenqiClickListener = new RvRenqiAdapter.IOnRenqiClickListener() {
        @Override
        public void onItemClick(int shopId) {

        }

        @Override
        public void onItemLongClick(int position) {

        }
    };
    //买手Recycle 的监听器
    RvMaishouAdapter.IOnMaiShouClickListener mMaiShouClickListener = new RvMaishouAdapter.IOnMaiShouClickListener() {
        @Override
        public void onItemClick(int shopId) {

        }

        @Override
        public void onItemLongClick(int position) {

        }
    };
    RvListAdapter.IOnListClickListener mListClickListener = new RvListAdapter.IOnListClickListener() {
        @Override
        public void onItemClick(int shopId) {

        }

        @Override
        public void onItemLongClick(int position) {

        }
    };

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
        //人气
        mRenqiAdapter = new RvRenqiAdapter(mContext, mPoprdListBean, mRenqiClickListener);
        rvShopdataReqi.setAdapter(mRenqiAdapter);
        GridLayoutManager gridLayoutManagerRenqi = new GridLayoutManager(mContext, 3, OrientationHelper.VERTICAL, false);
        rvShopdataReqi.setLayoutManager(gridLayoutManagerRenqi);
        //买手推荐
        mMaishouAdapter = new RvMaishouAdapter(mContext, mMdPrdListBean, mMaiShouClickListener);
        rvShopdataMaishou.setAdapter(mMaishouAdapter);
        GridLayoutManager gridLayoutManagerMaishou = new GridLayoutManager(mContext, 3, OrientationHelper.VERTICAL, false);
        rvShopdataMaishou.setLayoutManager(gridLayoutManagerMaishou);
        //商店列表
        mRvListAdapter = new RvListAdapter(mContext, mShopPrdListBean, mListClickListener);
        rvShopdataList.setAdapter(mRvListAdapter);
        GridLayoutManager gridLayoutManagerList = new GridLayoutManager(mContext, 2, OrientationHelper.VERTICAL, false);

        rvShopdataList.setLayoutManager(gridLayoutManagerList);
    }

    private void getJson() {
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(ConstantString.SHOPDATA_SHOPNO, 0);
        String url = ConstantString.SHOPDATA_INTENT_URL_BEFORE + intExtra + ConstantString.SHOPDATA_INTENT_URL_NEXT;
        Log.e("ShopDATA", url);
//        String url = "http://www.thestylewish.com/asia/api/brandshop/shopData.do?shop_no=10000155&prd_no=&sort_type=02&list_size=60&page_no=1";
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
                        getList(shopDataBean);
                    }
                });


    }

    private void getList(ShopDataBean shopDataBean) {
        //潮流
        List<HotTrendListBean> hotTrendList = shopDataBean.getResult().getHotTrendList();
        mHotTrendListBeens.addAll(hotTrendList);
        //人气
        List<PopPrdListBean> popPrdListBeen = shopDataBean.getResult().getPopPrdList();
        mPoprdListBean.addAll(popPrdListBeen);
        PopPrdListBean popPrdListBean = mPoprdListBean.get(0);

        //买手
        List<MdPrdListBean> mdPrdList = shopDataBean.getResult().getMdRecommand().getMdPrdList();
        mMdPrdListBean.addAll(mdPrdList);
        //列表
        List<ShopPrdListBean> shopPrdList = shopDataBean.getResult().getShopPrdList();
        mShopPrdListBean.addAll(shopPrdList);
        //商店列表
        ShopBean shop = shopDataBean.getResult().getShop();
        mShopBean.add(shop);

        mChaoliuAdapter.notifyDataSetChanged();
        mRenqiAdapter.notifyDataSetChanged();
        mMaishouAdapter.notifyDataSetChanged();
        mRvListAdapter.notifyDataSetChanged();
        initTop();
    }

    private void initTop() {
        ShopBean shopBean = mShopBean.get(0);
        tvShopdataSubcnt.setText(shopBean.getSubsCnt() + "");
        tvShopdataStyle.setText(shopBean.getShopStyle());
        tvShopdataTopSpname.setText(shopBean.getBrandNm());
        tvShopdataAvrdate.setText(shopBean.getAvrDeliDate() + "");
        String brandLogo = shopBean.getBrandLogo();
        Log.e(TAG, "initTop:" + App.getFinalUrl(brandLogo, 96, 96));
        Glide.with(mContext).load(App.getFinalUrlSmall(App.getFinalUrl(brandLogo, 96, 96))).into(ivShopdataTopLogo);
        Glide.with(mContext).load(App.getFinalUrlSmall(App.getFinalUrl(shopBean.getBgImg(), 200, 200))).into(ivShopdataBg);

    }


}
