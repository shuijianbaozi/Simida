package com.example.my.simida.bean.shopdata;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by apple on 16/11/19.
 */

public class ShopDataBean {
    @Override
    public String toString() {
        return "ShopDataCarBean{" +
                "result=" + result +
                '}';
    }

    /**
     * shop : {"shop_no":10000155,"dp_deli_cost":"F","avr_deli_date":2,"shipping_free":"F","vender_sale_state":"F","brand_desc":null,"bg_img_height":400,"new_brand_desc":"童装 | 欢乐童年，趣味童装","share_logo_img":"http://img.thestyledo.cn/tlc/${width}x${height}/upload/brandshop/2016/11/25/71/11/0/11712547.png","brand_nm":"MODELAMI","cupn_no":0,"biz_num":"208-04-72353","subs_seq_no":0,"rank_rt":0.104,"brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","shop_bg_img":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/brandshop/2016/11/4/70/11/0/11700441.jpg","shop_tot_prd_cnt":124,"subs_cnt":37,"bg_img_width":800,"display":"T","online_sell_num":"2016-서울성동-00175호","shop_style":"童装","address":"서울 동대문구 용두동 234-49 순덕빌딩 3층","logo_img":"http://img.thestyledo.cn/tlc/${width}x${height}/upload/brandshop/2016/11/25/71/11/0/11712547.png","active":"T","shop_url":"","sale_tot_prd_cnt":0,"brand_md_rec_txt":"♥ LITTLE LADY ♥","bg_img":"http://img.thestyledo.cn/tc/${width}x${height}/src/upload/brandshop/2016/11/4/70/11/0/11700441.jpg"}
     * execute : {"order":"open","target":"@shop_main","option":{"animation":"true"}}
     * page_bo : {"page_size":10,"list_size":60,"max_page_num":3,"page_no":1,"total_count":124}
     * news : null
     * pop_prd_list : [{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/0/72/11/0/11720034.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":294,"sel_price":293.45,"ceil_sale_price":294,"prd_no":10416861,"prd_nm":"连帽配色拉链牛角扣外套","brand_nm":"MODELAMI","like_cnt":19,"cate2_nm":"","img_cnt":1,"sale_price":293.45,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735588","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/81/74/11/0/11748128.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":94,"sel_price":93.69,"ceil_sale_price":94,"prd_no":10420317,"prd_nm":"毛球装饰毛边帽子","brand_nm":"MODELAMI","like_cnt":30,"cate2_nm":"","img_cnt":1,"sale_price":93.69,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735607","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/82/74/11/0/11748259.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":95,"sel_price":94.28,"ceil_sale_price":95,"prd_no":10420338,"prd_nm":"配色袜子5件套","brand_nm":"MODELAMI","like_cnt":29,"cate2_nm":"","img_cnt":1,"sale_price":94.28,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735758","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"}]
     * shop_prd_list : [{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/89/75/11/0/11758913.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":760,"sel_price":759.54,"ceil_sale_price":760,"prd_no":10422039,"prd_nm":"连帽拉链羽绒服","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":759.54,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735551","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/88/75/11/0/11758865.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":348,"sel_price":347.07,"ceil_sale_price":348,"prd_no":10422037,"prd_nm":"连帽拉链按扣外套","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":347.07,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735579","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/88/75/11/0/11758809.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":165,"sel_price":164.4,"ceil_sale_price":165,"prd_no":10422026,"prd_nm":"圆头心形配色魔术贴休闲鞋","brand_nm":"MODELAMI","like_cnt":8,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":164.4,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735346","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/87/75/11/0/11758720.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":177,"sel_price":176.19,"ceil_sale_price":177,"prd_no":10422015,"prd_nm":"松紧腰拉绒牛仔裤","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":176.19,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735808","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/86/75/11/0/11758654.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":147,"sel_price":146.72,"ceil_sale_price":147,"prd_no":10422003,"prd_nm":"简约宽松针织衫","brand_nm":"MODELAMI","like_cnt":1,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":146.72,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735816","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/85/75/11/0/11758529.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":176,"sel_price":175.6,"ceil_sale_price":176,"prd_no":10421976,"prd_nm":"连帽字母卫衣","brand_nm":"MODELAMI","like_cnt":1,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":175.6,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735776","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/84/75/11/0/11758425.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":106,"sel_price":105.48,"ceil_sale_price":106,"prd_no":10421960,"prd_nm":"侧开衩按扣针织外套_(含衣带)","brand_nm":"MODELAMI","like_cnt":1,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":105.48,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735681","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/83/75/11/0/11758356.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":117,"sel_price":116.67,"ceil_sale_price":117,"prd_no":10421946,"prd_nm":"蝴蝶结配色拉链包包","brand_nm":"MODELAMI","like_cnt":4,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":116.67,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735363","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/86/74/11/0/11748666.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":294,"sel_price":293.45,"ceil_sale_price":294,"prd_no":10420416,"prd_nm":"松紧腰百褶半身长裙","brand_nm":"MODELAMI","like_cnt":9,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":293.45,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735771","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/85/74/11/0/11748582.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":228,"sel_price":227.45,"ceil_sale_price":228,"prd_no":10420400,"prd_nm":"木耳边后系扣卫衣","brand_nm":"MODELAMI","like_cnt":9,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":227.45,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735773","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/84/74/11/0/11748491.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":212,"sel_price":211.54,"ceil_sale_price":212,"prd_no":10420386,"prd_nm":"叠层喇叭袖圆领T恤","brand_nm":"MODELAMI","like_cnt":14,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":211.54,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735774","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/84/74/11/0/11748445.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":117,"sel_price":116.67,"ceil_sale_price":117,"prd_no":10420377,"prd_nm":"半高领罗纹长袖T恤","brand_nm":"MODELAMI","like_cnt":6,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":116.67,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735775","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/83/74/11/0/11748371.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":465,"sel_price":464.92,"ceil_sale_price":465,"prd_no":10420367,"prd_nm":"配色格纹毛呢大衣","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":464.92,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735769","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/82/74/11/0/11748298.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":212,"sel_price":211.54,"ceil_sale_price":212,"prd_no":10420356,"prd_nm":"配色刺绣拉绒卫衣","brand_nm":"MODELAMI","like_cnt":12,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":211.54,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735770","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/82/74/11/0/11748259.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":95,"sel_price":94.28,"ceil_sale_price":95,"prd_no":10420338,"prd_nm":"配色袜子5件套","brand_nm":"MODELAMI","like_cnt":29,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":94.28,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735758","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/81/74/11/0/11748196.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":83,"sel_price":82.5,"ceil_sale_price":83,"prd_no":10420326,"prd_nm":"纯色交叉毛围巾","brand_nm":"MODELAMI","like_cnt":8,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":82.5,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735759","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/81/74/11/0/11748128.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":94,"sel_price":93.69,"ceil_sale_price":94,"prd_no":10420317,"prd_nm":"毛球装饰毛边帽子","brand_nm":"MODELAMI","like_cnt":30,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":93.69,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735607","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/80/74/11/0/11748080.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":77,"sel_price":76.02,"ceil_sale_price":77,"prd_no":10420307,"prd_nm":"麻花纹粗线针织帽","brand_nm":"MODELAMI","like_cnt":20,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":76.02,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735598","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/80/74/11/0/11748023.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":71,"sel_price":70.7,"ceil_sale_price":71,"prd_no":10420298,"prd_nm":"毛球装饰配色针织手套","brand_nm":"MODELAMI","like_cnt":11,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":70.7,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735761","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/78/74/11/0/11747889.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":71,"sel_price":70.7,"ceil_sale_price":71,"prd_no":10420276,"prd_nm":"配色毛球装饰针织手套","brand_nm":"MODELAMI","like_cnt":11,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":70.7,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735762","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/37/74/11/0/11743794.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":48,"sel_price":47.14,"ceil_sale_price":48,"prd_no":10419699,"prd_nm":"蝴蝶结毛织发箍","brand_nm":"MODELAMI","like_cnt":18,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":47.14,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735764","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/37/74/11/0/11743737.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":48,"sel_price":47.14,"ceil_sale_price":48,"prd_no":10419690,"prd_nm":"可爱毛茸茸发箍","brand_nm":"MODELAMI","like_cnt":17,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":47.14,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735765","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/37/74/11/0/11743709.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":235,"sel_price":234.52,"ceil_sale_price":235,"prd_no":10419684,"prd_nm":"松紧腰拉绒牛仔裤","brand_nm":"MODELAMI","like_cnt":6,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":234.52,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735768","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/50/73/11/0/11735010.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":235,"sel_price":234.52,"ceil_sale_price":235,"prd_no":10418995,"prd_nm":"木耳领褶皱连衣裙","brand_nm":"MODELAMI","like_cnt":8,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":234.52,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685418","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/49/73/11/0/11734981.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":353,"sel_price":352.37,"ceil_sale_price":353,"prd_no":10418991,"prd_nm":"系带领蕾丝连衣裙","brand_nm":"MODELAMI","like_cnt":9,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":352.37,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685474","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/49/73/11/0/11734965.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":217,"sel_price":216.85,"ceil_sale_price":217,"prd_no":10418989,"prd_nm":"后系扣镂空蕾丝衫","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":216.85,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685401","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/49/73/11/0/11734945.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":235,"sel_price":234.52,"ceil_sale_price":235,"prd_no":10418985,"prd_nm":"格纹配色双口袋无袖连衣裙","brand_nm":"MODELAMI","like_cnt":11,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":234.52,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735177","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/48/73/11/0/11734881.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":135,"sel_price":134.94,"ceil_sale_price":135,"prd_no":10418976,"prd_nm":"插肩流苏系带衬衫","brand_nm":"MODELAMI","like_cnt":4,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":134.94,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735013","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/48/73/11/0/11734844.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":176,"sel_price":175.6,"ceil_sale_price":176,"prd_no":10418970,"prd_nm":"松紧腰毛边牛仔裤","brand_nm":"MODELAMI","like_cnt":4,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":175.6,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1707235","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/48/73/11/0/11734800.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":158,"sel_price":157.91,"ceil_sale_price":158,"prd_no":10418965,"prd_nm":"波点配色衬衫","brand_nm":"MODELAMI","like_cnt":4,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":157.91,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1707225","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/47/73/11/0/11734777.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":200,"sel_price":199.17,"ceil_sale_price":200,"prd_no":10418960,"prd_nm":"条纹配色衬衫","brand_nm":"MODELAMI","like_cnt":6,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":199.17,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1707210","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/46/73/11/0/11734653.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":353,"sel_price":352.96,"ceil_sale_price":353,"prd_no":10418946,"prd_nm":"圆领针织衫无袖连衣裙套装_(含围巾)","brand_nm":"MODELAMI","like_cnt":18,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":352.96,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735384","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/45/73/11/0/11734585.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":265,"sel_price":264.57,"ceil_sale_price":265,"prd_no":10418935,"prd_nm":"后拉链百褶蕾丝连衣裙_(含蝴蝶结带长)","brand_nm":"MODELAMI","like_cnt":12,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":264.57,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735543","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/45/73/11/0/11734547.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":58,"sel_price":57.75,"ceil_sale_price":58,"prd_no":10418927,"prd_nm":"[自制商品]松紧腰打底裤","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":57.75,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735541","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/44/73/11/0/11734435.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":58,"sel_price":57.75,"ceil_sale_price":58,"prd_no":10418915,"prd_nm":"[自制商品]松紧腰简约打底裤","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":57.75,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735540","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/43/73/11/0/11734310.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":176,"sel_price":175.6,"ceil_sale_price":176,"prd_no":10418892,"prd_nm":"娃娃领按扣双口袋外套","brand_nm":"MODELAMI","like_cnt":8,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":175.6,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735532&","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/42/73/11/0/11734260.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":141,"sel_price":140.24,"ceil_sale_price":141,"prd_no":10418883,"prd_nm":"连帽插肩配色连衣裙","brand_nm":"MODELAMI","like_cnt":5,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":140.24,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735527&","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/41/73/11/0/11734106.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":253,"sel_price":252.79,"ceil_sale_price":253,"prd_no":10418872,"prd_nm":"系扣格纹配色连体裤","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":252.79,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735318","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/41/73/11/0/11734179.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":353,"sel_price":352.37,"ceil_sale_price":353,"prd_no":10418871,"prd_nm":"条纹配色马甲系扣插兜裤子套装","brand_nm":"MODELAMI","like_cnt":7,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":352.37,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735319","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/40/73/11/0/11734029.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":164,"sel_price":163.81,"ceil_sale_price":164,"prd_no":10418846,"prd_nm":"条纹配色系扣衬衫_(不含围巾)","brand_nm":"MODELAMI","like_cnt":5,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":163.81,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735198","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/3/73/11/0/11730399.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":235,"sel_price":234.52,"ceil_sale_price":235,"prd_no":10418446,"prd_nm":"条纹针织衫V领无袖连衣裙套装","brand_nm":"MODELAMI","like_cnt":11,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":234.52,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735544","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/3/73/11/0/11730314.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":206,"sel_price":205.65,"ceil_sale_price":206,"prd_no":10418434,"prd_nm":"半高领配色拼接连衣裙","brand_nm":"MODELAMI","like_cnt":24,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":205.65,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735552","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/2/73/11/0/11730210.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":235,"sel_price":234.52,"ceil_sale_price":235,"prd_no":10418421,"prd_nm":"荷叶边上衣松紧腰裤子套装","brand_nm":"MODELAMI","like_cnt":10,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":234.52,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685346","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/1/73/11/0/11730154.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":58,"sel_price":57.75,"ceil_sale_price":58,"prd_no":10418402,"prd_nm":"圆领胸兜T恤","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":57.75,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735578","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/69/72/11/0/11726969.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":165,"sel_price":164.4,"ceil_sale_price":165,"prd_no":10417880,"prd_nm":"圆头魔术贴休闲鞋","brand_nm":"MODELAMI","like_cnt":8,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":164.4,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735340","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/68/72/11/0/11726821.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":224,"sel_price":223.33,"ceil_sale_price":224,"prd_no":10417858,"prd_nm":"配色绒球装饰休闲鞋","brand_nm":"MODELAMI","like_cnt":10,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":223.33,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735343","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/67/72/11/0/11726762.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":223,"sel_price":222.74,"ceil_sale_price":223,"prd_no":10417845,"prd_nm":"荷叶边薄荷色连衣裙","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":222.74,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735542","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/66/72/11/0/11726690.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":200,"sel_price":199.17,"ceil_sale_price":200,"prd_no":10417835,"prd_nm":"松紧腰纽扣装饰裤子","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":199.17,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685740","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/66/72/11/0/11726628.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":177,"sel_price":176.19,"ceil_sale_price":177,"prd_no":10417823,"prd_nm":"百褶皮革半身裙","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":176.19,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735404","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/65/72/11/0/11726580.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":58,"sel_price":57.75,"ceil_sale_price":58,"prd_no":10417816,"prd_nm":"松紧腰加绒打底长裤","brand_nm":"MODELAMI","like_cnt":24,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":57.75,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735520","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/64/72/11/0/11726478.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":70,"sel_price":69.54,"ceil_sale_price":70,"prd_no":10417797,"prd_nm":"加绒打底长裤","brand_nm":"MODELAMI","like_cnt":5,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":69.54,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735521","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/63/72/11/0/11726393.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":176,"sel_price":175.6,"ceil_sale_price":176,"prd_no":10417780,"prd_nm":"松紧腰牛仔裤","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":175.6,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685690","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/63/72/11/0/11726342.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":236,"sel_price":235.11,"ceil_sale_price":236,"prd_no":10417773,"prd_nm":"灯芯绒背带裤","brand_nm":"MODELAMI","like_cnt":4,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":235.11,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735411","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/63/72/11/0/11726310.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":105,"sel_price":104.89,"ceil_sale_price":105,"prd_no":10417766,"prd_nm":"加绒短裙拼接打底裤","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":104.89,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735601","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/62/72/11/0/11726240.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":224,"sel_price":223.33,"ceil_sale_price":224,"prd_no":10417756,"prd_nm":"侧拉链拼接卫衣","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":223.33,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735448","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/50/72/11/0/11725006.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":59,"sel_price":58.34,"ceil_sale_price":59,"prd_no":10417636,"prd_nm":"宽松圆领T恤","brand_nm":"MODELAMI","like_cnt":6,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":58.34,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735320","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/49/72/11/0/11724957.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":171,"sel_price":170.3,"ceil_sale_price":171,"prd_no":10417624,"prd_nm":"格纹亨利领系扣衬衫","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":170.3,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735522","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/49/72/11/0/11724902.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":106,"sel_price":105.48,"ceil_sale_price":106,"prd_no":10417613,"prd_nm":"侧开衩圆领T恤","brand_nm":"MODELAMI","like_cnt":2,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":105.48,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735523","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/48/72/11/0/11724825.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":94,"sel_price":93.69,"ceil_sale_price":94,"prd_no":10417599,"prd_nm":"圆领兔子布贴T恤","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":93.69,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735524","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/47/72/11/0/11724778.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":264,"sel_price":263.98,"ceil_sale_price":264,"prd_no":10417585,"prd_nm":"纽扣装饰披肩","brand_nm":"MODELAMI","like_cnt":5,"cate2_nm":"","brand_logo":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png","img_cnt":1,"sale_price":263.98,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685649","type_cd":null,"display":"T","dsc_rt":"","cate1_nm":"","logo_img":"http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"}]
     * sale_prd_list : []
     * query_string : shop_no=10000155&prd_no=&sort_type=02&list_size=60&page_no=1
     * md_recommand : {"md_rec_desc":"♥ LITTLE LADY ♥","md_prd_list":[{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/96/71/11/0/11719600.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":253,"sel_price":252.79,"ceil_sale_price":253,"prd_no":10416790,"prd_nm":"圆领针织连衣裙","brand_nm":"MODELAMI","like_cnt":7,"cate2_nm":"","img_cnt":1,"sale_price":252.79,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735654","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/45/73/11/0/11734585.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":265,"sel_price":264.57,"ceil_sale_price":265,"prd_no":10418935,"prd_nm":"后拉链百褶蕾丝连衣裙_(含蝴蝶结带长)","brand_nm":"MODELAMI","like_cnt":12,"cate2_nm":"","img_cnt":1,"sale_price":264.57,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735543","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/46/73/11/0/11734653.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":353,"sel_price":352.96,"ceil_sale_price":353,"prd_no":10418946,"prd_nm":"圆领针织衫无袖连衣裙套装_(含围巾)","brand_nm":"MODELAMI","like_cnt":18,"cate2_nm":"","img_cnt":1,"sale_price":352.96,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735384","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/89/71/11/0/11718995.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":283,"sel_price":282.25,"ceil_sale_price":283,"prd_no":10416670,"prd_nm":"V领纯色系带连衣裙","brand_nm":"MODELAMI","like_cnt":5,"cate2_nm":"","img_cnt":1,"sale_price":282.25,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735415","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/50/73/11/0/11735010.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":235,"sel_price":234.52,"ceil_sale_price":235,"prd_no":10418995,"prd_nm":"木耳领褶皱连衣裙","brand_nm":"MODELAMI","like_cnt":8,"cate2_nm":"","img_cnt":1,"sale_price":234.52,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685418","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/83/71/11/0/11718385.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":183,"sel_price":182.08,"ceil_sale_price":183,"prd_no":10416573,"prd_nm":"毛绒领配色连衣裙(含围脖)","brand_nm":"MODELAMI","like_cnt":10,"cate2_nm":"","img_cnt":1,"sale_price":182.08,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735693","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"}]}
     * hot_trend_list : [{"rep_img_url":"http://img.thestyledo.cn/tlc/${width}x${height}/upload/shopbox/2016/11/91/75/11/0/11759157.jpg","shop_no":10000155,"like_no":0,"dp_deli_cost":"F","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","img":"/upload/shopbox/2016/11/91/75/11/0/11759157.jpg","brand_desc":null,"main_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/83/75/11/0/11758356.jpg","ceil_sel_price":117,"sel_price":116.67,"ceil_sale_price":117,"prd_no":10421946,"prd_nm":"蝴蝶结配色拉链包包","brand_nm":"MODELAMI","like_cnt":4,"cate2_nm":"","img_cnt":1,"sale_price":116.67,"discount_info":"116.67||||","yes_deli_cost":0,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735363","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tlc/${width}x${height}/upload/shopbox/2016/11/91/75/11/0/11759148.jpg","shop_no":10000155,"like_no":0,"dp_deli_cost":"F","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","img":"/upload/shopbox/2016/11/91/75/11/0/11759148.jpg","brand_desc":null,"main_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/89/75/11/0/11758913.jpg","ceil_sel_price":760,"sel_price":759.54,"ceil_sale_price":760,"prd_no":10422039,"prd_nm":"连帽拉链羽绒服","brand_nm":"MODELAMI","like_cnt":3,"cate2_nm":"","img_cnt":1,"sale_price":759.54,"discount_info":"759.54||||","yes_deli_cost":0,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735551","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tlc/${width}x${height}/upload/shopbox/2016/11/91/75/11/0/11759147.jpg","shop_no":10000155,"like_no":0,"dp_deli_cost":"F","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","img":"/upload/shopbox/2016/11/91/75/11/0/11759147.jpg","brand_desc":null,"main_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/88/75/11/0/11758809.jpg","ceil_sel_price":165,"sel_price":164.4,"ceil_sale_price":165,"prd_no":10422026,"prd_nm":"圆头心形配色魔术贴休闲鞋","brand_nm":"MODELAMI","like_cnt":8,"cate2_nm":"","img_cnt":1,"sale_price":164.4,"discount_info":"164.40||||","yes_deli_cost":0,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735346","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"}]
     */

