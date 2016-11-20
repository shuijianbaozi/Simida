package com.example.my.simida.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.bean.typefragment.CategoryListBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

/**
 * Created by My on 2016/11/18.
 */

public class TypeAdapter_Female extends RecyclerViewAdapterHelper<CategoryListBean.ListBean> {
    private IFemaleOnItemClickListener listener;
    int type;

    public TypeAdapter_Female(Context context, List<CategoryListBean.ListBean> list, IFemaleOnItemClickListener listener, int type) {
        super(context, list);
        this.listener = listener;
        this.type = type;
    }


    public interface IFemaleOnItemClickListener {
        void onItemClick(int cateId);

        void onItemLongClick(int position);
    }


    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        switch (type) {
            case 0:
                View female = mInflater.inflate(R.layout.item_type_female, parent, false);
                return new FemaleViewHolder(female);
            case 1:
                View accessory = mInflater.inflate(R.layout.item_type_accessory, parent, false);
                return new AccessoryViewHolder(accessory);
            case 2:
                View male = mInflater.inflate(R.layout.item_type_male, parent, false);
                return new MaleViewHolder(male);
            case 3:
                View baby = mInflater.inflate(R.layout.item_type_baby, parent, false);
                return new BabyViewHolder(baby);
        }
        View female = mInflater.inflate(R.layout.item_type_female, parent, false);
        return new FemaleViewHolder(female);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {


        final CategoryListBean.ListBean listBean = mList.get(position);

        switch (type) {
            case 0:
                FemaleViewHolder femaleholder = (FemaleViewHolder) holder;
                Glide.with(mContext).load(getFinalUrl(listBean.getRepImgUrl(), 100, 100)).into(femaleholder.imageView);
                femaleholder.textView.setText(listBean.getCateNm());
                femaleholder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listener.onItemClick(listBean.getCateGrpNo());
                    }
                });
                break;

            case 1:
                AccessoryViewHolder accessoryViewHolder = (AccessoryViewHolder) holder;
                Glide.with(mContext).load(getFinalUrl(listBean.getRepImgUrl(), 100, 100)).into(accessoryViewHolder.imageView);
                accessoryViewHolder.textView.setText(listBean.getCateNm());
                accessoryViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listener.onItemClick(listBean.getCateGrpNo());
                    }
                });
                break;
            case 2:
                MaleViewHolder maleViewHolder = (MaleViewHolder) holder;
                Glide.with(mContext).load(getFinalUrl(listBean.getRepImgUrl(), 100, 100)).into(maleViewHolder.imageView);
                maleViewHolder.textView.setText(listBean.getCateNm());
                maleViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listener.onItemClick(listBean.getCateGrpNo());
                    }
                });
                break;
            case 3:
                BabyViewHolder babyViewHolder = (BabyViewHolder) holder;
                Glide.with(mContext).load(getFinalUrl(listBean.getRepImgUrl(), 100, 100)).into(babyViewHolder.imageView);
                babyViewHolder.textView.setText(listBean.getCateNm());
                babyViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listener.onItemClick(listBean.getCateGrpNo());
                    }
                });
                break;

        }


    }


    class FemaleViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public FemaleViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.recy_female_img);
            textView = (TextView) itemView.findViewById(R.id.recy_female_text);

        }
    }

    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }

    class MaleViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public MaleViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.recy_male_img);
            textView = (TextView) itemView.findViewById(R.id.recy_male_text);

        }
    }

    class BabyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public BabyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.recy_baby_img);
            textView = (TextView) itemView.findViewById(R.id.recy_baby_text);

        }
    }

    class AccessoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public AccessoryViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.recy_accessory_img);
            textView = (TextView) itemView.findViewById(R.id.recy_accessory_text);

        }
    }

}
