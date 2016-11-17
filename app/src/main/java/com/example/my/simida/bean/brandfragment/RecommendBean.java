package com.example.my.simida.bean.brandfragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by apple on 16/11/17.
 */
public class RecommendBean {
    /**
     * shop_no : 10000155
     * logo_img : http://img.thestyledo.cn/tl/${width}x${height}/upload/brandshop/2016/11/29/71/11/0/11712954.png
     * promotion : T
     * banner_img : http://img.thestyledo.cn/tl/${width}x${height}/upload/brandshop/2016/11/26/71/11/0/11712643.jpg
     */

    @SerializedName("new_list")
    private List<NewListBean> newList;
    /**
     * shop_no : 10000002
     * logo_img : http://img.thestyledo.cn/tl/${width}x${height}/upload/brandshop/2015/09/82/64/10/0/10648220.png
     */

    @SerializedName("brand_list")
    private List<BrandListBean> brandList;
    /**
     * shop_no : 10000070
     * logo_img : http://img.thestyledo.cn/tl/${width}x${height}/upload/brandshop/2016/03/45/95/10/0/10954545.png
     * banner_img : http://img.thestyledo.cn/tl/${width}x${height}/upload/brandshop/2016/11/97/71/11/0/11719759.jpg
     * sale : T
     */

    @SerializedName("other_list")
    private List<OtherListBean> otherList;

    public List<NewListBean> getNewList() {
        return newList;
    }

    public void setNewList(List<NewListBean> newList) {
        this.newList = newList;
    }

    public List<BrandListBean> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<BrandListBean> brandList) {
        this.brandList = brandList;
    }

    public List<OtherListBean> getOtherList() {
        return otherList;
    }

    public void setOtherList(List<OtherListBean> otherList) {
        this.otherList = otherList;
    }

    public static class NewListBean {
        @SerializedName("shop_no")
        private int shopNo;
        @SerializedName("logo_img")
        private String logoImg;
        @SerializedName("promotion")
        private String promotion;
        @SerializedName("banner_img")
        private String bannerImg;

        public int getShopNo() {
            return shopNo;
        }

        public void setShopNo(int shopNo) {
            this.shopNo = shopNo;
        }

        public String getLogoImg() {
            return logoImg;
        }

        public void setLogoImg(String logoImg) {
            this.logoImg = logoImg;
        }

        public String getPromotion() {
            return promotion;
        }

        public void setPromotion(String promotion) {
            this.promotion = promotion;
        }

        public String getBannerImg() {
            return bannerImg;
        }

        public void setBannerImg(String bannerImg) {
            this.bannerImg = bannerImg;
        }
    }

    public static class BrandListBean {
        @SerializedName("shop_no")
        private int shopNo;
        @SerializedName("logo_img")
        private String logoImg;

        public int getShopNo() {
            return shopNo;
        }

        public void setShopNo(int shopNo) {
            this.shopNo = shopNo;
        }

        public String getLogoImg() {
            return logoImg;
        }

        public void setLogoImg(String logoImg) {
            this.logoImg = logoImg;
        }
    }

    public static class OtherListBean {
        @SerializedName("shop_no")
        private int shopNo;
        @SerializedName("logo_img")
        private String logoImg;
        @SerializedName("banner_img")
        private String bannerImg;
        @SerializedName("sale")
        private String sale;

        public int getShopNo() {
            return shopNo;
        }

        public void setShopNo(int shopNo) {
            this.shopNo = shopNo;
        }

        public String getLogoImg() {
            return logoImg;
        }

        public void setLogoImg(String logoImg) {
            this.logoImg = logoImg;
        }

        public String getBannerImg() {
            return bannerImg;
        }

        public void setBannerImg(String bannerImg) {
            this.bannerImg = bannerImg;
        }

        public String getSale() {
            return sale;
        }

        public void setSale(String sale) {
            this.sale = sale;
        }
    }
}