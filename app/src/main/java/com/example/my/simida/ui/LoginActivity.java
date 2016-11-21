package com.example.my.simida.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.my.simida.App;
import com.example.my.simida.R;
import com.example.my.simida.base.BaseActivity;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.login_back_btn)
    ImageButton loginBackBtn;
    @BindView(R.id.register)
    Button register;
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.psw)
    EditText psw;
    @BindView(R.id.login_btn)
    Button loginBtn;
    @BindView(R.id.btn_qq)
    ImageButton btnQq;
    @BindView(R.id.btn_weibo)
    ImageButton btnWeibo;
    @BindView(R.id.btn_wechat)
    ImageButton btnWechat;
    @BindView(R.id.activity_login)
    LinearLayout activityLogin;
    private String username_text;
    private String psw_text;

    public static final int LOGIN_REQUEST_CODE = 101;
    public static final int LOGIN_RESPONE_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegistActivity.class);
                startActivityForResult(intent, LOGIN_REQUEST_CODE, null);
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.showTost(LoginActivity.this, "欢迎回来  " + username.getEditableText().toString() + "~~~~");
                App.isLogin = true;
                App.APP_username = username_text;
                App.APP_psw = psw_text;
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == LOGIN_REQUEST_CODE && resultCode == LOGIN_RESPONE_CODE) {
            username_text = data.getStringExtra(ConstantString.REGIST_USERNAME);
            psw_text = data.getStringExtra(ConstantString.REGIST_PSW);
            username.setText(username_text);
            psw.setText(psw_text);
        }
    }
}
