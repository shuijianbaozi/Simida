package com.example.my.simida;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.my.simida.fragment.BrandFragment;
import com.example.my.simida.fragment.FindFragment;
import com.example.my.simida.fragment.FirstPageFragment;
import com.example.my.simida.fragment.MyFragment;
import com.example.my.simida.fragment.TypeFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fragment> mMainFragments = new ArrayList<>();
    private FragmentManager mFragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        FirstPageFragment firstPageFragment = FirstPageFragment.newInstance();
        BrandFragment brandFragment = BrandFragment.newInstance();
        FindFragment findFragment = FindFragment.newInstance();
        TypeFragment typrFragment = TypeFragment.newInstance();
        MyFragment myFragment = MyFragment.newInstance();
        mMainFragments.add(firstPageFragment);
        mMainFragments.add(brandFragment);
        mMainFragments.add(findFragment);
        mMainFragments.add(typrFragment);
        mMainFragments.add(myFragment);


    }
}
