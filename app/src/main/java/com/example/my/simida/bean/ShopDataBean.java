package com.example.my.simida.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by apple on 16/11/23.
 */

public class ShopDataBean extends BmobObject {
    String prdnm;
    String repimgurl;
    String salePrice;
    String itemcount;

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

    public String getItemcount() {
        return itemcount;
    }

    public void setItemcount(String itemcount) {
        this.itemcount = itemcount;
    }
}