    @SerializedName("result")
    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * shop_no : 10000155
         * dp_deli_cost : F
         * avr_deli_date : 2
         * shipping_free : F
         * vender_sale_state : F
         * brand_desc : null
         * bg_img_height : 400
         * new_brand_desc : 童装 | 欢乐童年，趣味童装
         * share_logo_img : http://img.thestyledo.cn/tlc/${width}x${height}/upload/brandshop/2016/11/25/71/11/0/11712547.png
         * brand_nm : MODELAMI
         * cupn_no : 0
         * biz_num : 208-04-72353
         * subs_seq_no : 0
         * rank_rt : 0.104
         * brand_logo : http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png
         * shop_bg_img : http://img.thestyledo.cn/tsc/${width}x${height}/upload/brandshop/2016/11/4/70/11/0/11700441.jpg
         * shop_tot_prd_cnt : 124
         * subs_cnt : 37
         * bg_img_width : 800
         * display : T
         * online_sell_num : 2016-서울성동-00175호
         * shop_style : 童装
         * address : 서울 동대문구 용두동 234-49 순덕빌딩 3층
         * logo_img : http://img.thestyledo.cn/tlc/${width}x${height}/upload/brandshop/2016/11/25/71/11/0/11712547.png
         * active : T
         * shop_url :
         * sale_tot_prd_cnt : 0
         * brand_md_rec_txt : ♥ LITTLE LADY ♥
         * bg_img : http://img.thestyledo.cn/tc/${width}x${height}/src/upload/brandshop/2016/11/4/70/11/0/11700441.jpg
         */

