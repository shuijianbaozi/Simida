package com.example.my.simida.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.my.simida.R;
import com.example.my.simida.adapter.TypeAdapter;
import com.example.my.simida.adapter.TypeAdapter_Female;
import com.example.my.simida.adapter.TypeAdapter_Search;
import com.example.my.simida.base.BaseFragment;
import com.example.my.simida.bean.typefragment.CategoryListBean;
import com.example.my.simida.bean.typefragment.ListBean;
import com.example.my.simida.bean.typefragment.RecommendStyleBean;
import com.example.my.simida.bean.typefragment.TypeBean;
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
public class TypeFragment extends BaseFragment implements TypeAdapter.IOnItemClickListener {


    @BindView(R.id.search_input)
    EditText searchInput;
    @BindView(R.id.btn_search_type)
    Button btnSearchType;
    @BindView(R.id.Type_recyclerView)
    RecyclerView TypeRecyclerView;
    @BindView(R.id.Type_recyclerViewSearchKey)
    RecyclerView TypeRecyclerViewSearchKey;
    @BindView(R.id.RV_Type_female)
    RecyclerView RVTypeFemale;
    @BindView(R.id.RV_Type_accessory)
    RecyclerView RVTypeAccessory;
    @BindView(R.id.RV_Type_male)
    RecyclerView RVTypeMale;
    @BindView(R.id.rv_type_baby)
    RecyclerView RVTypeBaby;


    private Context mContext;
    private int mType;

    //圆形图片+文字A+文字B
    private TypeAdapter mTypeAdapter;
    private List<ListBean> mlist = new ArrayList<>();

    //热搜图片+文字
    private List<RecommendStyleBean.ListBean> mRecommendStyleListbean = new ArrayList<>();
    private TypeAdapter_Search mTypeAdapter_Search;
    //图片+文字
    private List<CategoryListBean.ListBean> mCateListBean1 = new ArrayList<>();
    private List<CategoryListBean.ListBean> mCateListBean2 = new ArrayList<>();
    private List<CategoryListBean.ListBean> mCateListBean3 = new ArrayList<>();
    private List<CategoryListBean.ListBean> mCateListBean4 = new ArrayList<>();
    private TypeAdapter_Female mTypeAdapter_four1;
    private TypeAdapter_Female mTypeAdapter_four2;
    private TypeAdapter_Female mTypeAdapter_four3;
    private TypeAdapter_Female mTypeAdapter_four4;

    TypeAdapter_Search.ISearchOnItemClickListener mListener = new TypeAdapter_Search.ISearchOnItemClickListener() {
        @Override
        public void onItemClick(int shopId) {

        }

        @Override
        public void onItemLongClick(int position) {

        }
    };


    TypeAdapter_Female.IFemaleOnItemClickListener mFeListener = new TypeAdapter_Female.IFemaleOnItemClickListener() {
        @Override
        public void onItemClick(int cateId) {

        }

        @Override
        public void onItemLongClick(int position) {

        }
    };

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
        View view = inflater.inflate(R.layout.fragment_type, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }


    public static TypeFragment newInstance() {
        TypeFragment typeFragment = new TypeFragment();
        Bundle args = new Bundle();
        typeFragment.setArguments(args);
        return typeFragment;
    }

    private void initView() {
        initTheme();
        initSearch();
        initFemale();
        initAccessory();
        initMale();
        initBaby();
        getJson();
    }

    private void initBaby() {
        GridLayoutManager gridManager6 = new GridLayoutManager(mContext, 4, OrientationHelper.VERTICAL, false);
        RVTypeBaby.setLayoutManager(gridManager6);
        mTypeAdapter_four4 = new TypeAdapter_Female(mContext, mCateListBean4, mFeListener, 3);
        RVTypeBaby.setAdapter(mTypeAdapter_four4);
    }

    private void initMale() {
        GridLayoutManager gridManager5 = new GridLayoutManager(mContext, 4, OrientationHelper.VERTICAL, false);
        RVTypeMale.setLayoutManager(gridManager5);
        mTypeAdapter_four3 = new TypeAdapter_Female(mContext, mCateListBean3, mFeListener, 2);
        RVTypeMale.setAdapter(mTypeAdapter_four3);
    }

