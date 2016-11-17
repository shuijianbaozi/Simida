package com.example.my.simida.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
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
import com.example.my.simida.fragment.brandfragment.IRvOnItemClickListener;
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
public class BrandFragment extends BaseFragment implements IRvOnItemClickListener {
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
                        Log.e("BrandFragment", "" + brandBean.getResult().getRanking().size());
                        getList(brandBean);
                        initTubiao();
                        initView();
                    }
                });
        return view;
    }

    private void initTubiao() {
        for (int i = 0; i < 6; i++) {
            int num = (int)( Math.random() * 93);
            Log.e("num------>",""+num);
            RecommendBean.BrandListBean brandListBean = mlistBrands.get(num);
            mlistrvsb.add(brandListBean);
            Log.e("mlistrvsb.size",""+mlistrvsb.size());
            int shopNo = mlistrvsb.get(0).getShopNo();
            Log.e("qq",mlistrvsb.get(0).getShopNo()+"");
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
        initRecycleSb();

    }

    private void initRecycleSb() {
        adapter = new BrandRecycleSbAdapter(mContext, mlistrvsb, this);
        GridLayoutManager manager = new GridLayoutManager(mContext, 3, OrientationHelper.VERTICAL, false);
        rvFbShangbiao.setAdapter(adapter);
        rvFbShangbiao.setLayoutManager(manager);

//        rvFbShangbiao.setLayoutManager();

    }

    /**
     * 精选栏目的初始化
     */
    private void initJingxuan() {
//        左侧图形
        String bannerImg = mlistNews.get(0).getBannerImg();
        String leftIvUrl = getFinalUrl(bannerImg, 600, 900);
        Glide.with(mContext).load(leftIvUrl).into(tvFbJingLeft);
        String logoImg = mlistNews.get(0).getLogoImg();
        String leftTvUrl = getFinalUrl(logoImg, 600, 200);
        Glide.with(mContext).load(leftTvUrl).into(ivFbJingLeft);
//中间图像及右边图像
//       tvFbJingCenter,ivFbJingCenter;
        String bannerImg1 = mlistOther.get(0).getBannerImg();
        String leftIvUrl1 = getFinalUrl(bannerImg1, 600, 900);
        Glide.with(mContext).load(leftIvUrl1).into(tvFbJingCenter);
        String logoImg1 = mlistOther.get(0).getLogoImg();
        String leftTvUrl1 = getFinalUrl(logoImg1, 600, 200);
        Glide.with(mContext).load(leftTvUrl1).into(ivFbJingCenter);

        String bannerImg2 = mlistOther.get(1).getBannerImg();
        String leftIvUrl2 = getFinalUrl(bannerImg2, 600, 900);
        Glide.with(mContext).load(leftIvUrl2).into(tvFbJingRight);
        String logoImg2 = mlistOther.get(1).getLogoImg();
        String leftTvUrl2 = getFinalUrl(logoImg2, 600, 200);
        Glide.with(mContext).load(leftTvUrl1).into(ivFbJingRight);
    }

    /**
     * 顶部图片初始化
     */
    private void initTop() {
        String bannerImg = mlistBanners.get(1).getBannerImg();
        Log.e("change1", "" + bannerImg);
        bannerImg = getFinalUrl(bannerImg, 1000, 500);
        Log.e("change2", "" + bannerImg);
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
    }

    @Override
    public void onItemClick(int shopId) {

    }

    @Override
    public void onItemLongClick(int position) {

    }
}
