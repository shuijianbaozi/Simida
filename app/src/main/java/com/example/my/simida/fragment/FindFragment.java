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
public class FindFragment extends BaseFragment {


    public static FindFragment newInstance() {
        FindFragment findFragment = new FindFragment();
        Bundle args = new Bundle();
        findFragment.setArguments(args);
        return findFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_find, container, false);
    }

}
