package com.example.my.simida.utils;


import android.content.Context;
import android.content.Intent;

import com.example.my.simida.MainActivity;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.ui.LoginActivity;
import com.example.my.simida.ui.ShopDataActivity;
import com.example.my.simida.ui.TypetopwebActivity;
import com.example.my.simida.ui.Typeweb;


/**
 * Created by apple on 16/11/15.
 */

public class UIManager {
    //用法 Eq:

    /**
     * 跳转 到商店界面   参数为 商店号
     *
     * @param _context
     * @param _shopid
     */
    public static void startShopData(Context _context, int _shopid) {
        Intent intent = new Intent();
        intent.setClass(_context, ShopDataActivity.class);
        intent.putExtra(ConstantString.SHOPDATA_SHOPNO, _shopid);
        _context.startActivity(intent);
    }

    public static void startSearch(Context _context, String cateNAme) {
        Intent intent = new Intent();
        intent.setClass(_context, Typeweb.class);
        intent.putExtra(ConstantString.CATE_Name, cateNAme);
        _context.startActivity(intent);
    }

    public static void startBaseSearch(Context _context, String params) {
        Intent intent = new Intent();
        intent.setClass(_context, TypetopwebActivity.class);
        intent.putExtra(ConstantString.Search_Name, params);
        _context.startActivity(intent);
    }


}
