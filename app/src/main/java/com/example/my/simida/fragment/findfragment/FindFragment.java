package com.example.my.simida.fragment.findfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.my.simida.R;
import com.example.my.simida.adapter.FindAdapter;
import com.example.my.simida.base.BaseFragment;
import com.example.my.simida.bean.findfragment.FindBean;
import com.example.my.simida.http.HttpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends BaseFragment implements FindAdapter.IFindOnItemClickListener {

    @BindView(R.id.tv_find_hot)
    TextView tvFindHot;
    @BindView(R.id.tv_find_fashion)
    TextView tvFindFashion;
    @BindView(R.id.tv_fb_beauty)
    TextView tvFbBeauty;
    @BindView(R.id.tv_fb_simida)
    TextView tvFbSimida;
    @BindView(R.id.tv_fb_TOP)
    TextView tvFbTOP;
    @BindView(R.id.rv_find_list)
    RecyclerView rvFindList;
    private Context mContext;
    //发现页面的布局
    private List<FindBean.ResultBean.BestTalkListBean> mBestTalkListBeen = new ArrayList<>();
    private FindAdapter findAdapter;


    public static FindFragment newInstance() {
        FindFragment findFragment = new FindFragment();
        Bundle args = new Bundle();
        findFragment.setArguments(args);
        return findFragment;
    }

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
        View view = inflater.inflate(R.layout.fragment_find, container, false);
        ButterKnife.bind(this, view);
        initView();

        return view;

    }

    private void initView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 1, GridLayoutManager.VERTICAL, false);
        rvFindList.setLayoutManager(gridLayoutManager);
        findAdapter = new FindAdapter(mContext, mBestTalkListBeen, this);
        rvFindList.setAdapter(findAdapter);
        getJson();
    }

    @Override
    public void onItemClick(int userId) {

    }

    @Override
    public void onItemLongClick(int position) {

    }


    public void getJson() {
        String findUrl = "http://www.thestylewish.com/asia/api/styletalk/styleTalkMainAjax.do?list_size=20&page_no=1";
        HttpUtils.newInstance().getFindBean(findUrl)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<FindBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("LogError_", e.toString());
                    }

                    @Override
                    public void onNext(FindBean findBean) {

                        List<FindBean.ResultBean.BestTalkListBean> bestTalkListBean = findBean.getResult().getBestTalkList();
                        mBestTalkListBeen.clear();
                        mBestTalkListBeen.addAll(bestTalkListBean);
                        Log.e("mBestTalkListBeen", "" + mBestTalkListBeen.toString());
                        findAdapter.notifyDataSetChanged();
                    }
                });
    }

    @OnClick({R.id.tv_find_hot, R.id.tv_find_fashion, R.id.tv_fb_beauty, R.id.tv_fb_simida, R.id.tv_fb_TOP, R.id.rv_find_list})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_find_hot:
                Collections.shuffle(mBestTalkListBeen);
                findAdapter.notifyDataSetChanged();
                break;
            case R.id.tv_find_fashion:
                Collections.shuffle(mBestTalkListBeen);
                findAdapter.notifyDataSetChanged();
                break;
            case R.id.tv_fb_beauty:
                Collections.shuffle(mBestTalkListBeen);
                findAdapter.notifyDataSetChanged();
                break;
            case R.id.tv_fb_simida:
                Collections.shuffle(mBestTalkListBeen);
                findAdapter.notifyDataSetChanged();
                break;
            case R.id.tv_fb_TOP:
                Collections.shuffle(mBestTalkListBeen);
                findAdapter.notifyDataSetChanged();
                break;
            case R.id.rv_find_list:
                Collections.shuffle(mBestTalkListBeen);
                findAdapter.notifyDataSetChanged();
                break;
        }
    }
}