        @SerializedName("shop")
        private ShopBean shop;
        /**
         * order : open
         * target : @shop_main
         * option : {"animation":"true"}
         */

        @SerializedName("execute")
        private ExecuteBean execute;
        /**
         * page_size : 10
         * list_size : 60
         * max_page_num : 3
         * page_no : 1
         * total_count : 124
         */

        @SerializedName("page_bo")
        private PageBoBean pageBo;
        @SerializedName("news")
        private Object news;
        @SerializedName("query_string")
        private String queryString;
        /**
         * md_rec_desc : ♥ LITTLE LADY ♥
         * md_prd_list : [{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/96/71/11/0/11719600.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":253,"sel_price":252.79,"ceil_sale_price":253,"prd_no":10416790,"prd_nm":"圆领针织连衣裙","brand_nm":"MODELAMI","like_cnt":7,"cate2_nm":"","img_cnt":1,"sale_price":252.79,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735654","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/45/73/11/0/11734585.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":265,"sel_price":264.57,"ceil_sale_price":265,"prd_no":10418935,"prd_nm":"后拉链百褶蕾丝连衣裙_(含蝴蝶结带长)","brand_nm":"MODELAMI","like_cnt":12,"cate2_nm":"","img_cnt":1,"sale_price":264.57,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735543","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/46/73/11/0/11734653.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":353,"sel_price":352.96,"ceil_sale_price":353,"prd_no":10418946,"prd_nm":"圆领针织衫无袖连衣裙套装_(含围巾)","brand_nm":"MODELAMI","like_cnt":18,"cate2_nm":"","img_cnt":1,"sale_price":352.96,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735384","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/89/71/11/0/11718995.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":283,"sel_price":282.25,"ceil_sale_price":283,"prd_no":10416670,"prd_nm":"V领纯色系带连衣裙","brand_nm":"MODELAMI","like_cnt":5,"cate2_nm":"","img_cnt":1,"sale_price":282.25,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735415","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/50/73/11/0/11735010.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":235,"sel_price":234.52,"ceil_sale_price":235,"prd_no":10418995,"prd_nm":"木耳领褶皱连衣裙","brand_nm":"MODELAMI","like_cnt":8,"cate2_nm":"","img_cnt":1,"sale_price":234.52,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1685418","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"},{"rep_img_url":"http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/83/71/11/0/11718385.jpg","shop_no":10000155,"like_no":0,"promo":"","shipping_free":"F","avr_deli_date":2,"cate3_nm":"","brand_desc":null,"ceil_sel_price":183,"sel_price":182.08,"ceil_sale_price":183,"prd_no":10416573,"prd_nm":"毛绒领配色连衣裙(含围脖)","brand_nm":"MODELAMI","like_cnt":10,"cate2_nm":"","img_cnt":1,"sale_price":182.08,"link_url":"http://www.modelami.co.kr/m/product.html?branduid=1735693","type_cd":"","display":"T","dsc_rt":"","cate1_nm":"","logo_img":"/upload/brandshop/2016/11/25/71/11/0/11712547.png","quick_deli":"F"}]
         */

