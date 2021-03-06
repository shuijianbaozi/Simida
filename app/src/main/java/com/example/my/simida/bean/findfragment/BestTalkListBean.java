package com.example.my.simida.bean.findfragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.annotations.SerializedName;

/**
 * Created by My on 2016/11/21.
 */

public  class BestTalkListBean extends RecyclerView.ViewHolder {
    @SerializedName("comment_cnt")
    private int commentCnt;
    @SerializedName("updt")
    private String updt;
    @SerializedName("cate_nm_zh")
    private String cateNmZh;
    @SerializedName("week")
    private Object week;
    @SerializedName("rank")
    private int rank;
    @SerializedName("is_my_like")
    private String isMyLike;
    @SerializedName("mid")
    private Object mid;
    @SerializedName("info_open_flag")
    private String infoOpenFlag;
    @SerializedName("img_cnt")
    private int imgCnt;
    @SerializedName("display_flag")
    private String displayFlag;
    @SerializedName("img_url")
    private String imgUrl;
    @SerializedName("use_flag")
    private String useFlag;
    @SerializedName("log_cate_no")
    private int logCateNo;
    @SerializedName("contents_list")
    private Object contentsList;
    @SerializedName("view_cnt")
    private int viewCnt;
    @SerializedName("talk_id")
    private int talkId;
    @SerializedName("stat_cd")
    private String statCd;
    @SerializedName("width")
    private int width;
    @SerializedName("contents4_detail")
    private String contents4Detail;
    @SerializedName("regdt")
    private String regdt;
    @SerializedName("img_domain")
    private Object imgDomain;
    @SerializedName("prof_img")
    private String profImg;
    @SerializedName("template")
    private String template;
    @SerializedName("collage_exist_flag")
    private String collageExistFlag;
    @SerializedName("height")
    private int height;
    @SerializedName("user_id")
    private int userId;
    @SerializedName("name")
    private String name;
    @SerializedName("up_user_id")
    private int upUserId;
    @SerializedName("contents")
    private String contents;
    @SerializedName("inflow_no")
    private Object inflowNo;
    @SerializedName("cate_no")
    private int cateNo;
    @SerializedName("like_cnt")
    private int likeCnt;
    @SerializedName("postscript_id")
    private int postscriptId;

    public BestTalkListBean(View itemView) {
        super(itemView);
    }

    public int getCommentCnt() {
        return commentCnt;
    }

    public void setCommentCnt(int commentCnt) {
        this.commentCnt = commentCnt;
    }

    public String getUpdt() {
        return updt;
    }

    public void setUpdt(String updt) {
        this.updt = updt;
    }

    public String getCateNmZh() {
        return cateNmZh;
    }

    public void setCateNmZh(String cateNmZh) {
        this.cateNmZh = cateNmZh;
    }

    public Object getWeek() {
        return week;
    }

    public void setWeek(Object week) {
        this.week = week;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getIsMyLike() {
        return isMyLike;
    }

    public void setIsMyLike(String isMyLike) {
        this.isMyLike = isMyLike;
    }

    public Object getMid() {
        return mid;
    }

    public void setMid(Object mid) {
        this.mid = mid;
    }

    public String getInfoOpenFlag() {
        return infoOpenFlag;
    }

    public void setInfoOpenFlag(String infoOpenFlag) {
        this.infoOpenFlag = infoOpenFlag;
    }

    public int getImgCnt() {
        return imgCnt;
    }

    public void setImgCnt(int imgCnt) {
        this.imgCnt = imgCnt;
    }

    public String getDisplayFlag() {
        return displayFlag;
    }

    public void setDisplayFlag(String displayFlag) {
        this.displayFlag = displayFlag;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public int getLogCateNo() {
        return logCateNo;
    }

    public void setLogCateNo(int logCateNo) {
        this.logCateNo = logCateNo;
    }

    public Object getContentsList() {
        return contentsList;
    }

    public void setContentsList(Object contentsList) {
        this.contentsList = contentsList;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public int getTalkId() {
        return talkId;
    }

    public void setTalkId(int talkId) {
        this.talkId = talkId;
    }

    public String getStatCd() {
        return statCd;
    }

    public void setStatCd(String statCd) {
        this.statCd = statCd;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getContents4Detail() {
        return contents4Detail;
    }

    public void setContents4Detail(String contents4Detail) {
        this.contents4Detail = contents4Detail;
    }

    public String getRegdt() {
        return regdt;
    }

    public void setRegdt(String regdt) {
        this.regdt = regdt;
    }

    public Object getImgDomain() {
        return imgDomain;
    }

    public void setImgDomain(Object imgDomain) {
        this.imgDomain = imgDomain;
    }

    public String getProfImg() {
        return profImg;
    }

    public void setProfImg(String profImg) {
        this.profImg = profImg;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getCollageExistFlag() {
        return collageExistFlag;
    }

    public void setCollageExistFlag(String collageExistFlag) {
        this.collageExistFlag = collageExistFlag;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUpUserId() {
        return upUserId;
    }

    public void setUpUserId(int upUserId) {
        this.upUserId = upUserId;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Object getInflowNo() {
        return inflowNo;
    }

    public void setInflowNo(Object inflowNo) {
        this.inflowNo = inflowNo;
    }

    public int getCateNo() {
        return cateNo;
    }

    public void setCateNo(int cateNo) {
        this.cateNo = cateNo;
    }

    public int getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(int likeCnt) {
        this.likeCnt = likeCnt;
    }

    public int getPostscriptId() {
        return postscriptId;
    }

    public void setPostscriptId(int postscriptId) {
        this.postscriptId = postscriptId;
    }

    @Override
    public String toString() {
        return "BestTalkListBean{" +
                "commentCnt=" + commentCnt +
                ", updt='" + updt + '\'' +
                ", cateNmZh='" + cateNmZh + '\'' +
                ", week=" + week +
                ", rank=" + rank +
                ", isMyLike='" + isMyLike + '\'' +
                ", mid=" + mid +
                ", infoOpenFlag='" + infoOpenFlag + '\'' +
                ", imgCnt=" + imgCnt +
                ", displayFlag='" + displayFlag + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", useFlag='" + useFlag + '\'' +
                ", logCateNo=" + logCateNo +
                ", contentsList=" + contentsList +
                ", viewCnt=" + viewCnt +
                ", talkId=" + talkId +
                ", statCd='" + statCd + '\'' +
                ", width=" + width +
                ", contents4Detail='" + contents4Detail + '\'' +
                ", regdt='" + regdt + '\'' +
                ", imgDomain=" + imgDomain +
                ", profImg='" + profImg + '\'' +
                ", template='" + template + '\'' +
                ", collageExistFlag='" + collageExistFlag + '\'' +
                ", height=" + height +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", upUserId=" + upUserId +
                ", contents='" + contents + '\'' +
                ", inflowNo=" + inflowNo +
                ", cateNo=" + cateNo +
                ", likeCnt=" + likeCnt +
                ", postscriptId=" + postscriptId +
                '}';
    }
}