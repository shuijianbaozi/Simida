package com.example.my.simida.bean.brandfragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by apple on 16/11/17.
 */

public class RankingBean {
    @SerializedName("title")
    private String title;
    @SerializedName("log_str")
    private String logStr;
    @SerializedName("rank_cd")
    private String rankCd;
    /**
     * shop_no : 10000097
     * brand_nm : icecream12
     * ranking_img : http://img.thestyledo.cn/tlc/${width}x${height}/upload/brandshop/2016/11/43/68/11/0/11684360.jpg
     * logo_img : http://img.thestyledo.cn/tl/${width}x${height}/upload/brandshop/2015/09/79/64/10/0/10647902.png
     * rank_cd : 01
     */

    @SerializedName("list")
    private List<ListBean> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogStr() {
        return logStr;
    }

    public void setLogStr(String logStr) {
        this.logStr = logStr;
    }

    public String getRankCd() {
        return rankCd;
    }

    public void setRankCd(String rankCd) {
        this.rankCd = rankCd;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        @SerializedName("shop_no")
        private int shopNo;
        @SerializedName("brand_nm")
        private String brandNm;
        @SerializedName("ranking_img")
        private String rankingImg;
        @SerializedName("logo_img")
        private String logoImg;
        @SerializedName("rank_cd")
        private String rankCd;

        public int getShopNo() {
            return shopNo;
        }

        public void setShopNo(int shopNo) {
            this.shopNo = shopNo;
        }

        public String getBrandNm() {
            return brandNm;
        }

        public void setBrandNm(String brandNm) {
            this.brandNm = brandNm;
        }

        public String getRankingImg() {
            return rankingImg;
        }

        public void setRankingImg(String rankingImg) {
            this.rankingImg = rankingImg;
        }

        public String getLogoImg() {
            return logoImg;
        }

        public void setLogoImg(String logoImg) {
            this.logoImg = logoImg;
        }

        public String getRankCd() {
            return rankCd;
        }

        public void setRankCd(String rankCd) {
            this.rankCd = rankCd;
        }
    }
}