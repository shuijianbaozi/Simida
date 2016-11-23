package com.example.my.simida.bean.goodsdata;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Asus on 2016/11/22.
 */

public class DescriptionBean {
    /**
     * desc_info : 5款
     * desc_item : 颜色
     */

    @SerializedName("desc_info")
    private String descInfo;
    @SerializedName("desc_item")
    private String descItem;

    public String getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }
}
