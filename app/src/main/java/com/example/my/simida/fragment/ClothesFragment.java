package com.example.my.simida.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.App;
import com.example.my.simida.R;
import com.example.my.simida.adapter.Popular_Recycler_Adapter;
import com.example.my.simida.base.BaseFragment;
import com.example.my.simida.bean.goodsdata.DescriptionBean;
import com.example.my.simida.bean.goodsdata.GoodsBean;
import com.example.my.simida.bean.goodsdata.PopularBean;
import com.example.my.simida.bean.goodsdata.ProductBean;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.http.HttpUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClothesFragment extends BaseFragment {

    @BindView(R.id.imageview_clothesactivity)
    ImageView imageviewClothesactivity;
    @BindView(R.id.collapsingtoolbar_clothes)
    CollapsingToolbarLayout collapsingtoolbarClothes;
    @BindView(R.id.appbarlayout_clothes)
    AppBarLayout appbarlayoutClothes;
    @BindView(R.id.textview_name_clothes)
    TextView textviewNameClothes;
    @BindView(R.id.textview_price_clothes)
    TextView textviewPriceClothes;
    @BindView(R.id.textview_explan_clothes)
    TextView textviewExplanClothes;
    @BindView(R.id.textview_explan_item1)
    TextView textviewExplanItem1;
    @BindView(R.id.textview_explan_item2)
    TextView textviewExplanItem2;
    @BindView(R.id.textview_explan_item3)
    TextView textviewExplanItem3;
    @BindView(R.id.textview_explan_info1)
    TextView textviewExplanInfo1;
    @BindView(R.id.textview_explan_info2)
    TextView textviewExplanInfo2;
    @BindView(R.id.textview_explan_info3)
    TextView textviewExplanInfo3;
    @BindView(R.id.textview_popular_clothes)
    TextView textviewPopularClothes;
    @BindView(R.id.recyclerview_clothes)
    RecyclerView recyclerviewClothes;
    @BindView(R.id.textview_know_clothes)
    TextView textviewKnowClothes;
    @BindView(R.id.imageview_shipping_info1)
    ImageView imageviewShippingInfo1;
    @BindView(R.id.imageview_shipping_line1)
    ImageView imageviewShippingLine1;
    @BindView(R.id.imageview_shipping_info2)
    ImageView imageviewShippingInfo2;
    @BindView(R.id.imageview_shipping_line2)
    ImageView imageviewShippingLine2;
    @BindView(R.id.imageview_shipping_info3)
    ImageView imageviewShippingInfo3;
    @BindView(R.id.imageview_shipping_line3)
    ImageView imageviewShippingLine3;
    @BindView(R.id.imageview_shipping_info4)
    ImageView imageviewShippingInfo4;
    @BindView(R.id.imageview_shipping_line4)
    ImageView imageviewShippingLine4;
    @BindView(R.id.imageview_shipping_info5)
    ImageView imageviewShippingInfo5;
    @BindView(R.id.linearlayout_send_clothes)
    LinearLayout linearlayoutSendClothes;
    @BindView(R.id.textview_payline1)
    TextView textviewPayline1;
    @BindView(R.id.textview_payline2)
    TextView textviewPayline2;
    @BindView(R.id.textview_payline3)
    TextView textviewPayline3;
    @BindView(R.id.textview_payline4)
    TextView textviewPayline4;
    @BindView(R.id.textview_payline5)
    TextView textviewPayline5;
    @BindView(R.id.linearlayout_sendtextview_clothes)
    LinearLayout linearlayoutSendtextviewClothes;

    private String mclothesUrl = null;

    private Context mContext = null;
    private Popular_Recycler_Adapter mPopular_recycler_adapter;

    //Bean的集合
    private List<PopularBean> mPopularBeanList = new ArrayList<>();
    private List<DescriptionBean> mDescriptionBeanList = new ArrayList<>();
    private List<ProductBean> mProductBeanList = new ArrayList<>();

    Popular_Recycler_Adapter.IOnItemClickListener itemClickListener = new Popular_Recycler_Adapter.IOnItemClickListener() {
        @Override
        public void onItemClick(int position) {

        }
    };

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    public static ClothesFragment newInstance(String dataid) {
        ClothesFragment clothesFragment = new ClothesFragment();
        Bundle args = new Bundle();
        args.putString(ConstantString.CLOTHES_ID, dataid);
        clothesFragment.setArguments(args);
        return clothesFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        mclothesUrl = bundle.getString(ConstantString.CLOTHES_ID);
        View view = inflater.inflate(R.layout.fragment_clothes, container, false);
        ButterKnife.bind(this, view);
        TextPaint tp = textviewExplanClothes.getPaint();
        tp.setFakeBoldText(true);
        TextPaint tp1 = textviewPopularClothes.getPaint();
        tp1.setFakeBoldText(true);
        TextPaint tp2 = textviewKnowClothes.getPaint();
        tp2.setFakeBoldText(true);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //RecyclerView
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 1, OrientationHelper.HORIZONTAL, false);
        recyclerviewClothes.setLayoutManager(gridLayoutManager);
        mPopular_recycler_adapter = new Popular_Recycler_Adapter(mContext, mPopularBeanList, itemClickListener);
        recyclerviewClothes.setAdapter(mPopular_recycler_adapter);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //json串
//        String popopularUrl = "http://www.thestylewish.com/asia/api/product/v2/productDetailData.do?target_width=600&prd_no=10420338";
        String popopularUrl = mclothesUrl;
        HttpUtils.newInstance().getGoodsBean(popopularUrl)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GoodsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(GoodsBean goodsBean) {
                        getList(goodsBean);
                    }
                });
    }

    private void getList(GoodsBean goodsBean) {
        List<PopularBean> popularBeen = goodsBean.getResult().getPopular();
        mPopularBeanList.clear();
        mPopularBeanList.addAll(popularBeen);
        mPopular_recycler_adapter.notifyDataSetChanged();

        ProductBean product = goodsBean.getResult().getProduct();
        mProductBeanList.add(product);

        goodsBean.getResult().getProduct().getMainImgUrl();
        ProductBean productBean = mProductBeanList.get(0);
        Glide.with(mContext).load(getFinalUrl(productBean.getMainImgUrl(), 450, 300)).into(imageviewClothesactivity);


        goodsBean.getResult().getProduct().getPrdNm();
        String textview_name = mProductBeanList.get(0).getPrdNm();
        textviewNameClothes.setText(textview_name);

        goodsBean.getResult().getProduct().getSalePrice();
        double textview_price = mProductBeanList.get(0).getSalePrice();
        textviewPriceClothes.setText(textview_price + "");

        List<DescriptionBean> description = goodsBean.getResult().getDescription();
        mDescriptionBeanList.addAll(description);

        description.get(0).getDescInfo();
        String textview_info1 = mDescriptionBeanList.get(0).getDescInfo();
        textviewExplanInfo1.setText(textview_info1);
        description.get(0).getDescItem();
        String textview_item1 = mDescriptionBeanList.get(0).getDescItem();
        textviewExplanItem1.setText(textview_item1);


        description.get(1).getDescInfo();
        String textview_info2 = mDescriptionBeanList.get(1).getDescInfo();
        textviewExplanInfo2.setText(textview_info2);
        description.get(1).getDescItem();
        String textview_item2 = mDescriptionBeanList.get(1).getDescItem();
        textviewExplanItem2.setText(textview_item2);


        description.get(2).getDescInfo();
        String textview_info3 = mDescriptionBeanList.get(2).getDescInfo();
        textviewExplanInfo3.setText(textview_info3);
        description.get(2).getDescItem();
        String textview_item3 = mDescriptionBeanList.get(2).getDescItem();
        textviewExplanItem3.setText(textview_item3);
    }

    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
