package com.example.my.simida.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.example.my.simida.R;
import com.example.my.simida.bean.firstpagefragment.MdPickBean;
import com.example.my.simida.bean.firstpagefragment.StylePickBean;
import com.example.my.simida.bean.firstpagefragment.TrendPickBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

/**
 * Created by My on 2016/11/17.
 */

public class Firstpage_Recycler2_Adapter extends RecyclerViewAdapterHelper<MdPickBean.MdPickListBean>{

    public interface IOnItemClickListener{
        void onItemClick(int position);
    }
    private Firstpage_Recycler2_Adapter.IOnItemClickListener mOnItemClickListener=null;

    public Firstpage_Recycler2_Adapter(Context context, List<MdPickBean.MdPickListBean> list, IOnItemClickListener mOnItemClickListener) {
        super(context, list);
        this.mOnItemClickListener = mOnItemClickListener;
    }

    //绑定视图
    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_recyclerview_vertical,null,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final Firstpage_Recycler2_Adapter.MyViewHolder holder2= (Firstpage_Recycler2_Adapter.MyViewHolder) holder;
        MdPickBean.MdPickListBean mdPickListBean = mList.get(position);
        Glide.with(mContext).load(getFinalUrl(mdPickListBean.getRepImgUrl(),200,200)).into(holder2.imageView_rep);
        Glide.with(mContext).load(getFinalUrl(mdPickListBean.getBrandLogo(),50,25)).into(holder2.imageView_logo);
        holder2.textView_likecnt.setText(mdPickListBean.getLikeCnt()+"");

        //点击事件
        holder2.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnItemClickListener.onItemClick(position);
            }
        });
    }

    //自定义ViewHolder
    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView_rep;
        ImageView imageView_logo;
        TextView textView_likecnt;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView_rep = (ImageView) itemView.findViewById(R.id.firstpage_recyclerview2_image_rep);
            imageView_logo = (ImageView) itemView.findViewById(R.id.firstpage_recyclerview2_logo);
            textView_likecnt = (TextView) itemView.findViewById(R.id.firstpage_recyclerview2_likecnt);
        }
    }
    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}

