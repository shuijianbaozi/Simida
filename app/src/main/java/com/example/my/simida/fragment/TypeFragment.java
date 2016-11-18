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
import com.example.my.simida.base.BaseFragment;

import com.example.my.simida.bean.typefragment.ListBean;
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
public class TypeFragment extends BaseFragment implements TypeAdapter.IOnItemClickListener{

    @BindView(R.id.search_input)
    EditText searchInput;
    @BindView(R.id.btn_search_type)
    Button btnSearchType;
    @BindView(R.id.Type_recyclerView)
    RecyclerView TypeRecyclerView;
    @BindView(R.id.Type_recyclerViewId)
    RecyclerView TypeRecyclerViewId;
    //圆形图片+文字A+文字B
    private Context mContext;
    private TypeAdapter mTypeAdapter;
    private List<ListBean> mlist=new ArrayList<>();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
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

        getJson();
        return view;
    }

    public static TypeFragment newInstance() {
        TypeFragment typeFragment = new TypeFragment();
        Bundle args = new Bundle();
        typeFragment.setArguments(args);
        return typeFragment;
    }

    private void initView() {

        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 3, OrientationHelper.VERTICAL, false);
        TypeRecyclerView.setLayoutManager(gridLayoutManager);
        mTypeAdapter=new TypeAdapter(mContext,mlist,this) ;

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
                        Log.e("LogError_",e.toString());
                    }

                    @Override
                    public void onNext(TypeBean typeBean) {
                        Log.e("TypeFragment", "" + typeBean.toString());
                        List<ListBean> list = typeBean.getResult().getRecommendCornerList().getList();
                        mlist.addAll(list);
                        mTypeAdapter.notifyDataSetChanged();
                    }
                });
    }

    @Override
    public void onItemClick(int position) {

    }
//    @Override
//    public void onItemClick(int position) {
//        Toast.makeText(mContext, "Click", Toast.LENGTH_LONG).show();
//    }
}
