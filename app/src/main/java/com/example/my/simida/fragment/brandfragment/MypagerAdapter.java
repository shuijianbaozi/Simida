package com.example.my.simida.fragment.brandfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by apple on 16/11/17.
 */

public class MypagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> listFragment;

    public MypagerAdapter(FragmentManager fm, List<Fragment> listFragment) {
        super(fm);
        this.listFragment = listFragment;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = listFragment.get(position);
        return fragment;
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }
}
