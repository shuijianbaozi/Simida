package com.example.my.simida.bean.firstpagefragment;

import com.google.gson.annotations.SerializedName;

/**
 * Created by My on 2016/11/17.
 */

public class StylePickBean {
    /**
     * rep_img_url : http://img.thestyledo.cn/tlw/${width}x${height}/upload/style/2016/10/87/66/11/0/11668756.png
     * stylepick_id : 17
     * cnt : 8675
     * style_name : 日常
     */

    @SerializedName("rep_img_url")
    private String repImgUrl;
    @SerializedName("stylepick_id")
    private String stylepickId;
    @SerializedName("cnt")
    private int cnt;
    @SerializedName("style_name")
    private String styleName;

    public String getRepImgUrl() {
        return repImgUrl;
    }

    public void setRepImgUrl(String repImgUrl) {
        this.repImgUrl = repImgUrl;
    }

    public String getStylepickId() {
        return stylepickId;
    }

    public void setStylepickId(String stylepickId) {
        this.stylepickId = stylepickId;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
}
