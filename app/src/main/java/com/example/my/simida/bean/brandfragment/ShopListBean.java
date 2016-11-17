package com.example.my.simida.bean.brandfragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by apple on 16/11/17.
 */
public class ShopListBean {
    /**
     * cate_nm : 全部
     * shop_grp_cd : 00
     */

    @SerializedName("categories")
    private List<CategoriesBean> categories;
    /**
     * shop_no : 10000057
     * subs_cnt : 78536
     * shipping_free : F
     * brand_desc : 女装 | 10代学生人气网络品牌
     * addImgNew : [{"rep_img_url":"/upload/prod/2016/11/50/74/11/0/11745089.jpg","prd_no":10419812,"shop_no":10000057},{"rep_img_url":"/upload/prod/2016/11/49/74/11/0/11744995.jpg","prd_no":10419800,"shop_no":10000057},{"rep_img_url":"/upload/prod/2016/11/49/74/11/0/11744921.jpg","prd_no":10419787,"shop_no":10000057},{"rep_img_url":"/upload/prod/2016/11/48/74/11/0/11744873.jpg","prd_no":10419776,"shop_no":10000057}]
     * new_brand_desc : 女装 | michyeora 韩国10代人气网络品牌
     * shop_grp_cd : 10
     * brand_nm : MICHYEORA
     * logo_img : http://img.thestyledo.cn/tlc/${width}x${height}/upload/brandshop/2015/04/7/33/10/0/10330787.png
     * sale_flag : F
     * addImg : ["/upload/prod/2016/11/50/74/11/0/11745089.jpg","/upload/prod/2016/11/49/74/11/0/11744995.jpg","/upload/prod/2016/11/49/74/11/0/11744921.jpg","/upload/prod/2016/11/48/74/11/0/11744873.jpg"]
     * quick_deli : F
     * new_product_items : [{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/50/74/11/0/11745089.jpg","shop_no":10000057,"prd_no":10419812},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/49/74/11/0/11744995.jpg","shop_no":10000057,"prd_no":10419800},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/49/74/11/0/11744921.jpg","shop_no":10000057,"prd_no":10419787},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/48/74/11/0/11744873.jpg","shop_no":10000057,"prd_no":10419776}]
     * up_prd_cnt : 21
     * subs_seq_no : 0
     * rank_rt : 6.93
     * issue_cupn : N
     */

    @SerializedName("list")
    private List<ListBean> list;

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CategoriesBean {
        @SerializedName("cate_nm")
        private String cateNm;
        @SerializedName("shop_grp_cd")
        private String shopGrpCd;

        public String getCateNm() {
            return cateNm;
        }

        public void setCateNm(String cateNm) {
            this.cateNm = cateNm;
        }

        public String getShopGrpCd() {
            return shopGrpCd;
        }

        public void setShopGrpCd(String shopGrpCd) {
            this.shopGrpCd = shopGrpCd;
        }
    }

    public static class ListBean {
        @SerializedName("shop_no")
        private int shopNo;
        @SerializedName("subs_cnt")
        private int subsCnt;
        @SerializedName("shipping_free")
        private String shippingFree;
        @SerializedName("brand_desc")
        private String brandDesc;
        @SerializedName("new_brand_desc")
        private String newBrandDesc;
        @SerializedName("shop_grp_cd")
        private String shopGrpCd;
        @SerializedName("brand_nm")
        private String brandNm;
        @SerializedName("logo_img")
        private String logoImg;
        @SerializedName("sale_flag")
        private String saleFlag;
        @SerializedName("quick_deli")
        private String quickDeli;
        @SerializedName("up_prd_cnt")
        private int upPrdCnt;
        @SerializedName("subs_seq_no")
        private int subsSeqNo;
        @SerializedName("rank_rt")
        private double rankRt;
        @SerializedName("issue_cupn")
        private String issueCupn;
        /**
         * rep_img_url : /upload/prod/2016/11/50/74/11/0/11745089.jpg
         * prd_no : 10419812
         * shop_no : 10000057
         */

