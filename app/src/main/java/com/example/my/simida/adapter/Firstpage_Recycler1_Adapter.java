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
import com.example.my.simida.bean.firstpagefragment.CountInfo;
import com.example.my.simida.bean.firstpagefragment.StylePickBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

/**
 * Created by My on 2016/11/16.
 */

public class Firstpage_Recycler1_Adapter extends RecyclerViewAdapterHelper<StylePickBean>{

    public interface IOnItemClickListener{
        void onItemClick(String stylepick_id);
    }

    private IOnItemClickListener mOnItemClickListener=null;

    public Firstpage_Recycler1_Adapter(Context context, List<StylePickBean> list ,IOnItemClickListener mOnItemClickListener) {
        super(context,list);
        this.mOnItemClickListener = mOnItemClickListener;
    }

    //绑定视图，返回ViewHolder
    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        //由布局加载View
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_recyclerview_horizontal,null,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final MyViewHolder holder1= (MyViewHolder) holder;
        final StylePickBean stylePickBean = mList.get(position);
//        Glide.with(mContext).load(getFinalUrl(stylePickBean.getRepImgUrl(),200,200)).into(holder1.imageView);
        Glide.with(mContext).load(getFinalUrl(stylePickBean.getRepImgUrl(),96,96)).asBitmap().centerCrop().into(new BitmapImageViewTarget(holder1.imageView) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(mContext.getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                holder1.imageView.setImageDrawable(circularBitmapDrawable);
            }
        });
        holder1.textView_stylename.setText(stylePickBean.getStyleName());
        holder1.textView_count.setText(stylePickBean.getCnt()+"");

        //点击事件
        holder1.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOnItemClickListener.onItemClick(stylePickBean.getStylepickId());
            }
        });
    }


    //自定义ViewHolder
    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView_stylename;
        TextView textView_count;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.firstpage_recyclerview1_image);
            textView_stylename = (TextView) itemView.findViewById(R.id.firstpage_recyclerview1_textview_stylename);
            textView_count = (TextView) itemView.findViewById(R.id.firstpage_recyclerview1_textview_count);
        }
    }
    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