    private void initAccessory() {
        GridLayoutManager gridManager4 = new GridLayoutManager(mContext, 4, OrientationHelper.VERTICAL, false);
        RVTypeAccessory.setLayoutManager(gridManager4);
        mTypeAdapter_four2 = new TypeAdapter_Female(mContext, mCateListBean2, mFeListener, 1);
        RVTypeAccessory.setAdapter(mTypeAdapter_four2);

    }

    private void initFemale() {
        GridLayoutManager gridManager3 = new GridLayoutManager(mContext, 4, OrientationHelper.VERTICAL, false);
        RVTypeFemale.setLayoutManager(gridManager3);
        mTypeAdapter_four1 = new TypeAdapter_Female(mContext, mCateListBean1, mFeListener, 0);
        RVTypeFemale.setAdapter(mTypeAdapter_four1);

    }

    private void initSearch() {
        GridLayoutManager gridManager2 = new GridLayoutManager(mContext, 1, OrientationHelper.HORIZONTAL, false);
        TypeRecyclerViewSearchKey.setLayoutManager(gridManager2);
        mTypeAdapter_Search = new TypeAdapter_Search(mContext, mRecommendStyleListbean, mListener);
        TypeRecyclerViewSearchKey.setAdapter(mTypeAdapter_Search);
    }

    private void initTheme() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 3, OrientationHelper.VERTICAL, false);
        TypeRecyclerView.setLayoutManager(gridLayoutManager);
        mTypeAdapter = new TypeAdapter(mContext, mlist, this);
        TypeRecyclerView.setAdapter(mTypeAdapter);
    }


    private void getJson() {
        String typeUrl = "http://www.thestylewish.com/asia/api/category/ctgTabData.do";

        HttpUtils.newInstance().getTypeBean(typeUrl)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<TypeBean>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("LogError_", e.toString());
                    }

                    @Override
                    public void onNext(TypeBean typeBean) {
                        Log.e("TypeFragment", "" + typeBean.toString());
                        List<ListBean> list = typeBean.getResult().getRecommendCornerList().getList();
                        mlist.addAll(list);
                        mTypeAdapter.notifyDataSetChanged();

                        //热搜
                        List<RecommendStyleBean.ListBean> list1 = typeBean.getResult().getRecommendStyle().getList();
                        mRecommendStyleListbean.addAll(list1);
//                        Log.e("mRecommend",""+mRecommendStyleListbean.toString());
                        mTypeAdapter_Search.notifyDataSetChanged();

                        //女装
                        CategoryListBean categoryListBeanFemale = typeBean.getResult().getCategoryList().get(0);
//                        typeBean.getResult().getCategoryList().get(0).getList()getList
                        List<CategoryListBean.ListBean> list2 = categoryListBeanFemale.getList();
                        mCateListBean1.addAll(list2);
                        Log.e("mFemale", "" + mCateListBean1.toString());
                        mTypeAdapter_four1.notifyDataSetChanged();

                        //鞋包配饰
                        CategoryListBean categoryListBeanAccessory = typeBean.getResult().getCategoryList().get(1);
                        List<CategoryListBean.ListBean> list3 = categoryListBeanAccessory.getList();
                        mCateListBean2.addAll(list3);
                        mTypeAdapter_four2.notifyDataSetChanged();


                        //男装
                        List<CategoryListBean.ListBean> list4 = typeBean.getResult().getCategoryList().get(2).getList();
                        mCateListBean3.addAll(list4);
                        Log.e("male", "" + mCateListBean3.toString());

                        mTypeAdapter_four3.notifyDataSetChanged();

                        //婴幼儿
                        List<CategoryListBean.ListBean> list5 = typeBean.getResult().getCategoryList().get(3).getList();
                        mCateListBean4.addAll(list5);
                        Log.e("baby", "" + mCateListBean4.toString()+"\n");
                        mTypeAdapter_four4.notifyDataSetChanged();
                    }
                });
    }

    @Override
    public void onItemClick(int position) {

    }

}
