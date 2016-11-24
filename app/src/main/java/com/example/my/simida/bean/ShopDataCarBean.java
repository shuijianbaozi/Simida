package com.example.my.simida.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by apple on 16/11/23.
 */

public class ShopDataCarBean extends BmobObject {
    String prdnm;
    String repimgurl;
    String salePrice;
    int itemcount;


    public String getPrdnm() {
        return prdnm;
    }

    public void setPrdnm(String prdnm) {
        this.prdnm = prdnm;
    }

    public String getRepimgurl() {
        return repimgurl;
    }

    public void setRepimgurl(String repimgurl) {
        this.repimgurl = repimgurl;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public int getItemcount() {
        return itemcount;
    }

    public void setItemcount(int itemcount) {
        this.itemcount = itemcount;
    }
}
