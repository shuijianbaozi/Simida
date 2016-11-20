package com.example.my.simida.bean.shopdata;

import com.google.gson.annotations.SerializedName;

/**
 * Created by apple on 16/11/19.
 */
public class HotTrendListBean {
    @Override
    public String toString() {
        return "HotTrendListBean{" +
                "repImgUrl='" + repImgUrl + '\'' +
                ", shopNo=" + shopNo +
                ", likeNo=" + likeNo +
                ", dpDeliCost='" + dpDeliCost + '\'' +
                ", shippingFree='" + shippingFree + '\'' +
                ", avrDeliDate=" + avrDeliDate +
                ", cate3Nm='" + cate3Nm + '\'' +
                ", img='" + img + '\'' +
                ", brandDesc=" + brandDesc +
                ", mainImgUrl='" + mainImgUrl + '\'' +
                ", ceilSelPrice=" + ceilSelPrice +
                ", selPrice=" + selPrice +
                ", ceilSalePrice=" + ceilSalePrice +
                ", prdNo=" + prdNo +
                ", prdNm='" + prdNm + '\'' +
                ", brandNm='" + brandNm + '\'' +
                ", likeCnt=" + likeCnt +
                ", cate2Nm='" + cate2Nm + '\'' +
                ", imgCnt=" + imgCnt +
                ", salePrice=" + salePrice +
                ", discountInfo='" + discountInfo + '\'' +
                ", yesDeliCost=" + yesDeliCost +
                ", linkUrl='" + linkUrl + '\'' +
                ", typeCd='" + typeCd + '\'' +
                ", display='" + display + '\'' +
                ", dscRt='" + dscRt + '\'' +
                ", cate1Nm='" + cate1Nm + '\'' +
                ", logoImg='" + logoImg + '\'' +
                ", quickDeli='" + quickDeli + '\'' +
                '}';
    }

    @SerializedName("rep_img_url")
    private String repImgUrl;
    @SerializedName("shop_no")
    private int shopNo;
    @SerializedName("like_no")
    private int likeNo;
    @SerializedName("dp_deli_cost")
    private String dpDeliCost;
    @SerializedName("shipping_free")
    private String shippingFree;
    @SerializedName("avr_deli_date")
    private int avrDeliDate;
    @SerializedName("cate3_nm")
    private String cate3Nm;
    @SerializedName("img")
    private String img;
    @SerializedName("brand_desc")
    private Object brandDesc;
    @SerializedName("main_img_url")
    private String mainImgUrl;
    @SerializedName("ceil_sel_price")
    private int ceilSelPrice;
    @SerializedName("sel_price")
    private double selPrice;
    @SerializedName("ceil_sale_price")
    private int ceilSalePrice;
    @SerializedName("prd_no")
    private int prdNo;
    @SerializedName("prd_nm")
    private String prdNm;
    @SerializedName("brand_nm")
    private String brandNm;
    @SerializedName("like_cnt")
    private int likeCnt;
    @SerializedName("cate2_nm")
    private String cate2Nm;
    @SerializedName("img_cnt")
    private int imgCnt;
    @SerializedName("sale_price")
    private double salePrice;
    @SerializedName("discount_info")
    private String discountInfo;
    @SerializedName("yes_deli_cost")
    private int yesDeliCost;
    @SerializedName("link_url")
    private String linkUrl;
    @SerializedName("type_cd")
    private String typeCd;
    @SerializedName("display")
    private String display;
    @SerializedName("dsc_rt")
    private String dscRt;
    @SerializedName("cate1_nm")
    private String cate1Nm;
    @SerializedName("logo_img")
    private String logoImg;
    @SerializedName("quick_deli")
    private String quickDeli;

    public String getRepImgUrl() {
        return repImgUrl;
    }

    public void setRepImgUrl(String repImgUrl) {
        this.repImgUrl = repImgUrl;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public int getLikeNo() {
        return likeNo;
    }

    public void setLikeNo(int likeNo) {
        this.likeNo = likeNo;
    }

    public String getDpDeliCost() {
        return dpDeliCost;
    }

    public void setDpDeliCost(String dpDeliCost) {
        this.dpDeliCost = dpDeliCost;
    }

    public String getShippingFree() {
        return shippingFree;
    }

    public void setShippingFree(String shippingFree) {
        this.shippingFree = shippingFree;
    }

    public int getAvrDeliDate() {
        return avrDeliDate;
    }

    public void setAvrDeliDate(int avrDeliDate) {
        this.avrDeliDate = avrDeliDate;
    }

    public String getCate3Nm() {
        return cate3Nm;
    }

    public void setCate3Nm(String cate3Nm) {
        this.cate3Nm = cate3Nm;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Object getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(Object brandDesc) {
        this.brandDesc = brandDesc;
    }

    public String getMainImgUrl() {
        return mainImgUrl;
    }

    public void setMainImgUrl(String mainImgUrl) {
        this.mainImgUrl = mainImgUrl;
    }

    public int getCeilSelPrice() {
        return ceilSelPrice;
    }

    public void setCeilSelPrice(int ceilSelPrice) {
        this.ceilSelPrice = ceilSelPrice;
    }

    public double getSelPrice() {
        return selPrice;
    }

    public void setSelPrice(double selPrice) {
        this.selPrice = selPrice;
    }

    public int getCeilSalePrice() {
        return ceilSalePrice;
    }

    public void setCeilSalePrice(int ceilSalePrice) {
        this.ceilSalePrice = ceilSalePrice;
    }

    public int getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(int prdNo) {
        this.prdNo = prdNo;
    }

    public String getPrdNm() {
        return prdNm;
    }

    public void setPrdNm(String prdNm) {
        this.prdNm = prdNm;
    }

    public String getBrandNm() {
        return brandNm;
    }

    public void setBrandNm(String brandNm) {
        this.brandNm = brandNm;
    }

    public int getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(int likeCnt) {
        this.likeCnt = likeCnt;
    }

    public String getCate2Nm() {
        return cate2Nm;
    }

    public void setCate2Nm(String cate2Nm) {
        this.cate2Nm = cate2Nm;
    }

    public int getImgCnt() {
        return imgCnt;
    }

    public void setImgCnt(int imgCnt) {
        this.imgCnt = imgCnt;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }

    public int getYesDeliCost() {
        return yesDeliCost;
    }

    public void setYesDeliCost(int yesDeliCost) {
        this.yesDeliCost = yesDeliCost;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDscRt() {
        return dscRt;
    }

    public void setDscRt(String dscRt) {
        this.dscRt = dscRt;
    }

    public String getCate1Nm() {
        return cate1Nm;
    }

    public void setCate1Nm(String cate1Nm) {
        this.cate1Nm = cate1Nm;
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public String getQuickDeli() {
        return quickDeli;
    }

    public void setQuickDeli(String quickDeli) {
        this.quickDeli = quickDeli;
    }
}