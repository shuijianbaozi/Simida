package com.example.my.simida.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my.simida.R;
import com.example.my.simida.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstPageFragment extends BaseFragment{

   public static FirstPageFragment newInstance(){
       FirstPageFragment firstPageFragment = new FirstPageFragment();
       Bundle args = new Bundle();
      firstPageFragment.setArguments(args);
       return firstPageFragment;
   }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
