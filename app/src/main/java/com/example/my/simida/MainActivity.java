package com.example.my.simida;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.my.simida.base.BaseActivity;
import com.example.my.simida.fragment.BrandFragment;
import com.example.my.simida.fragment.FirstPageFragment;
import com.example.my.simida.fragment.MyFragment;
import com.example.my.simida.fragment.TypeFragment;
import com.example.my.simida.fragment.findfragment.FindFragment;
import com.example.my.simida.utils.UIManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.rbtn_tab1)
    RadioButton rbtnTab1;
    @BindView(R.id.rbtn_tab2)
    RadioButton rbtnTab2;
    @BindView(R.id.rbtn_tab3)
    RadioButton rbtnTab3;
    @BindView(R.id.rbtn_tab4)
    RadioButton rbtnTab4;
    @BindView(R.id.rbtn_tab5)
    RadioButton rbtnTab5;
    @BindView(R.id.iv_main_tishi)
    ImageView ivMainTishi;
    @BindView(R.id.iv_main_car)
    ImageView ivMainCar;
    @BindView(R.id.layout_tab)
    RadioGroup layoutTab;
    @BindView(R.id.main_linear)
    LinearLayout mainLinear;
    @BindView(R.id.activity_main)
    DrawerLayout activityMain;
    @BindView(R.id.main_title)
    ImageView mainTitle;
    @BindView(R.id.main_toolbar)
    Toolbar mainToolbar;
    @BindView(R.id.main_framelayout)
    FrameLayout mainFramelayout;
    private List<Fragment> mMainFragments = new ArrayList<>();
    private FragmentManager mFragmentManager = getSupportFragmentManager();
    private Timer tExit;
    private static Boolean isExit = false;
    private Context mContext = this;
    private String[] mZu = null;
    private PopupWindow popupWindow = null;
    private View popupView;
    // TODO TabLayLayout
//    public static final String[] TITLES = {"人气","时尚","美容","私蜜圈","TOP榜"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();
        initPopupWindow();
        initView();
    }

    private void initPopupWindow() {
        popupView = getLayoutInflater()
                .inflate(R.layout.popupwindow_menu, null);
        popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT, true);
        popupWindow.setAnimationStyle(R.style.PopupAnimation);
        final TextView textView = (TextView) popupView.findViewById(R.id.tv_pop);
        Button button_confirm = (Button) popupView
                .findViewById(R.id.button_confirm);


        button_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = (int) (Math.random() * mZu.length);
                textView.setText(mZu[i]);
                popupWindow.dismiss();
            }
        });
    }


    private void initView() {
        rbtnTab1.setOnClickListener(this);
        rbtnTab2.setOnClickListener(this);
        rbtnTab3.setOnClickListener(this);
        rbtnTab4.setOnClickListener(this);
        rbtnTab5.setOnClickListener(this);

    }

    private void initData() {
        mZu = getResources().getStringArray(R.array.tishi);
        FirstPageFragment firstPageFragment = FirstPageFragment.newInstance();
        BrandFragment brandFragment = BrandFragment.newInstance();
        FindFragment findFragment = FindFragment.newInstance();
        TypeFragment typeFragment = TypeFragment.newInstance();
        MyFragment myFragment = MyFragment.newInstance();
        mMainFragments.add(firstPageFragment);
        mMainFragments.add(brandFragment);
        mMainFragments.add(findFragment);
        mMainFragments.add(typeFragment);
        mMainFragments.add(myFragment);

        String[] stringArray = getResources().getStringArray(R.array.fragmentname);

        //------>test 集合是否添加成
        for (int i = 0; i < mMainFragments.size(); i++) {
            Log.e("lgo", "" + mMainFragments.get(i));
            Log.e("lgo", "" + stringArray[i]);
        }
        FragmentTransaction ft = mFragmentManager.beginTransaction();
        for (int i = 0; i < mMainFragments.size(); i++) {
            ft.add(R.id.main_framelayout, mMainFragments.get(i), stringArray[i]);
            ft.hide(mMainFragments.get(i));
        }
        ft.show(mMainFragments.get(0));
        ft.commit();

    }

    @Override
    @OnClick({R.id.iv_main_tishi, R.id.iv_main_car})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rbtn_tab1:
                displayFragment(0);
                break;
            case R.id.rbtn_tab2:
                displayFragment(1);
                break;
            case R.id.rbtn_tab3:
                displayFragment(2);
                break;
            case R.id.rbtn_tab4:
                displayFragment(3);
                break;
            case R.id.rbtn_tab5:
                displayFragment(4);
                break;
            case R.id.iv_main_tishi:
                popupWindow.showAsDropDown(view);
                popupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);
                break;
            case R.id.iv_main_car:
                UIManager.startShopCar(mContext);
                break;
        }
    }

    public void displayFragment(int num) {
        FragmentTransaction ft = mFragmentManager.beginTransaction();
        for (int i = 0; i < mMainFragments.size(); i++) {
            ft.hide(mMainFragments.get(i));

        }
        ft.show(mMainFragments.get(num));
        Log.e("log", "" + num);
        ft.commit();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click(); //退出应用的操作
        }
        return false;

    }


    private void exitBy2Click() {
        if (isExit == false) {
            isExit = true; // 准备退出
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            tExit = new Timer();
            tExit.schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false; // 取消退出
                }
            }, 2000); // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务
        } else {
            finish();
            System.exit(0);
        }
    }

}
