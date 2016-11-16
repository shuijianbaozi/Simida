package com.example.my.simida;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import com.example.my.simida.fragment.BrandFragment;
import com.example.my.simida.fragment.FindFragment;
import com.example.my.simida.fragment.FirstPageFragment;
import com.example.my.simida.fragment.MyFragment;
import com.example.my.simida.fragment.TypeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
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
    private List<Fragment> mMainFragments = new ArrayList<>();
    private FragmentManager mFragmentManager = getSupportFragmentManager();

//    //TODO TabLayLayout
//    public static final String[] TITLES = {"人气","时尚","美容","私蜜圈","TOP榜"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        initView();
    }

    private void initView() {
        rbtnTab1.setOnClickListener(this);
        rbtnTab2.setOnClickListener(this);
        rbtnTab3.setOnClickListener(this);
        rbtnTab4.setOnClickListener(this);
        rbtnTab5.setOnClickListener(this);
    }

    private void initData() {
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
}
