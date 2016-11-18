package com.example.my.simida.bean.typefragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by My on 2016/11/18.
 */
public  class ListBean {
    @SerializedName("rep_img_url")
    private String repImgUrl;
    @SerializedName("template")
    private String template;
    @SerializedName("app_link_url")
    private String appLinkUrl;
    @SerializedName("title")
    private String title;
    @SerializedName("img_cnt")
    private int imgCnt;
    @SerializedName("bno")
    private int bno;
    @SerializedName("link_url_type")
    private String linkUrlType;
    @SerializedName("link_obj_param")
    private String linkObjParam;
    @SerializedName("link_url")
    private String linkUrl;
    @SerializedName("dtl_desc")
    private String dtlDesc;
    @SerializedName("rep_img_url_list")
    private List<String> repImgUrlList;

    public String getRepImgUrl() {
        return repImgUrl;
    }

    public void setRepImgUrl(String repImgUrl) {
        this.repImgUrl = repImgUrl;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getAppLinkUrl() {
        return appLinkUrl;
    }

    public void setAppLinkUrl(String appLinkUrl) {
        this.appLinkUrl = appLinkUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgCnt() {
        return imgCnt;
    }

    public void setImgCnt(int imgCnt) {
        this.imgCnt = imgCnt;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getLinkUrlType() {
        return linkUrlType;
    }

    public void setLinkUrlType(String linkUrlType) {
        this.linkUrlType = linkUrlType;
    }

    public String getLinkObjParam() {
        return linkObjParam;
    }

    public void setLinkObjParam(String linkObjParam) {
        this.linkObjParam = linkObjParam;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getDtlDesc() {
        return dtlDesc;
    }

    public void setDtlDesc(String dtlDesc) {
        this.dtlDesc = dtlDesc;
    }

    public List<String> getRepImgUrlList() {
        return repImgUrlList;
    }

    public void setRepImgUrlList(List<String> repImgUrlList) {
        this.repImgUrlList = repImgUrlList;
    }
}