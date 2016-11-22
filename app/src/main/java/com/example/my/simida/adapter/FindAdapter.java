package com.example.my.simida.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.my.simida.App;
import com.example.my.simida.R;
import com.example.my.simida.bean.findfragment.BestTalkListBean;
import com.example.my.simida.bean.findfragment.FindBean;
import com.example.my.simida.utils.RecyclerViewAdapterHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by My on 2016/11/21.
 */

public class FindAdapter extends RecyclerViewAdapterHelper<FindBean.ResultBean.BestTalkListBean> {
    private static final String TAG = "==========";
    private FindAdapter.IFindOnItemClickListener listener;

    public interface IFindOnItemClickListener {
        void onItemClick(int userId);

        void onItemLongClick(int position);
    }


    public FindAdapter(Context context, List<FindBean.ResultBean.BestTalkListBean> list, FindAdapter.IFindOnItemClickListener listener) {
        super(context, list);
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        Log.i(TAG, mList.size() + "====");
        return super.getItemCount();
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View inflate = mInflater.inflate(R.layout.item_find, null);
        return new FindViewHolder(inflate);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        FindViewHolder findViewHolder = (FindViewHolder) holder;
        final FindBean.ResultBean.BestTalkListBean bestTalkListBean = mList.get(position);
        Glide.with(mContext)
                .load(App.getFinalUrl(bestTalkListBean.getProfImg(), 64, 64))
                .into(findViewHolder.findProfImg);

        findViewHolder.findName.setText(bestTalkListBean.getName());
        findViewHolder.findCatename.setText(bestTalkListBean.getCateNmZh());
        findViewHolder.regdt.setText(bestTalkListBean.getRegdt());
        //大图
        Glide.with(mContext)
                .load(App.getFinalUrl(bestTalkListBean.getImgUrl(), 300, 200))
                .override(330, 200)
                .centerCrop()
                .into(findViewHolder.findBigpicture);

        findViewHolder.findConstantDetail.setText(bestTalkListBean.getContents4Detail());
        findViewHolder.findViewText.setText(bestTalkListBean.getViewCnt() + "");
        findViewHolder.findLikeText.setText(bestTalkListBean.getLikeCnt() + "");
        findViewHolder.findReplyText.setText(bestTalkListBean.getCommentCnt() + "");

    }

    class FindViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.find_prof_img)
        ImageView findProfImg;
        @BindView(R.id.find_name)
        TextView findName;
        @BindView(R.id.find_catename)
        TextView findCatename;
        @BindView(R.id.regdt)
        TextView regdt;
        @BindView(R.id.find_bigpicture)
        ImageView findBigpicture;
        @BindView(R.id.find_constant_detail)
        TextView findConstantDetail;
        @BindView(R.id.find_viewText)
        TextView findViewText;
        @BindView(R.id.find_likeText)
        TextView findLikeText;
        @BindView(R.id.find_replyText)
        TextView findReplyText;

        public FindViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}

