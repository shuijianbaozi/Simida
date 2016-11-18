package com.example.my.simida.bean.typefragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by My on 2016/11/17.
 */
public class RecommendCornerListBean {
    @SerializedName("cate_desc")
    private String cateDesc;
    @SerializedName("cate_nm")
    private String cateNm;
    @SerializedName("log_str")
    private String logStr;
    /**
     * rep_img_url : http://img.thestyledo.cn/tlc/${width}x${height}/upload/reccate/2016/11/39/74/11/0/11743933.png
     * template : category_recommend_item
     * app_link_url :
     * title : 撩汉必备
     * img_cnt : 3
     * bno : 10001470
     * link_url_type : 02
     * link_obj_param : keyword=长筒靴
     * link_url : styledo-glb://open/search?keyword=长筒靴
     * dtl_desc : #长筒靴#
     * rep_img_url_list : ["http://img.thestyledo.cn/tlc/${width}x${height}/upload/reccate/2016/11/39/74/11/0/11743933.png","http://img.thestyledo.cn/tlc/${width}x${height}/upload/reccate/2016/11/39/74/11/0/11743935.png","http://img.thestyledo.cn/tlc/${width}x${height}/upload/reccate/2016/11/39/74/11/0/11743936.png"]
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


}