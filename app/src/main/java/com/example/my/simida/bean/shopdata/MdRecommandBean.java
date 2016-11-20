package com.example.my.simida.bean.shopdata;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by apple on 16/11/19.
 */

public class MdRecommandBean {
    @SerializedName("md_rec_desc")
    private String mdRecDesc;
    /**
     * rep_img_url : http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/96/71/11/0/11719600.jpg
     * shop_no : 10000155
     * like_no : 0
     * promo :
     * shipping_free : F
     * avr_deli_date : 2
     * cate3_nm :
     * brand_desc : null
     * ceil_sel_price : 253
     * sel_price : 252.79
     * ceil_sale_price : 253
     * prd_no : 10416790
     * prd_nm : 圆领针织连衣裙
     * brand_nm : MODELAMI
     * like_cnt : 7
     * cate2_nm :
     * img_cnt : 1
     * sale_price : 252.79
     * link_url : http://www.modelami.co.kr/m/product.html?branduid=1735654
     * type_cd :
     * display : T
     * dsc_rt :
     * cate1_nm :
     * logo_img : /upload/brandshop/2016/11/25/71/11/0/11712547.png
     * quick_deli : F
     */

    @SerializedName("md_prd_list")
    private List<MdPrdListBean> mdPrdList;

    public String getMdRecDesc() {
        return mdRecDesc;
    }

    public void setMdRecDesc(String mdRecDesc) {
        this.mdRecDesc = mdRecDesc;
    }

    public List<MdPrdListBean> getMdPrdList() {
        return mdPrdList;
    }

    public void setMdPrdList(List<MdPrdListBean> mdPrdList) {
        this.mdPrdList = mdPrdList;
    }
}