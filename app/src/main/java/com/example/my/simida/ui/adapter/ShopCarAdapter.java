package com.example.my.simida.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.bean.ShopDataCarBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;
import com.example.my.simida.utils.ToastUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 16/11/23.
 */

public class ShopCarAdapter extends RecyclerViewAdapterHelper<ShopDataCarBean> {

    public ShopCarAdapter(Context context, List<ShopDataCarBean> list) {
        super(context, list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_lvshopcar, parent, false);
        return new ShopCarViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        ShopDataCarBean shopDataCarBean = mList.get(position);
        ShopCarViewHolder viewHolder = (ShopCarViewHolder) holder;
        viewHolder.tvShopcarSaleprice.setText(shopDataCarBean.getSalePrice());
        viewHolder.tvShopcarPrdname.setText(shopDataCarBean.getPrdnm());
        viewHolder.tvShopcarItemcount.setText(shopDataCarBean.getItemcount() + "");
        Glide.with(mContext).load(shopDataCarBean.getRepimgurl()).into(viewHolder.ivShopcar);
        viewHolder.btnShopcarAdd.setOnClickListener(new MyAddclick(shopDataCarBean, viewHolder.tvShopcarItemcount));
        viewHolder.btnShopcarSub.setOnClickListener(new MySubclick(shopDataCarBean, viewHolder.tvShopcarItemcount));
    }

    class ShopCarViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_shopcar)
        ImageView ivShopcar;
        @BindView(R.id.tv_shopcar_prdname)
        TextView tvShopcarPrdname;
        @BindView(R.id.tv_shopcar_saleprice)
        TextView tvShopcarSaleprice;
        @BindView(R.id.btn_shopcar_add)
        Button btnShopcarAdd;
        @BindView(R.id.btn_shopcar_sub)
        Button btnShopcarSub;
        @BindView(R.id.tv_shopcar_itemcount)
        TextView tvShopcarItemcount;


        ShopCarViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }

    class MyAddclick implements View.OnClickListener {
        private ShopDataCarBean shopDataCarBean;
        private TextView tvShopcarItemcount;

        public MyAddclick(ShopDataCarBean shopDataCarBean, TextView tvShopcarItemcount) {
            this.shopDataCarBean = shopDataCarBean;
            this.tvShopcarItemcount = tvShopcarItemcount;
        }

        @Override
        public void onClick(View view) {
            shopDataCarBean.setItemcount(shopDataCarBean.getItemcount() + 1);
            tvShopcarItemcount.setText(shopDataCarBean.getItemcount() + "");
        }
    }

    class MySubclick implements View.OnClickListener {
        private ShopDataCarBean shopDataCarBean;
        private TextView tvShopcarItemcount;

        public MySubclick(ShopDataCarBean shopDataCarBean, TextView tvShopcarItemcount) {
            this.shopDataCarBean = shopDataCarBean;
            this.tvShopcarItemcount = tvShopcarItemcount;
        }

        @Override
        public void onClick(View view) {
            if (shopDataCarBean.getItemcount() == 0) {
                ToastUtils.showTost(mContext, "不能再减少啦~");
            } else {
                shopDataCarBean.setItemcount(shopDataCarBean.getItemcount() - 1);
                tvShopcarItemcount.setText(shopDataCarBean.getItemcount() + "");
            }
        }
    }
}
