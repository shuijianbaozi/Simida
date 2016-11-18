package com.example.my.simida.bean.typefragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by My on 2016/11/17.
 */
public  class CategoryListBean {
    @SerializedName("cate_grp_no")
    private int cateGrpNo;
    @SerializedName("cate_desc")
    private String cateDesc;
    @SerializedName("cate_nm")
    private String cateNm;
    /**
     * rep_img_url : http://img.thestyledo.cn/tl/${width}x${height}/upload/category/2016/10/66/60/11/0/11606653.png
     * cate_grp_no : 1000
     * top_badge : F
     * cate_nm : 上衣
     * img_url1 : /upload/category/2016/10/66/60/11/0/11606653.png
     * cate_no2 : 10000001
     * cate_no1 : 10000000
     */

    @SerializedName("list")
    private List<ListBean> list;

    public int getCateGrpNo() {
        return cateGrpNo;
    }

    public void setCateGrpNo(int cateGrpNo) {
        this.cateGrpNo = cateGrpNo;
    }

    public String getCateDesc() {
        return cateDesc;
    }

    public void setCateDesc(String cateDesc) {
        this.cateDesc = cateDesc;
    }

    public String getCateNm() {
        return cateNm;
    }

    public void setCateNm(String cateNm) {
        this.cateNm = cateNm;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        @SerializedName("rep_img_url")
        private String repImgUrl;
        @SerializedName("cate_grp_no")
        private int cateGrpNo;
        @SerializedName("top_badge")
        private String topBadge;
        @SerializedName("cate_nm")
        private String cateNm;
        @SerializedName("img_url1")
        private String imgUrl1;
        @SerializedName("cate_no2")
        private int cateNo2;
        @SerializedName("cate_no1")
        private int cateNo1;

        public String getRepImgUrl() {
            return repImgUrl;
        }

        public void setRepImgUrl(String repImgUrl) {
            this.repImgUrl = repImgUrl;
        }

        public int getCateGrpNo() {
            return cateGrpNo;
        }

        public void setCateGrpNo(int cateGrpNo) {
            this.cateGrpNo = cateGrpNo;
        }

        public String getTopBadge() {
            return topBadge;
        }

        public void setTopBadge(String topBadge) {
            this.topBadge = topBadge;
        }

        public String getCateNm() {
            return cateNm;
        }

        public void setCateNm(String cateNm) {
            this.cateNm = cateNm;
        }

        public String getImgUrl1() {
            return imgUrl1;
        }

        public void setImgUrl1(String imgUrl1) {
            this.imgUrl1 = imgUrl1;
        }

        public int getCateNo2() {
            return cateNo2;
        }

        public void setCateNo2(int cateNo2) {
            this.cateNo2 = cateNo2;
        }

        public int getCateNo1() {
            return cateNo1;
        }

        public void setCateNo1(int cateNo1) {
            this.cateNo1 = cateNo1;
        }
    }
}