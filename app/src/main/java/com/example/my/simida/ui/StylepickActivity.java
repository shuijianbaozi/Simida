package com.example.my.simida.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import com.example.my.simida.R;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.config.UrlConfig;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StylepickActivity extends AppCompatActivity {

    private static final String TAG = "StylePickActivity";
    @BindView(R.id.wb_typeweb)
    WebView webView;
    @BindView(R.id.activity_stylepick)
    RelativeLayout activityStylepick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stylepick);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(ConstantString.STYLE_PICK);
        String weburl = UrlConfig.STYLEPICK_WEB + stringExtra;
        Log.e(TAG, "onCreate: " + weburl);
        initWebView(weburl);
    }

    private void initWebView(String weburl) {
        //加载Url
        webView.loadUrl(weburl);
        //取消滚动条
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        //设置网页显示的比例
        WebSettings webSettings = webView.getSettings();
        //设置是否支持JavaScript
        webSettings.setJavaScriptEnabled(true);
        //是否支持缩放
        webSettings.setSupportZoom(true);
        //是否现在缩放控制-加减号
        webSettings.setBuiltInZoomControls(true);
        //WebView双击变大，再双击后变小
        webSettings.setUseWideViewPort(true);
        //网页打开监听
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) { //按下返回键
            if (webView.canGoBack()) { //webview可以返回的时候，也就是进入了内部链接
                webView.goBack(); //返回上一级画面
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        webView.stopLoading(); //停止加载
        ((ViewGroup) webView.getParent()).removeView(webView); //把webview从视图中移除
        webView.removeAllViews(); //移除webview上子view
        webView.clearCache(true); //清除缓存
        webView.clearHistory(); //清除历史
        webView.destroy(); //销毁webview自身

    }
}
