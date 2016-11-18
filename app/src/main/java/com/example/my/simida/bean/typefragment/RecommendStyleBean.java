package com.example.my.simida.bean.typefragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by My on 2016/11/17.
 */
public  class RecommendStyleBean {
    @SerializedName("cate_desc")
    private String cateDesc;
    @SerializedName("cate_nm")
    private String cateNm;
    @SerializedName("log_str")
    private String logStr;
    /**
     * rep_img_url : http://img.thestyledo.cn/tl/${width}x${height}/upload/hotCate/2016/11/41/75/11/0/11754182.jpg
     * template : category_style_item
     * rec_keyword : OLD SCHOOL
     * rec_word_no : 10000752
     * cate_no : 10000011
     * rec_desc : OLD SCHOOL
     * search_word : 棒球
     */

    @SerializedName("list")
    private List<ListBean> list;

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

    public String getLogStr() {
        return logStr;
    }

    public void setLogStr(String logStr) {
        this.logStr = logStr;
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
        @SerializedName("template")
        private String template;
        @SerializedName("rec_keyword")
        private String recKeyword;
        @SerializedName("rec_word_no")
        private int recWordNo;
        @SerializedName("cate_no")
        private int cateNo;
        @SerializedName("rec_desc")
        private String recDesc;
        @SerializedName("search_word")
        private String searchWord;

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

        public String getRecKeyword() {
            return recKeyword;
        }

        public void setRecKeyword(String recKeyword) {
            this.recKeyword = recKeyword;
        }

        public int getRecWordNo() {
            return recWordNo;
        }

        public void setRecWordNo(int recWordNo) {
            this.recWordNo = recWordNo;
        }

        public int getCateNo() {
            return cateNo;
        }

        public void setCateNo(int cateNo) {
            this.cateNo = cateNo;
        }

        public String getRecDesc() {
            return recDesc;
        }

        public void setRecDesc(String recDesc) {
            this.recDesc = recDesc;
        }

        public String getSearchWord() {
            return searchWord;
        }

        public void setSearchWord(String searchWord) {
            this.searchWord = searchWord;
        }
    }
}