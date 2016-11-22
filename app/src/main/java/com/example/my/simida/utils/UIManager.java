package com.example.my.simida.utils;


import android.content.Context;
import android.content.Intent;

import com.example.my.simida.MainActivity;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.ui.LoginActivity;
import com.example.my.simida.ui.ShopDataActivity;


/**
 * Created by apple on 16/11/15.
 */

public class UIManager {
    //用法 Eq:

    /**
     * 跳转 到商店界面   参数为 商店号
     * @param _context
     * @param _shopid
     */
    public static void startShopData(Context _context, int _shopid) {
        Intent intent = new Intent();
        intent.setClass(_context, ShopDataActivity.class);
        intent.putExtra(ConstantString.SHOPDATA_SHOPNO, _shopid);
        _context.startActivity(intent);
    }


}