        @SerializedName("md_recommand")
        private MdRecommandBean mdRecommand;
        /**
         * rep_img_url : http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/0/72/11/0/11720034.jpg
         * shop_no : 10000155
         * like_no : 0
         * promo :
         * shipping_free : F
         * avr_deli_date : 2
         * cate3_nm :
         * brand_desc : null
         * ceil_sel_price : 294
         * sel_price : 293.45
         * ceil_sale_price : 294
         * prd_no : 10416861
         * prd_nm : 连帽配色拉链牛角扣外套
         * brand_nm : MODELAMI
         * like_cnt : 19
         * cate2_nm :
         * img_cnt : 1
         * sale_price : 293.45
         * link_url : http://www.modelami.co.kr/m/product.html?branduid=1735588
         * type_cd :
         * display : T
         * dsc_rt :
         * cate1_nm :
         * logo_img : /upload/brandshop/2016/11/25/71/11/0/11712547.png
         * quick_deli : F
         */

        @SerializedName("pop_prd_list")
        private List<PopPrdListBean> popPrdList;
        /**
         * rep_img_url : http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/89/75/11/0/11758913.jpg
         * shop_no : 10000155
         * like_no : 0
         * promo :
         * shipping_free : F
         * avr_deli_date : 2
         * cate3_nm :
         * brand_desc : null
         * ceil_sel_price : 760
         * sel_price : 759.54
         * ceil_sale_price : 760
         * prd_no : 10422039
         * prd_nm : 连帽拉链羽绒服
         * brand_nm : MODELAMI
         * like_cnt : 3
         * cate2_nm :
         * brand_logo : http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/29/71/11/0/11712954.png
         * img_cnt : 1
         * sale_price : 759.54
         * link_url : http://www.modelami.co.kr/m/product.html?branduid=1735551
         * type_cd : null
         * display : T
         * dsc_rt :
         * cate1_nm :
         * logo_img : http://img.thestyledo.cn/tll/${width}x${height}/src/upload/brandshop/2016/11/25/71/11/0/11712547.png
         * quick_deli : F
         */

