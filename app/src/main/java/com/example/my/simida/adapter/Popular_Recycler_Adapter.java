package com.example.my.simida.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.bean.goodsdata.PopularBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

/**
 * Created by Asus on 2016/11/22.
 */

public class Popular_Recycler_Adapter extends RecyclerViewAdapterHelper<PopularBean> {

    public interface IOnItemClickListener{
        void onItemClick(int position);
    }

    private IOnItemClickListener mOnItemClickListener=null;

    public Popular_Recycler_Adapter(Context context, List<PopularBean> list , IOnItemClickListener mOnItemClickListener) {
        super(context,list);
        this.mOnItemClickListener = mOnItemClickListener;
    }

    //绑定视图，返回ViewHolder
    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        //由布局加载View
        View itemView = mInflater.inflate(R.layout.item_recyclerview_popular_clothes,parent,false);
        itemView.setLayoutParams(new RecyclerView.LayoutParams(220,440));
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final MyViewHolder holder1= (MyViewHolder) holder;
        PopularBean popularBean = mList.get(position);
        Glide.with(mContext).load(getFinalUrl(popularBean.getRepImgUrl(),96,96)).into(holder1.imageView);
        holder1.textView_prdname.setText(popularBean.getPrdNm()+"");
        holder1.textView_popularprice.setText(popularBean.getSalePrice()+"");

        //点击事件
        holder1.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnItemClickListener.onItemClick(position);
            }
        });
    }


    //自定义ViewHolder
    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView_prdname;
        TextView textView_popularprice;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageview_popular_clothes);
            textView_prdname = (TextView) itemView.findViewById(R.id.textview_popularname_clothes);
            textView_popularprice = (TextView) itemView.findViewById(R.id.textveiw_popularprice_clothes);

        }
    }
    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
