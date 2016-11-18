package com.example.my.simida.fragment.brandfragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.R;
import com.example.my.simida.bean.brandfragment.ShopListBean;
import com.example.my.simida.config.UrlConfig;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

/**
 * Created by apple on 16/11/18.
 */

public class BrandRvListAdapter extends RecyclerViewAdapterHelper<ShopListBean.ListBean> {

    public BrandRvListAdapter(Context context, List<ShopListBean.ListBean> list) {
        super(context, list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_fb_rvlist, parent, false);
        return new MyViewholder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        ShopListBean.ListBean listBean = mList.get(position);
        MyViewholder viewholder = (MyViewholder) holder;
        viewholder.up_cnd.setText(listBean.getUpPrdCnt() + "");
        viewholder.tv_fb_rvlist_bname.setText(listBean.getBrandNm());
        viewholder.tv_fb_rvlist_bdsc.setText(listBean.getNewBrandDesc());
        viewholder.tv_fb__rvlist_cnt.setText("粉丝： " + listBean.getSubsCnt());
        Glide.with(mContext).load(UrlConfig.URL_BRAND_RVLIST_BASE + getFinalUrl(listBean.getAddImg().get(0), 800, 800)).into(viewholder.iv_fb_rvlist_zs);
        Glide.with(mContext).load(UrlConfig.URL_BRAND_RVLIST_BASE + getFinalUrl(listBean.getAddImg().get(1), 800, 800)).into(viewholder.iv_fb_rvlist_ys);
        Glide.with(mContext).load(UrlConfig.URL_BRAND_RVLIST_BASE + getFinalUrl(listBean.getAddImg().get(2), 800, 800)).into(viewholder.iv_fb_rvlist_zx);
        Glide.with(mContext).load(UrlConfig.URL_BRAND_RVLIST_BASE + getFinalUrl(listBean.getAddImg().get(3), 800, 800)).into(viewholder.iv_fb_rvlist_yx);
        Glide.with(mContext).load(getFinalUrl(listBean.getLogoImg(), 500, 300)).into(viewholder.iv_fb_rvlist_logo);
    }

    class MyViewholder extends RecyclerView.ViewHolder {
        ImageView iv_fb_rvlist_zs, iv_fb_rvlist_ys, iv_fb_rvlist_zx, iv_fb_rvlist_yx, iv_fb_rvlist_logo;
        TextView up_cnd, tv_fb_rvlist_bname, tv_fb_rvlist_bdsc, tv_fb__rvlist_cnt;
        Button btn_fb_rvlist;

        public MyViewholder(View itemView) {
            super(itemView);
            iv_fb_rvlist_ys = (ImageView) itemView.findViewById(R.id.iv_fb_rvlist_ys);
            iv_fb_rvlist_zs = (ImageView) itemView.findViewById(R.id.iv_fb_rvlist_zs);
            iv_fb_rvlist_zx = (ImageView) itemView.findViewById(R.id.iv_fb_rvlist_zx);
            iv_fb_rvlist_yx = (ImageView) itemView.findViewById(R.id.iv_fb_rvlist_yx);
            iv_fb_rvlist_logo = (ImageView) itemView.findViewById(R.id.iv_fb_rvlist_logo);
            up_cnd = (TextView) itemView.findViewById(R.id.up_cnd);
            tv_fb_rvlist_bname = (TextView) itemView.findViewById(R.id.tv_fb_rvlist_bname);
            tv_fb_rvlist_bdsc = (TextView) itemView.findViewById(R.id.tv_fb_rvlist_bdsc);
            tv_fb__rvlist_cnt = (TextView) itemView.findViewById(R.id.tv_fb__rvlist_cnt);
            btn_fb_rvlist = (Button) itemView.findViewById(R.id.btn_fb_rvlist);
        }
    }

    private String getFinalUrl(String imgUrl, int length, int width) {
        imgUrl = imgUrl.replace("${width}", "" + width);
        imgUrl = imgUrl.replace("${height}", "" + length);
        return imgUrl;
    }
}
