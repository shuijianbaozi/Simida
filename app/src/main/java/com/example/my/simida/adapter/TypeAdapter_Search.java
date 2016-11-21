package com.example.my.simida.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.bean.typefragment.RecommendStyleBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

/**
 * Created by My on 2016/11/18.
 */

public class TypeAdapter_Search extends RecyclerViewAdapterHelper<RecommendStyleBean.ListBean> {
    private ISearchOnItemClickListener listener;


    public interface ISearchOnItemClickListener {
        void onItemClick(int shopId);

        void onItemLongClick(int position);
    }

    public TypeAdapter_Search(Context context, List<RecommendStyleBean.ListBean> list, ISearchOnItemClickListener listener) {
        super(context, list);
        this.listener=listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {

        View search = mInflater.inflate(R.layout.item_type_recyclerview_searchkey,parent,false);
        return new SViewHolder(search);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {

        SViewHolder viewholder = (SViewHolder) holder;
        final RecommendStyleBean.ListBean listBean = mList.get(position);
        Glide.with(mContext)
                .load(getFinalUrl(listBean.getRepImgUrl(),96,96))
                .into(viewholder.imageView);
        viewholder.textView.setText(listBean.getRecKeyword());
        viewholder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(listBean.getRecWordNo());
            }
        });

    }

    class SViewHolder extends  RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public SViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.Type_recyclerViewSearchImg);
            textView = (TextView) itemView.findViewById(R.id.Type_recyclerViewSearchText);
        }
    }
    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
