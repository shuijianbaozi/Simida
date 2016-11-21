//package com.example.my.simida.adapter;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import com.example.my.simida.R;
//import com.example.my.simida.bean.firstpagefragment.MdPickBean;
//import com.example.my.simida.bean.firstpagefragment.StylePickBean;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
///**
// * Created by Asus on 2016/11/21.
// */
//
//public class Firstpage_xrecyclerview extends RecyclerView.Adapter {
//    private Context mContext;
//
//    public Firstpage_xrecyclerview(Context mContext,) {
//        this.mContext = mContext;
//    }
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_recyclerview_vertical, parent, false);
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        Firstpage_Recycler1_Adapter firstpage_recycler1_adapter = new Firstpage_Recycler1_Adapter(Context context, List< MdPickBean.MdPickListBean> list, Firstpage_Recycler2_Adapter.IOnItemClickListener mOnItemClickListener);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    class ViewHolder extends RecyclerView.ViewHolder{
//
//
//        public ViewHolder(View itemView) {
//           super(itemView);
//           ButterKnife.bind(this, itemView);
//
//        }
//
//
//    }
//}
