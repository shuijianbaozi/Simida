package com.example.my.simida.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.my.simida.R;
import com.example.my.simida.bean.BuyBean;
import com.example.my.simida.bean.ShopDataCarBean;
import com.example.my.simida.ui.adapter.ShopCarAdapter;
import com.example.my.simida.utils.UIManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

public class ShopcarActivity extends AppCompatActivity {

    @BindView(R.id.rv_shopcar_list)
    RecyclerView rvShopcarList;
    @BindView(R.id.activity_shopcar)
    LinearLayout activityShopcar;
    @BindView(R.id.tv_shopcar_back)
    TextView tvShopcarBack;
    @BindView(R.id.tv_shopcar_buy)
    TextView tvShopcarBuy;
    @BindView(R.id.toolbar_shopcar)
    Toolbar toolbarShopcar;
    private Context mContext = this;
    private static final String TAG = "ShopcarActivity";
    private List<ShopDataCarBean> mShopCarList = new ArrayList<>();
    private ShopCarAdapter mCarAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopcar);
        ButterKnife.bind(this);
        initToolbar();
        initRecycle();

        initData();
    }

    private void initToolbar() {
        setSupportActionBar(toolbarShopcar);
        tvShopcarBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuyBean buyBean = new BuyBean();
                buyBean.setShopDataCarBeen(mShopCarList);
                UIManager.startBuy(mContext, buyBean);
            }
        });
    }

    private void initRecycle() {
        mCarAdapter = new ShopCarAdapter(mContext, mShopCarList);
        LinearLayoutManager manager = new LinearLayoutManager(mContext, OrientationHelper.VERTICAL, false);
        rvShopcarList.setLayoutManager(manager);
        rvShopcarList.setAdapter(mCarAdapter);
    }

    private void initData() {
        //只返回Person表的objectId这列的值
        BmobQuery<ShopDataCarBean> bmobQuery = new BmobQuery<ShopDataCarBean>();
//        bmobQuery.addQueryKeys("objectId");
        bmobQuery.findObjects(new FindListener<ShopDataCarBean>() {
                                  @Override
                                  public void done(final List<ShopDataCarBean> object, BmobException e) {
                                      if (e == null) {
                                          //注意：这里的Person对象中只有指定列的数据。
                                          for (int i = 0; i < object.size(); i++) {
                                              Log.e("item", object.get(i).getPrdnm() + "");
                                          }
                                          mShopCarList.addAll(object);
                                          Log.e("item", "" + object.size());

                                          Log.e("item", "+++++++" + mShopCarList.size());

                                          mCarAdapter.notifyDataSetChanged();

                                      } else {
                                          Log.e(TAG, "done: " + "查询失败");
                                      }
                                  }
                              }

        );

    }

}
