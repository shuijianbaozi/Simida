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
import com.example.my.simida.bean.shopdata.PopPrdListBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 16/11/21.
 */

public class RvRenqiAdapter extends RecyclerViewAdapterHelper<PopPrdListBean> {
    public interface IOnRenqiClickListener {
        void onItemClick(int shopId);

        void onItemLongClick(int position);
    }

    private IOnRenqiClickListener listener;

    public RvRenqiAdapter(Context context, List<PopPrdListBean> list, IOnRenqiClickListener listener) {
        super(context, list);
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_shopdata_renqi, parent, false);
        return new RenqiViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        RenqiViewHolder viewHolder = (RenqiViewHolder) holder;
        PopPrdListBean popPrdListBean = mList.get(position);
        Glide.with(mContext).load(App.getFinalUrlSmall(popPrdListBean.getRepImgUrl())).into(viewHolder.ivRenqiImg);
        viewHolder.tvRenqiName.setText(popPrdListBean.getPrdNm());
        viewHolder.tvRenqiPrice.setText("￥ " + popPrdListBean.getSalePrice());
    }


    class RenqiViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_renqi_img)
        ImageView ivRenqiImg;
        @BindView(R.id.tv_renqi_name)
        TextView tvRenqiName;
        @BindView(R.id.tv_renqi_price)
        TextView tvRenqiPrice;

        RenqiViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

        }
    }
}
