package com.example.my.simida.utils;


import android.content.Context;
import android.content.Intent;

import com.example.my.simida.MainActivity;
import com.example.my.simida.ui.LoginActivity;
import com.example.my.simida.ui.ShopDataActivity;


/**
 * Created by apple on 16/11/15.
 */

public class UIManager {
    //用法 Eq:
    public static void startShopData(Context _context, int _shopid) {
        Intent intent = new Intent();
        intent.setClass(_context, ShopDataActivity.class);
        intent.putExtra("shopid", _shopid);
        _context.startActivity(intent);
    }

}
