package com.example.my.simida.bean.goodsdata;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Asus on 2016/11/22.
 */

public class ProductBean {
    /**
     * shop_no : 10000155
     * like_no : 0
     * dp_deli_cost : F
     * cate_nm : 袜子
     * promo :
     * avr_deli_date : 2
     * shipping_free : F
     * brand_desc : null
     * main_img_url : http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/82/74/11/0/11748259.jpg
     * discount_date :
     * is_cos_cate : N
     * is_shoe_cate : N
     * sel_price : 93.49
     * prd_no : 10420338
     * prd_nm : 配色袜子5件套
     * brand_nm : MODELAMI
     * like_cnt : 33
     * cate_no : 10000241
     * rank_rt : 0.1215
     * brand_logo : http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png
     * discount_rate : 0
     * img_cnt : 1
     * share_img_url : http://img.thestyledo.cn/tll/${width}x${height}/src/upload/prod/2016/11/82/74/11/0/11748259.jpg
     * sale_price : 93.49
     * type_cd : null
     * deli_cost : 10
     * display : T
     * add_shipping : F
     * cart_type : 01
     * quick_deli : F
     */

    @SerializedName("shop_no")
    private int shopNo;
    @SerializedName("like_no")
    private int likeNo;
    @SerializedName("dp_deli_cost")
    private String dpDeliCost;
    @SerializedName("cate_nm")
    private String cateNm;
    @SerializedName("promo")
    private String promo;
    @SerializedName("avr_deli_date")
    private int avrDeliDate;
    @SerializedName("shipping_free")
    private String shippingFree;
    @SerializedName("brand_desc")
    private Object brandDesc;
    @SerializedName("main_img_url")
    private String mainImgUrl;
    @SerializedName("discount_date")
    private String discountDate;
    @SerializedName("is_cos_cate")
    private String isCosCate;
    @SerializedName("is_shoe_cate")
    private String isShoeCate;
    @SerializedName("sel_price")
    private double selPrice;
    @SerializedName("prd_no")
    private int prdNo;
    @SerializedName("prd_nm")
    private String prdNm;
    @SerializedName("brand_nm")
    private String brandNm;
    @SerializedName("like_cnt")
    private int likeCnt;
    @SerializedName("cate_no")
    private int cateNo;
    @SerializedName("rank_rt")
    private double rankRt;
    @SerializedName("brand_logo")
    private String brandLogo;
    @SerializedName("discount_rate")
    private int discountRate;
    @SerializedName("img_cnt")
    private int imgCnt;
    @SerializedName("share_img_url")
    private String shareImgUrl;
    @SerializedName("sale_price")
    private double salePrice;
    @SerializedName("type_cd")
    private Object typeCd;
    @SerializedName("deli_cost")
    private int deliCost;
    @SerializedName("display")
    private String display;
    @SerializedName("add_shipping")
    private String addShipping;
    @SerializedName("cart_type")
    private String cartType;
    @SerializedName("quick_deli")
    private String quickDeli;

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

    public String getCateNm() {
        return cateNm;
    }

    public void setCateNm(String cateNm) {
        this.cateNm = cateNm;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public int getAvrDeliDate() {
        return avrDeliDate;
    }

    public void setAvrDeliDate(int avrDeliDate) {
        this.avrDeliDate = avrDeliDate;
    }

    public String getShippingFree() {
        return shippingFree;
    }

    public void setShippingFree(String shippingFree) {
        this.shippingFree = shippingFree;
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

    public String getDiscountDate() {
        return discountDate;
    }

    public void setDiscountDate(String discountDate) {
        this.discountDate = discountDate;
    }

    public String getIsCosCate() {
        return isCosCate;
    }

    public void setIsCosCate(String isCosCate) {
        this.isCosCate = isCosCate;
    }

    public String getIsShoeCate() {
        return isShoeCate;
    }

    public void setIsShoeCate(String isShoeCate) {
        this.isShoeCate = isShoeCate;
    }

    public double getSelPrice() {
        return selPrice;
    }

    public void setSelPrice(double selPrice) {
        this.selPrice = selPrice;
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

    public int getCateNo() {
        return cateNo;
    }

    public void setCateNo(int cateNo) {
        this.cateNo = cateNo;
    }

    public double getRankRt() {
        return rankRt;
    }

    public void setRankRt(double rankRt) {
        this.rankRt = rankRt;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getImgCnt() {
        return imgCnt;
    }

    public void setImgCnt(int imgCnt) {
        this.imgCnt = imgCnt;
    }

    public String getShareImgUrl() {
        return shareImgUrl;
    }

    public void setShareImgUrl(String shareImgUrl) {
        this.shareImgUrl = shareImgUrl;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public Object getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(Object typeCd) {
        this.typeCd = typeCd;
    }

    public int getDeliCost() {
        return deliCost;
    }

    public void setDeliCost(int deliCost) {
        this.deliCost = deliCost;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getAddShipping() {
        return addShipping;
    }

    public void setAddShipping(String addShipping) {
        this.addShipping = addShipping;
    }

    public String getCartType() {
        return cartType;
    }

    public void setCartType(String cartType) {
        this.cartType = cartType;
    }

    public String getQuickDeli() {
        return quickDeli;
    }

    public void setQuickDeli(String quickDeli) {
        this.quickDeli = quickDeli;
    }
}