        @SerializedName("shop_prd_list")
        private List<ShopPrdListBean> shopPrdList;
        @SerializedName("sale_prd_list")
        private List<?> salePrdList;
        /**
         * rep_img_url : http://img.thestyledo.cn/tlc/${width}x${height}/upload/shopbox/2016/11/91/75/11/0/11759157.jpg
         * shop_no : 10000155
         * like_no : 0
         * dp_deli_cost : F
         * shipping_free : F
         * avr_deli_date : 2
         * cate3_nm :
         * img : /upload/shopbox/2016/11/91/75/11/0/11759157.jpg
         * brand_desc : null
         * main_img_url : http://img.thestyledo.cn/tsc/${width}x${height}/upload/prod/2016/11/83/75/11/0/11758356.jpg
         * ceil_sel_price : 117
         * sel_price : 116.67
         * ceil_sale_price : 117
         * prd_no : 10421946
         * prd_nm : 蝴蝶结配色拉链包包
         * brand_nm : MODELAMI
         * like_cnt : 4
         * cate2_nm :
         * img_cnt : 1
         * sale_price : 116.67
         * discount_info : 116.67||||
         * yes_deli_cost : 0
         * link_url : http://www.modelami.co.kr/m/product.html?branduid=1735363
         * type_cd :
         * display : T
         * dsc_rt :
         * cate1_nm :
         * logo_img : /upload/brandshop/2016/11/25/71/11/0/11712547.png
         * quick_deli : F
         */

