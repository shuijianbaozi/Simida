package com.example.my.simida.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 16/11/24.
 */

public class BuyBean implements Parcelable {
    List<ShopDataCarBean> shopDataCarBeen;

    public List<ShopDataCarBean> getShopDataCarBeen() {
        return shopDataCarBeen;
    }

    public void setShopDataCarBeen(List<ShopDataCarBean> shopDataCarBeen) {
        this.shopDataCarBeen = shopDataCarBeen;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.shopDataCarBeen);
    }

    public BuyBean() {
    }

    protected BuyBean(Parcel in) {
        this.shopDataCarBeen = new ArrayList<ShopDataCarBean>();
        in.readList(this.shopDataCarBeen, ShopDataCarBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<BuyBean> CREATOR = new Parcelable.Creator<BuyBean>() {
        @Override
        public BuyBean createFromParcel(Parcel source) {
            return new BuyBean(source);
        }

        @Override
        public BuyBean[] newArray(int size) {
            return new BuyBean[size];
        }
    };
}
