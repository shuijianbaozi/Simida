package com.example.my.simida.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

import com.example.my.simida.R;
import com.example.my.simida.adapter.Firstpage_Recycler1_Adapter;
import com.example.my.simida.adapter.Firstpage_Recycler2_Adapter;
import com.example.my.simida.base.BaseFragment;
import com.example.my.simida.bean.firstpagefragment.CountInfo;
import com.example.my.simida.bean.firstpagefragment.MdPickBean;
import com.example.my.simida.bean.firstpagefragment.StylePickBean;
import com.example.my.simida.bean.firstpagefragment.TrendPickBean;
import com.example.my.simida.http.HttpUtils;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstPageFragment extends BaseFragment implements Firstpage_Recycler1_Adapter.IOnItemClickListener,Firstpage_Recycler2_Adapter.IOnItemClickListener {

    //数据源
    private Context mContext = null;
    private RecyclerView mRecyclerView1, mRecyclerView2;
    private Firstpage_Recycler1_Adapter mFirstpage_recycler1_adapter = null;
    private Firstpage_Recycler2_Adapter mFirstpage_recycler2_adapter = null;
    private Firstpage_Recycler1_Adapter.IOnItemClickListener mIOnItemClickListener1;
    private Firstpage_Recycler2_Adapter.IOnItemClickListener mIOnItemClickListener2;

    //集合
    private List<StylePickBean> mStylePickBeenList = new ArrayList<>();
    private List<MdPickBean.MdPickListBean> mMdPickListBeanList = new ArrayList<>();
    private List<TrendPickBean> mTrendPickBeanList = new ArrayList<>();

    //控件
    private ImageView mImageView,mImageView_rep,mImageView_logo;
    private TextView mTextView1, mTextView2, mTextView_likecnt;
    //header的控件
    private TextView mTextView1_header1,mTextView2_header1,mTextView3_header1
            ,mTextView1_header2,mTextView2_header2,mTextView3_header2
            ,mTextView1_header3,mTextView2_header3,mTextView3_header3;


    public static FirstPageFragment newInstance() {
        FirstPageFragment firstPageFragment = new FirstPageFragment();
        Bundle args = new Bundle();
        firstPageFragment.setArguments(args);
        return firstPageFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_firstpage, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //firstpage中第一个RecyclerView的控件及适配器
        mImageView = (ImageView) view.findViewById(R.id.firstpage_recyclerview1_image);
        mTextView1 = (TextView) view.findViewById(R.id.firstpage_recyclerview1_textview_stylename);
        mTextView2 = (TextView) view.findViewById(R.id.firstpage_recyclerview1_textview_count);
        mRecyclerView1 = (RecyclerView) view.findViewById(R.id.firstpage_recyclerview1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView1.setLayoutManager(linearLayoutManager);
        mFirstpage_recycler1_adapter = new Firstpage_Recycler1_Adapter(mContext,mStylePickBeenList,mIOnItemClickListener1);
        mRecyclerView1.setAdapter(mFirstpage_recycler1_adapter);
        //firstpage中第二个RecyclerView的控件及适配器
        mImageView_rep = (ImageView) view.findViewById(R.id.firstpage_recyclerview2_image_rep);
        mImageView_logo = (ImageView) view.findViewById(R.id.firstpage_recyclerview2_logo);
        mTextView_likecnt = (TextView) view.findViewById(R.id.firstpage_recyclerview2_likecnt);
        mRecyclerView2 = (RecyclerView) view.findViewById(R.id.firstpage_recyclerview2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext,2, OrientationHelper.VERTICAL,false);
        mRecyclerView2.setLayoutManager(gridLayoutManager);
        mFirstpage_recycler2_adapter = new Firstpage_Recycler2_Adapter(mContext,mMdPickListBeanList,mIOnItemClickListener2);
        mRecyclerView2.setAdapter(mFirstpage_recycler2_adapter);
        //header的控件
        mTextView1_header1 = (TextView) view.findViewById(R.id.firstpage_header1_text1);
        mTextView2_header1 = (TextView) view.findViewById(R.id.firstpage_header2_text1);
        mTextView3_header1 = (TextView) view.findViewById(R.id.firstpage_header3_text1);
        mTextView1_header2 = (TextView) view.findViewById(R.id.firstpage_header1_text2);
        mTextView2_header2 = (TextView) view.findViewById(R.id.firstpage_header2_text2);
        mTextView3_header2 = (TextView) view.findViewById(R.id.firstpage_header3_text2);
        mTextView1_header3 = (TextView) view.findViewById(R.id.firstpage_header1_collection_talk_cnt);
        mTextView2_header3 = (TextView) view.findViewById(R.id.firstpage_header2_collection_talk_cnt);
        mTextView3_header3 = (TextView) view.findViewById(R.id.firstpage_header3_collection_talk_cnt);

    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //RecyclerView1的json
        String firstpageUrl1 = "http://pcache.thestyledo.com/p/www/asia/pcdata/600s/android/home/8_mi.wish";
        HttpUtils.newInstance().getCountInfo(firstpageUrl1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<CountInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(CountInfo countInfo) {
                        getList1(countInfo);
                        getList2(countInfo);
                        getList3(countInfo);
                        int cnt = countInfo.getResult().getStylePick().get(0).getCnt();
                        Log.e("qqq", "qqq" + cnt);
                    }
                });
    }

    @Override
    public void onItemClick(int position) {

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

    private void getList1(CountInfo countInfo) {
        //RecyclerView1的集合
        List<StylePickBean> stylePick = countInfo.getResult().getStylePick();
        mStylePickBeenList.clear();
        mStylePickBeenList.addAll(stylePick);
        mFirstpage_recycler1_adapter.notifyDataSetChanged();
    }
    private void getList2(CountInfo countInfo) {
        //RecyclerView2的集合
        MdPickBean mdPick = countInfo.getResult().getMdPick();
        List<MdPickBean.MdPickListBean> mdPickList = mdPick.getMdPickList();
        mMdPickListBeanList.clear();
        mMdPickListBeanList.addAll(mdPickList);
        mFirstpage_recycler2_adapter.notifyDataSetChanged();
    }
    private void getList3(CountInfo countInfo){
        List<TrendPickBean> trendPickBeen = countInfo.getResult().getTrendPick();
        mTrendPickBeanList.addAll(trendPickBeen);
        initView();
    }

    private void initView() {
        String TextView1_header1 = mTrendPickBeanList.get(0).getText1();
        mTextView1_header1.setText(TextView1_header1);
        String TextView2_header1 = mTrendPickBeanList.get(0).getText2();
        mTextView2_header1.setText(TextView2_header1);
        int TextView3_header1 = mTrendPickBeanList.get(0).getCollectionTalkCnt();
        mTextView3_header1.setText(TextView3_header1);
        String TextView1_header2 = mTrendPickBeanList.get(1).getText1();
        mTextView1_header2.setText(TextView1_header2);
        String TextView2_header2 = mTrendPickBeanList.get(1).getText2();
        mTextView2_header2.setText(TextView2_header2);
        int TextView3_header2 = mTrendPickBeanList.get(1).getCollectionTalkCnt();
        mTextView3_header2.setText(TextView3_header2);
        String TextView1_header3 = mTrendPickBeanList.get(2).getText1();
        mTextView1_header3.setText(TextView1_header3);
        String TextView2_header3 = mTrendPickBeanList.get(2).getText2();
        mTextView2_header3.setText(TextView2_header3);
        int TextView3_header3 = mTrendPickBeanList.get(2).getCollectionTalkCnt();
        mTextView3_header3.setText(TextView3_header3);
    }
}
