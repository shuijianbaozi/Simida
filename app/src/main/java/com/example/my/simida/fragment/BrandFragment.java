package com.example.my.simida.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.base.BaseFragment;
import com.example.my.simida.bean.brandfragment.BannerBean;
import com.example.my.simida.bean.brandfragment.BrandBean;
import com.example.my.simida.bean.brandfragment.RankingBean;
import com.example.my.simida.bean.brandfragment.RecommendBean;
import com.example.my.simida.bean.brandfragment.ShopListBean;
import com.example.my.simida.fragment.brandfragment.BrandRecycleSbAdapter;
import com.example.my.simida.fragment.brandfragment.BrandRvListAdapter;
import com.example.my.simida.fragment.brandfragment.ChaorenFragment;
import com.example.my.simida.fragment.brandfragment.IRvOnItemClickListener;
import com.example.my.simida.fragment.brandfragment.MypagerAdapter;
import com.example.my.simida.fragment.brandfragment.NvshenFragment;
import com.example.my.simida.fragment.brandfragment.RexiaoFragment;
import com.example.my.simida.fragment.brandfragment.YifaFragment;
import com.example.my.simida.http.HttpUtils;
import com.example.my.simida.utils.ToastUtils;
import com.example.my.simida.utils.UIManager;
import com.example.my.simida.wiget.MyItemAnimator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class BrandFragment extends BaseFragment implements View.OnClickListener {
    @BindView(R.id.iv_brand_top)
    ImageView ivBrandTop;
    @BindView(R.id.tv_brandframgment_jingxuan)
    TextView tvBrandframgmentJingxuan;
    @BindView(R.id.tv_fb_jing_left)
    ImageView tvFbJingLeft;
    @BindView(R.id.iv_fb_jing_left)
    ImageView ivFbJingLeft;
    @BindView(R.id.tv_fb_jing_center)
    ImageView tvFbJingCenter;
    @BindView(R.id.iv_fb_jing_center)
    ImageView ivFbJingCenter;
    @BindView(R.id.tv_fb_jing_right)
    ImageView tvFbJingRight;
    @BindView(R.id.iv_fb_jing_right)
    ImageView ivFbJingRight;
    @BindView(R.id.rv_fb_shangbiao)
    RecyclerView rvFbShangbiao;
    @BindView(R.id.vp_fb)
    ViewPager vpFb;
    @BindView(R.id.toolbarlayout_brand)
    CollapsingToolbarLayout toolbarlayoutBrand;
    @BindView(R.id.appbar_brand)
    AppBarLayout appbarBrand;
    @BindView(R.id.tv_fb_all)
    TextView tvFbAll;
    @BindView(R.id.tv_fb_nvzhaung)
    TextView tvFbNvzhaung;
    @BindView(R.id.tv_fb_shoes)
    TextView tvFbShoes;
    @BindView(R.id.tv_fb_nanzhuang)
    TextView tvFbNanzhuang;
    @BindView(R.id.tv_fb_child)
    TextView tvFbChild;
    @BindView(R.id.rv_fb_list)
    RecyclerView rvFbList;

    private Context mContext;
    //一堆需要用的集合
    private List<RankingBean> mlistRankings = new ArrayList<>();
    private List<BannerBean> mlistBanners = new ArrayList<>();
    private List<ShopListBean.CategoriesBean> mlistCategories = new ArrayList<>();
    private List<ShopListBean.ListBean> mlistLists = new ArrayList<>();
    private List<RecommendBean.NewListBean> mlistNews = new ArrayList<>();
    private List<RecommendBean.BrandListBean> mlistBrands = new ArrayList<>();
    private List<RecommendBean.OtherListBean> mlistOther = new ArrayList<>();
    private List<RecommendBean.BrandListBean> mlistrvsb = new ArrayList<>();
    private BrandRecycleSbAdapter adapter = null;
    //viewpager 的相关数据
    private List<Fragment> listFrangment = new ArrayList<>();
    private FragmentManager manager = null;
    private MypagerAdapter mypagerAdapter = null;
    private BrandRvListAdapter mRvListAdapter = null;
    private BrandRvListAdapter.IOnBrandListClickListener listClickListener = new BrandRvListAdapter.IOnBrandListClickListener() {


        @Override
        public void onLongClick(int shopId) {
            UIManager.startShopData(mContext, shopId);
        }

        @Override
        public void onGuanzhunClick(String shopName) {
            ToastUtils.showTost(mContext, "亲 你已经关注了 " + shopName + " 了呦");
        }


        //// TODO: 16/11/22 商品跳转
        @Override
        public void onPicClick(int position) {

            ToastUtils.showTost(mContext, "物品号" + position);
        }
    };

    IRvOnItemClickListener itemClickListener = new IRvOnItemClickListener() {
        @Override
        public void onItemClick(int shopId) {
            UIManager.startShopData(mContext, shopId);
        }

        @Override
        public void onItemLongClick(int position) {

        }
    };

    /**
     * context 赋值
     *
     * @param context
     */
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

        View view = inflater.inflate(R.layout.fragment_brand, container, false);
        ButterKnife.bind(this, view);
        String jingxuan = "<big><strong>精选推荐     </strong></big><small><i>不容错过的品牌</i></small>";
        tvBrandframgmentJingxuan.setText(Html.fromHtml(jingxuan));
        initTextlist();
        initRecycleSb();
        initRecycleList();
        getJson();
        initeframelayout();
        return view;
    }

    private void initeframelayout() {

    }

    /**
     * 增加 text 点击监听
     */
    private void initTextlist() {
        tvFbAll.setOnClickListener(this);
        tvFbChild.setOnClickListener(this);
        tvFbNanzhuang.setOnClickListener(this);
        tvFbNvzhaung.setOnClickListener(this);
        tvFbShoes.setOnClickListener(this);
    }

    private void initRecycleList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, OrientationHelper.VERTICAL, false);
        mRvListAdapter = new BrandRvListAdapter(mContext, mlistLists, listClickListener);
        rvFbList.setAdapter(mRvListAdapter);
        rvFbList.setLayoutManager(linearLayoutManager);
    }

    private void getJson() {
        String brandUrl = "http://pcache.thestyledo.com/p/www/asia/pcdata/600s/android/shoplist.wish";
        Log.e("url", brandUrl);
        HttpUtils.newInstance().getBrandBean(brandUrl)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BrandBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(BrandBean brandBean) {
//                        Log.e("BrandFragment", "" + brandBean.getResult().getRanking().size());
                        getList(brandBean);
                        initTubiao();
                        initView();

                    }
                });
    }

    /**
     * 所有图标的 集合
     */
    private void initTubiao() {
        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 93);
