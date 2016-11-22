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
import com.example.my.simida.bean.shopdata.ShopPrdListBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 16/11/21.
 */

public class RvListAdapter extends RecyclerViewAdapterHelper<ShopPrdListBean> {
    public interface IOnListClickListener {
        void onItemClick(int shopId);

        void onItemLongClick(int position);
    }

    private IOnListClickListener listener;

    public RvListAdapter(Context context, List<ShopPrdListBean> list, IOnListClickListener listener) {
        super(context, list);
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_shop_list, parent, false);
        return new ShopListViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        ShopPrdListBean shopPrdListBean = mList.get(position);
        ShopListViewHolder viewHolder = (ShopListViewHolder) holder;
        Glide.with(mContext).load(App.getFinalUrlMiddle(shopPrdListBean.getRepImgUrl())).into(viewHolder.ivListShop);
        viewHolder.tvListLikecnt.setText(shopPrdListBean.getLikeCnt() + "");
        viewHolder.tvListName.setText(shopPrdListBean.getPrdNm());
        viewHolder.tvListPrice.setText("￥ " + shopPrdListBean.getSalePrice() + "");


    }


    class ShopListViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_list_shop)
        ImageView ivListShop;
        @BindView(R.id.tv_list_name)
        TextView tvListName;
        @BindView(R.id.tv_list_price)
        TextView tvListPrice;
        @BindView(R.id.tv_list_likecnt)
        TextView tvListLikecnt;

        ShopListViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
