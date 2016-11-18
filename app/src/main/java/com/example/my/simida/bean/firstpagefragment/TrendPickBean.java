package com.example.my.simida.bean.firstpagefragment;

import com.google.gson.annotations.SerializedName;

/**
 * Created by My on 2016/11/17.
 */

public class TrendPickBean {
    /**
     * collection_talk_cnt : 4
     * rep_img_url : http://img.thestyledo.cn/tlw/${width}x${height}/upload/hi_banner/2016/11/36/74/11/0/11743640.jpg
     * collection_id : 472
     * text1 : 韩货 · WISH
     * text2 : 我们一起做吃土少女
     * seq : 24
     * cate_no : 3001
     * log_cate_no : 3001
     */

    @SerializedName("collection_talk_cnt")
    private int collectionTalkCnt;
    @SerializedName("rep_img_url")
    private String repImgUrl;
    @SerializedName("collection_id")
    private int collectionId;
    @SerializedName("text1")
    private String text1;
    @SerializedName("text2")
    private String text2;
    @SerializedName("seq")
    private int seq;
    @SerializedName("cate_no")
    private String cateNo;
    @SerializedName("log_cate_no")
    private String logCateNo;

    public int getCollectionTalkCnt() {
        return collectionTalkCnt;
    }

    public void setCollectionTalkCnt(int collectionTalkCnt) {
        this.collectionTalkCnt = collectionTalkCnt;
    }

    public String getRepImgUrl() {
        return repImgUrl;
    }

    public void setRepImgUrl(String repImgUrl) {
        this.repImgUrl = repImgUrl;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getCateNo() {
        return cateNo;
    }

    public void setCateNo(String cateNo) {
        this.cateNo = cateNo;
    }

    public String getLogCateNo() {
        return logCateNo;
    }

    public void setLogCateNo(String logCateNo) {
        this.logCateNo = logCateNo;
    }
}
