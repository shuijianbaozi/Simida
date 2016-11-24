package com.example.my.simida.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.bean.ShopDataCarBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 16/11/24.
 */

public class RvBuyGoodsListAdapter extends RecyclerViewAdapterHelper<ShopDataCarBean> {

    public RvBuyGoodsListAdapter(Context context, List<ShopDataCarBean> list) {
        super(context, list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_buy_goodslist, parent, false);
        return new BuyViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        BuyViewHolder viewHolder = (BuyViewHolder) holder;
        ShopDataCarBean shopDataCarBean = mList.get(position);
        viewHolder.buyNum.setText(shopDataCarBean.getItemcount() + "");
        viewHolder.buyPrice.setText(shopDataCarBean.getSalePrice());
        viewHolder.introduce.setText(shopDataCarBean.getPrdnm());
        Glide.with(mContext).load(shopDataCarBean.getRepimgurl()).into(viewHolder.buyImg);

    }

    class BuyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.buy_img)
        ImageView buyImg;
        @BindView(R.id.introduce)
        TextView introduce;
        @BindView(R.id.buy_num)
        TextView buyNum;
        @BindView(R.id.buy_price)
        TextView buyPrice;

        BuyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
