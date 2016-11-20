package com.example.my.simida.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.App;
import com.example.my.simida.R;
import com.example.my.simida.bean.shopdata.HotTrendListBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 16/11/19.
 */

public class RvChaoliuAdapter extends RecyclerViewAdapterHelper<HotTrendListBean> {
    public RvChaoliuAdapter(Context context, List<HotTrendListBean> list) {
        super(context, list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_rv_shopdata_chaoliu, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        HotTrendListBean hotTrendListBean = mList.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        Glide.with(mContext).load(App.getFinalUrl(hotTrendListBean.getMainImgUrl(), 8000, 800)).into(viewHolder.ivShopChaoliu);
        viewHolder.tvShopChaoliuName.setText(hotTrendListBean.getSalePrice() + "");
        viewHolder.tvShopChaoliuName.setText(hotTrendListBean.getPrdNm());
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_shop_chaoliu)
        ImageView ivShopChaoliu;
        @BindView(R.id.tv_shop_chaoliu_price)
        TextView tvShopChaoliuPrice;
        @BindView(R.id.tv_shop_chaoliu_name)
        TextView tvShopChaoliuName;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
