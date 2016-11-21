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
import com.example.my.simida.bean.typefragment.ListBean;

import java.util.List;

/**
 * Created by My on 2016/11/16.
 */

public class TypeAdapter extends RecyclerView.Adapter<TypeAdapter.ViewHolder> {

    //点击监听
    public interface IOnItemClickListener {
        void onItemClick(int position);
    }

    private Context mContext;
    private List<ListBean> themeListBeen;
    private IOnItemClickListener onItemClickListener;


    //有参构造方法
    public TypeAdapter(Context mContext,  List<ListBean> themeListBeen, IOnItemClickListener onItemClickListener) {
        this.mContext = mContext;
        this.themeListBeen = themeListBeen;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_type_recyclerview_a, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        ListBean themeListBean = themeListBeen.get(position);
        Glide.with(mContext)
                .load(getFinalUrl(themeListBean.getRepImgUrl(),96,96))
                .into(holder.imageView);
//        holder.imageView.setImageResource();
        holder.textView_a.setText(themeListBean.getTitle());
        holder.textView_b.setText(themeListBean.getDtlDesc());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return themeListBeen.size();
    }

    //自定义ViewHolder
    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView_a;
        TextView textView_b;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.item_Type_recyclerView_img);
            textView_a = (TextView) itemView.findViewById(R.id.item_Type_recyclerView_text_a);
            textView_b = (TextView) itemView.findViewById(R.id.item_Type_recyclerView_text_b);

        }
    }

    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