//            Log.e("num------>", "" + num);
            RecommendBean.BrandListBean brandListBean = mlistBrands.get(num);
            mlistrvsb.add(brandListBean);
            Log.e("mlistrvsb.size", "" + mlistrvsb.size());
            int shopNo = mlistrvsb.get(0).getShopNo();
//            Log.e("qq", mlistrvsb.get(0).getShopNo() + "");
        }
        //adapter.notifyDataSetChanged();

    }

    public static BrandFragment newInstance() {
        BrandFragment brandFragment = new BrandFragment();
        Bundle args = new Bundle();
        brandFragment.setArguments(args);
        return brandFragment;
    }


    /**
     * 初始化视图
     */
    private void initView() {
        initTop();
        initJingxuan();
        initVp();

    }

    private void initVp() {
        manager = getChildFragmentManager();
        RexiaoFragment rexiaoFragment = RexiaoFragment.newInstance();
        NvshenFragment nvshenFragment = NvshenFragment.newInstance();
        ChaorenFragment chaorenFragment = ChaorenFragment.newInstance();
        YifaFragment yifaFragment = YifaFragment.newInstance();
        listFrangment.add(nvshenFragment);
        listFrangment.add(yifaFragment);
        listFrangment.add(rexiaoFragment);
        listFrangment.add(chaorenFragment);
        mypagerAdapter = new MypagerAdapter(manager, listFrangment);
        vpFb.setAdapter(mypagerAdapter);
    }

    private void initRecycleSb() {
        adapter = new BrandRecycleSbAdapter(mContext, mlistrvsb, itemClickListener);
        GridLayoutManager manager = new GridLayoutManager(mContext, 3, OrientationHelper.VERTICAL, false);
        rvFbShangbiao.setAdapter(adapter);
        rvFbShangbiao.setLayoutManager(manager);
        rvFbShangbiao.setItemAnimator(new MyItemAnimator());
//        rvFbShangbiao.addItemDecoration(new DividerGridItemDecoration(mContext));
//        rvFbShangbiao.setLayoutManager();

    }

    /**
     * 精选栏目的初始化
     */
    private void initJingxuan() {
//        左侧图形
        String bannerImg0 = mlistOther.get(2).getBannerImg();
        String leftIvUrl0 = getFinalUrl(bannerImg0, 96, 96);
        Glide.with(mContext).load(leftIvUrl0).into(tvFbJingLeft);
        String logoImg0 = mlistOther.get(2).getLogoImg();
        String leftTvUrl0 = getFinalUrl(logoImg0, 96, 96);
        Glide.with(mContext).load(leftTvUrl0).into(ivFbJingLeft);
        ivFbJingLeft.setOnClickListener(this);
//中间图像及右边图像
//       tvFbJingCenter,ivFbJingCenter;
        String bannerImg1 = mlistOther.get(0).getBannerImg();
        String leftIvUrl1 = getFinalUrl(bannerImg1, 96, 96);
        Glide.with(mContext).load(leftIvUrl1).into(tvFbJingCenter);
        String logoImg1 = mlistOther.get(0).getLogoImg();
        String leftTvUrl1 = getFinalUrl(logoImg1, 96, 96);
        Glide.with(mContext).load(leftTvUrl1).into(ivFbJingCenter);
        tvFbJingCenter.setOnClickListener(this);

        String bannerImg2 = mlistOther.get(1).getBannerImg();
        String leftIvUrl2 = getFinalUrl(bannerImg2, 96, 96);
        Glide.with(mContext).load(leftIvUrl2).into(tvFbJingRight);
        String logoImg2 = mlistOther.get(1).getLogoImg();
        String leftTvUrl2 = getFinalUrl(logoImg2, 96, 96);
        Glide.with(mContext).load(leftTvUrl2).into(ivFbJingRight);
        tvFbJingRight.setOnClickListener(this);

    }

    /**
     * 顶部图片初始化
     */
    private void initTop() {
        String bannerImg = mlistBanners.get(1).getBannerImg();
        Log.e("change1", "" + bannerImg);
        bannerImg = getFinalUrl(bannerImg, 400, 400);
//        Log.e("change2", "" + bannerImg);
        Glide.with(mContext).load(bannerImg).into(ivBrandTop);
    }

    /**
     * 将地址栏里的 ${width}  ${height}  用数字替换掉
     *
     * @param imgUrl
     * @param length
     * @param width
     * @return
     */
    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }

    /**
     * 所有集合在这赋值
     *
     * @param brandBean
     */
    // TODO: 16/11/17 集合的初始化 及所有图标 的样式
    private void getList(BrandBean brandBean) {
        List<BannerBean> banner = brandBean.getResult().getBanner();
        mlistBanners.addAll(banner);
        List<RankingBean> ranking = brandBean.getResult().getRanking();
        mlistRankings.addAll(ranking);
        List<ShopListBean.CategoriesBean> categories = brandBean.getResult().getShopList().getCategories();
        mlistCategories.addAll(categories);
        List<ShopListBean.ListBean> list = brandBean.getResult().getShopList().getList();
        mlistLists.addAll(list);
        List<RecommendBean.NewListBean> newList = brandBean.getResult().getRecommend().getNewList();
        mlistNews.addAll(newList);
        List<RecommendBean.BrandListBean> brandList = brandBean.getResult().getRecommend().getBrandList();
        mlistBrands.addAll(brandList);
        List<RecommendBean.OtherListBean> otherList = brandBean.getResult().getRecommend().getOtherList();
        mlistOther.addAll(otherList);
        adapter.notifyDataSetChanged();
        mRvListAdapter.notifyDataSetChanged();

    }


    public List<RankingBean> getRankingBean() {
        return mlistRankings;
    }

    /**
     * textView 的点击事件
     *
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_fb_all:
                listChange(mlistLists);
                break;
            case R.id.tv_fb_child:
                listChange(mlistLists);
                break;
            case R.id.tv_fb_nanzhuang:
                listChange(mlistLists);
                break;
            case R.id.tv_fb_nvzhaung:
                listChange(mlistLists);
                break;
            case R.id.tv_fb_shoes:
                listChange(mlistLists);
                break;
            case R.id.tv_fb_jing_left:
                UIManager.startShopData(mContext, mlistOther.get(2).getShopNo());
                break;
            case R.id.tv_fb_jing_center:
                int shopNo = mlistOther.get(0).getShopNo();
                Log.e("shopNo", "" + shopNo);
                UIManager.startShopData(mContext, mlistOther.get(0).getShopNo());
                break;
            case R.id.tv_fb_jing_right:
                UIManager.startShopData(mContext, mlistOther.get(1).getShopNo());
                break;
        }
    }

    /**
     * 让集合随机重组
     *
     * @param mlistLists
     */
    public void listChange(List mlistLists) {
        Collections.shuffle(mlistLists);
        mRvListAdapter.notifyDataSetChanged();
    }
}
