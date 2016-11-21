package com.example.my.simida.fragment.brandfragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.bean.brandfragment.RecommendBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

/**
 * Created by apple on 16/11/17.
 */

public class BrandRecycleSbAdapter extends RecyclerViewAdapterHelper<RecommendBean.BrandListBean> {
    private IRvOnItemClickListener listener;

    public BrandRecycleSbAdapter(Context context, List<RecommendBean.BrandListBean> list, IRvOnItemClickListener listener) {
        super(context, list);
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_fb_rvsb, parent, false);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MyViewHolder viewHolder = (MyViewHolder) holder;

        final RecommendBean.BrandListBean brandListBean = mList.get(position);
        Log.e("brandList",""+brandListBean.getLogoImg());
        Glide.with(mContext).load(getFinalUrl(brandListBean.getLogoImg(),96,96)).into(viewHolder.imageView);
        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(brandListBean.getShopNo());
            }
        });

    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_itemrvsb);
        }
    }
    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