        @SerializedName("addImgNew")
        private List<AddImgNewBean> addImgNew;
        @SerializedName("addImg")
        private List<String> addImg;
        /**
         * rep_img_url : http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/50/74/11/0/11745089.jpg
         * shop_no : 10000057
         * prd_no : 10419812
         */

        @SerializedName("new_product_items")
        private List<NewProductItemsBean> newProductItems;

        public int getShopNo() {
            return shopNo;
        }

        public void setShopNo(int shopNo) {
            this.shopNo = shopNo;
        }

        public int getSubsCnt() {
            return subsCnt;
        }

        public void setSubsCnt(int subsCnt) {
            this.subsCnt = subsCnt;
        }

        public String getShippingFree() {
            return shippingFree;
        }

        public void setShippingFree(String shippingFree) {
            this.shippingFree = shippingFree;
        }

        public String getBrandDesc() {
            return brandDesc;
        }

        public void setBrandDesc(String brandDesc) {
            this.brandDesc = brandDesc;
        }

        public String getNewBrandDesc() {
            return newBrandDesc;
        }

        public void setNewBrandDesc(String newBrandDesc) {
            this.newBrandDesc = newBrandDesc;
        }

        public String getShopGrpCd() {
            return shopGrpCd;
        }

        public void setShopGrpCd(String shopGrpCd) {
            this.shopGrpCd = shopGrpCd;
        }

        public String getBrandNm() {
            return brandNm;
        }

        public void setBrandNm(String brandNm) {
            this.brandNm = brandNm;
        }

        public String getLogoImg() {
            return logoImg;
        }

        public void setLogoImg(String logoImg) {
            this.logoImg = logoImg;
        }

        public String getSaleFlag() {
            return saleFlag;
        }

        public void setSaleFlag(String saleFlag) {
            this.saleFlag = saleFlag;
        }

        public String getQuickDeli() {
            return quickDeli;
        }

        public void setQuickDeli(String quickDeli) {
            this.quickDeli = quickDeli;
        }

        public int getUpPrdCnt() {
            return upPrdCnt;
        }

        public void setUpPrdCnt(int upPrdCnt) {
            this.upPrdCnt = upPrdCnt;
        }

        public int getSubsSeqNo() {
            return subsSeqNo;
        }

        public void setSubsSeqNo(int subsSeqNo) {
            this.subsSeqNo = subsSeqNo;
        }

        public double getRankRt() {
            return rankRt;
        }

        public void setRankRt(double rankRt) {
            this.rankRt = rankRt;
        }

        public String getIssueCupn() {
            return issueCupn;
        }

        public void setIssueCupn(String issueCupn) {
            this.issueCupn = issueCupn;
        }

        public List<AddImgNewBean> getAddImgNew() {
            return addImgNew;
        }

        public void setAddImgNew(List<AddImgNewBean> addImgNew) {
            this.addImgNew = addImgNew;
        }

        public List<String> getAddImg() {
            return addImg;
        }

        public void setAddImg(List<String> addImg) {
            this.addImg = addImg;
        }

        public List<NewProductItemsBean> getNewProductItems() {
            return newProductItems;
        }

        public void setNewProductItems(List<NewProductItemsBean> newProductItems) {
            this.newProductItems = newProductItems;
        }

        public static class AddImgNewBean {
            @SerializedName("rep_img_url")
            private String repImgUrl;
            @SerializedName("prd_no")
            private int prdNo;
            @SerializedName("shop_no")
            private int shopNo;

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
        }

        public static class NewProductItemsBean {
            @SerializedName("rep_img_url")
            private String repImgUrl;
            @SerializedName("shop_no")
            private int shopNo;
            @SerializedName("prd_no")
            private int prdNo;

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

            public int getPrdNo() {
                return prdNo;
            }

            public void setPrdNo(int prdNo) {
                this.prdNo = prdNo;
            }
        }
    }
}