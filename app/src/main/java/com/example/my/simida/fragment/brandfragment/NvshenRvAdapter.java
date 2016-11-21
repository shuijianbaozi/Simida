package com.example.my.simida.fragment.brandfragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.bean.brandfragment.RankingBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by apple on 16/11/17.
 */

public class NvshenRvAdapter extends RecyclerViewAdapterHelper<RankingBean> {
    private IOnNvshenRvClick listener;
    final private String flag;

    public NvshenRvAdapter(Context context, List<RankingBean> list, IOnNvshenRvClick listener, String flag) {
        super(context, list);
        this.listener = listener;
        this.flag = flag;
    }

    public int getItemCount() {
        return mList.get(0).getList().size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_fb_nvshen_rv, parent, false);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        MyViewHolder viewHolder = (MyViewHolder) holder;
        List<RankingBean.ListBean> list = null;
        switch (flag) {
            case "chaoren":
                list = mList.get(2).getList();
                viewHolder.tvFbNvshen.setText("0" + (position + 1));
                Glide.with(mContext).load(getFinalUrl(list.get(position).getRankingImg(), 96, 96)).into(viewHolder.ivFbNvshenLeft);
                Glide.with(mContext).load(getFinalUrl(list.get(position).getLogoImg(), 96, 96)).into(viewHolder.ivFbNvshenLogo);
                List<RankingBean.ListBean> list1 = mList.get(3).getList();
                Glide.with(mContext).load(getFinalUrl(list1.get(position).getRankingImg(), 96, 96)).into(viewHolder.ivFbNvshenRight);

                break;
            case "rexiao":
                list = mList.get(0).getList();
                viewHolder.tvFbNvshen.setText("0" + (position + 1));
                Glide.with(mContext).load(getFinalUrl(list.get(position).getRankingImg(), 96, 96)).into(viewHolder.ivFbNvshenLeft);
                Glide.with(mContext).load(getFinalUrl(list.get(position).getLogoImg(), 96, 96)).into(viewHolder.ivFbNvshenLogo);
                List<RankingBean.ListBean> list2 = mList.get(1).getList();
                Glide.with(mContext).load(getFinalUrl(list2.get(position).getRankingImg(), 96, 96)).into(viewHolder.ivFbNvshenRight);

                break;
            case "yifa":
                list = mList.get(1).getList();
                viewHolder.tvFbNvshen.setText("0" + (position + 1));
                Glide.with(mContext).load(getFinalUrl(list.get(position).getRankingImg(), 96,96)).into(viewHolder.ivFbNvshenLeft);
                Glide.with(mContext).load(getFinalUrl(list.get(position).getLogoImg(), 96, 96)).into(viewHolder.ivFbNvshenLogo);
                List<RankingBean.ListBean> list3 = mList.get(2).getList();
                Glide.with(mContext).load(getFinalUrl(list3.get(position).getRankingImg(), 96, 96)).into(viewHolder.ivFbNvshenRight);

                break;
            case "nvshen":
                list = mList.get(3).getList();
                viewHolder.tvFbNvshen.setText("0" + (position + 1));
                Glide.with(mContext).load(getFinalUrl(list.get(position).getRankingImg(), 96, 96)).into(viewHolder.ivFbNvshenLeft);
                Glide.with(mContext).load(getFinalUrl(list.get(position).getLogoImg(), 96, 96)).into(viewHolder.ivFbNvshenLogo);
                List<RankingBean.ListBean> list4 = mList.get(0).getList();
                Glide.with(mContext).load(getFinalUrl(list4.get(position).getRankingImg(), 96, 96)).into(viewHolder.ivFbNvshenRight);
                break;
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(position, flag);
            }
        });


    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivFbNvshenLeft;
        TextView tvFbNvshen;
        ImageView ivFbNvshenLogo;
        ImageView ivFbNvshenRight;


        public MyViewHolder(View itemView) {
            super(itemView);
            ivFbNvshenLeft = (ImageView) itemView.findViewById(R.id.iv_fb_nvshen_left);
            ivFbNvshenLogo = (ImageView) itemView.findViewById(R.id.iv_fb_nvshen_logo);
            ivFbNvshenRight = (ImageView) itemView.findViewById(R.id.iv_fb_nvshen_right);
            tvFbNvshen = (TextView) itemView.findViewById(R.id.tv_fb_nvshen);
        }
    }

    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
