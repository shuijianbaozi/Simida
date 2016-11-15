package com.example.my.simida.utils;


import android.content.Context;
import android.content.Intent;

import com.example.my.simida.MainActivity;


/**
 * Created by apple on 16/11/15.
 */

public class UIManager {
    //用法 Eq:
    public static void startMain(
            Context _context, int _code,
            String _name) {
        Intent intent = new Intent();
        intent.setClass(_context, MainActivity.class);
        intent.putExtra("code", _code);
        intent.putExtra("name", _name);
        _context.startActivity(intent);
    }
}
