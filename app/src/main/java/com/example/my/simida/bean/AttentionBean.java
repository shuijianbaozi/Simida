package com.example.my.simida.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by apple on 16/11/23.
 */

public class AttentionBean extends BmobObject {
    String logoimg;
    String brandname;

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getLogoimg() {
        return logoimg;
    }

    public void setLogoimg(String logoimg) {
        this.logoimg = logoimg;
    }

}
