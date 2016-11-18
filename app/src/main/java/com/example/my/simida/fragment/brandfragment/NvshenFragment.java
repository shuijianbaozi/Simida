package com.example.my.simida.fragment.brandfragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my.simida.R;
import com.example.my.simida.bean.brandfragment.RankingBean;
import com.example.my.simida.fragment.BrandFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NvshenFragment extends Fragment implements IOnNvshenRvClick {
    @BindView(R.id.rv_nvshen)
    RecyclerView rvNvshen;
    private Context mContext;
    NvshenRvAdapter mAdapter = null;
    List<RankingBean> mRankings = new ArrayList<>();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nvshen, container, false);
        ButterKnife.bind(this, view);
        initNvRc();
        initData();
        return view;
    }

    private void initData() {
        BrandFragment parentFragment = (BrandFragment) getParentFragment();
        List<RankingBean> rankingBean = parentFragment.getRankingBean();
        mRankings.addAll(rankingBean);
        mAdapter.notifyDataSetChanged();
    }

    private void initNvRc() {
        mAdapter = new NvshenRvAdapter(mContext, mRankings, this, "nvshen");
        rvNvshen.setAdapter(mAdapter);
        LinearLayoutManager manager = new LinearLayoutManager(mContext, OrientationHelper.VERTICAL, false);
        rvNvshen.setLayoutManager(manager);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    // TODO: Rename and change types and number of parameters
    public static NvshenFragment newInstance() {
        NvshenFragment fragment = new NvshenFragment();
        return fragment;
    }


    @Override
    public void onItemClick(int positon, String s) {

    }

    @Override
    public void onItemLongClick(int position) {

    }

}
