package com.example.my.simida.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.my.simida.App;
import com.example.my.simida.R;
import com.example.my.simida.bean.shopdata.MdPrdListBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 16/11/21.
 */

public class RvMaishouAdapter extends RecyclerViewAdapterHelper<MdPrdListBean> {
    public interface IOnMaiShouClickListener {
        void onItemClick(int shopId);

        void onItemLongClick(int position);
    }

    private IOnMaiShouClickListener listener;

    public RvMaishouAdapter(Context context, List<MdPrdListBean> list, IOnMaiShouClickListener listener) {
        super(context, list);
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_shopdata_maishou, parent, false);
        int i = mContext.getResources().getDisplayMetrics().widthPixels / 3;
//        int i1 = (int)(i / 2) * 3;
        inflate.setLayoutParams(new RecyclerView.LayoutParams(i,i));
        return new MaiShouViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        MdPrdListBean mdPrdListBean = mList.get(position);
        MaiShouViewHolder viewHolder = (MaiShouViewHolder) holder;
        Glide.with(mContext).load(App.getFinalUrlSmall(mdPrdListBean.getRepImgUrl())).into(viewHolder.ivShopdataMaishou);
    }

    static class MaiShouViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_shopdata_maishou)
        ImageView ivShopdataMaishou;

        public MaiShouViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