        @SerializedName("hot_trend_list")
        private List<HotTrendListBean> hotTrendList;

        public ShopBean getShop() {
            return shop;
        }

        public void setShop(ShopBean shop) {
            this.shop = shop;
        }

        public ExecuteBean getExecute() {
            return execute;
        }

        public void setExecute(ExecuteBean execute) {
            this.execute = execute;
        }

        public PageBoBean getPageBo() {
            return pageBo;
        }

        public void setPageBo(PageBoBean pageBo) {
            this.pageBo = pageBo;
        }

        public Object getNews() {
            return news;
        }

        public void setNews(Object news) {
            this.news = news;
        }

        public String getQueryString() {
            return queryString;
        }

        public void setQueryString(String queryString) {
            this.queryString = queryString;
        }

        public MdRecommandBean getMdRecommand() {
            return mdRecommand;
        }

        public void setMdRecommand(MdRecommandBean mdRecommand) {
            this.mdRecommand = mdRecommand;
        }

        public List<PopPrdListBean> getPopPrdList() {
            return popPrdList;
        }

        public void setPopPrdList(List<PopPrdListBean> popPrdList) {
            this.popPrdList = popPrdList;
        }

        public List<ShopPrdListBean> getShopPrdList() {
            return shopPrdList;
        }

        public void setShopPrdList(List<ShopPrdListBean> shopPrdList) {
            this.shopPrdList = shopPrdList;
        }

