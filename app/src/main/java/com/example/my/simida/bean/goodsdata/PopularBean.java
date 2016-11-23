package com.example.my.simida.bean.goodsdata;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Asus on 2016/11/22.
 */

public class PopularBean {
    /**
     * sel_price : 28.63
     * rep_img_url : http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2015/12/45/79/10/0/10794599.jpg
     * prd_no : 10260696
     * shop_no : 10000046
     * ceil_sale_price : 29
     * prd_nm : 纯棉竹节纹袜子
     * sale_price : 28.63
     * dsc_rt :
     * ceil_sel_price : 29
     */

    @SerializedName("sel_price")
    private double selPrice;
    @SerializedName("rep_img_url")
    private String repImgUrl;
    @SerializedName("prd_no")
    private int prdNo;
    @SerializedName("shop_no")
    private int shopNo;
    @SerializedName("ceil_sale_price")
    private int ceilSalePrice;
    @SerializedName("prd_nm")
    private String prdNm;
    @SerializedName("sale_price")
    private double salePrice;
    @SerializedName("dsc_rt")
    private String dscRt;
    @SerializedName("ceil_sel_price")
    private int ceilSelPrice;

    public double getSelPrice() {
        return selPrice;
    }

    public void setSelPrice(double selPrice) {
        this.selPrice = selPrice;
    }

    public String getRepImgUrl() {
        return repImgUrl;
    }

    public void setRepImgUrl(String repImgUrl) {
        this.repImgUrl = repImgUrl;
    }

    public int getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(int prdNo) {
        this.prdNo = prdNo;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public int getCeilSalePrice() {
        return ceilSalePrice;
    }

    public void setCeilSalePrice(int ceilSalePrice) {
        this.ceilSalePrice = ceilSalePrice;
    }

    public String getPrdNm() {
        return prdNm;
    }

    public void setPrdNm(String prdNm) {
        this.prdNm = prdNm;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getDscRt() {
        return dscRt;
    }

    public void setDscRt(String dscRt) {
        this.dscRt = dscRt;
    }

    public int getCeilSelPrice() {
        return ceilSelPrice;
    }

    public void setCeilSelPrice(int ceilSelPrice) {
        this.ceilSelPrice = ceilSelPrice;
    }
}
