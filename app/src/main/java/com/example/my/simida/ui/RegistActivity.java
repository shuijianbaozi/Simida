package com.example.my.simida.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.my.simida.R;
import com.example.my.simida.base.BaseActivity;
import com.example.my.simida.bean.LoginBean;
import com.example.my.simida.config.ConstantString;
import com.example.my.simida.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.listener.SaveListener;

public class RegistActivity extends BaseActivity {

    @BindView(R.id.name2)
    EditText name2;
    @BindView(R.id.psw21)
    EditText psw21;
    @BindView(R.id.psw22)
    EditText psw22;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.activity_regist)
    LinearLayout activityRegist;
    private String username;
    private String psw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = name2.getEditableText().toString();
                psw = psw21.getText().toString();
                String psw2 = psw22.getEditableText().toString();
                if (!TextUtils.isEmpty(psw) && !TextUtils.isEmpty(username) && psw.equals(psw2)) {
                    LoginBean person = new LoginBean();
                    person.setUsername(username);
                    person.setUserpsw(psw);
                    person.save(new SaveListener<String>() {
                        @Override
                        public void done(String s, BmobException e) {
                            if(e==null){
                                ToastUtils.showTost(RegistActivity.this,"用户"+username+"注册成功");
                                Intent intent=new Intent();
                                intent.putExtra(ConstantString.REGIST_USERNAME,username);
                                intent.putExtra(ConstantString.REGIST_PSW,psw);
                                setResult(101,intent);
                                finish();
                            }else{
                                ToastUtils.showTost(RegistActivity.this,"创建数据失败：" + e.getMessage());
                            }
                        }
                    });
                }



            }
        });
    }

}