        public List<?> getSalePrdList() {
            return salePrdList;
        }

        public void setSalePrdList(List<?> salePrdList) {
            this.salePrdList = salePrdList;
        }

        public List<HotTrendListBean> getHotTrendList() {
            return hotTrendList;
        }

        public void setHotTrendList(List<HotTrendListBean> hotTrendList) {
            this.hotTrendList = hotTrendList;
        }


        public static class ExecuteBean {
            @SerializedName("order")
            private String order;
            @SerializedName("target")
            private String target;
            /**
             * animation : true
             */

            @SerializedName("option")
            private OptionBean option;

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public OptionBean getOption() {
                return option;
            }

            public void setOption(OptionBean option) {
                this.option = option;
            }

            public static class OptionBean {
                @SerializedName("animation")
                private String animation;

                public String getAnimation() {
                    return animation;
                }

                public void setAnimation(String animation) {
                    this.animation = animation;
                }
            }
        }

        public static class PageBoBean {
            @SerializedName("page_size")
            private int pageSize;
            @SerializedName("list_size")
            private int listSize;
            @SerializedName("max_page_num")
            private int maxPageNum;
            @SerializedName("page_no")
            private int pageNo;
            @SerializedName("total_count")
            private int totalCount;

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }

            public int getListSize() {
                return listSize;
            }

            public void setListSize(int listSize) {
                this.listSize = listSize;
            }

            public int getMaxPageNum() {
                return maxPageNum;
            }

            public void setMaxPageNum(int maxPageNum) {
                this.maxPageNum = maxPageNum;
            }

            public int getPageNo() {
                return pageNo;
            }

            public void setPageNo(int pageNo) {
                this.pageNo = pageNo;
            }

            public int getTotalCount() {
                return totalCount;
            }

            public void setTotalCount(int totalCount) {
                this.totalCount = totalCount;
            }
        }

    }
}
