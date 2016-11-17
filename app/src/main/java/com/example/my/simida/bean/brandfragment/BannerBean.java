package com.example.my.simida.bean.brandfragment;

import com.google.gson.annotations.SerializedName;

/**
 * Created by apple on 16/11/17.
 */


public class BannerBean {
    @SerializedName("bno")
    private int bno;
    @SerializedName("link_url")
    private String linkUrl;
    @SerializedName("banner_link")
    private String bannerLink;
    @SerializedName("banner_img")
    private String bannerImg;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getBannerLink() {
        return bannerLink;
    }

    public void setBannerLink(String bannerLink) {
        this.bannerLink = bannerLink;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }
}