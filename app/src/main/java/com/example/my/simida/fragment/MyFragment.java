package com.example.my.simida.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.my.simida.R;
import com.example.my.simida.base.BaseFragment;
import com.example.my.simida.ui.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment {
    @BindView(R.id.btn_start_my)
    Button btnStartMy;
    Context mContext;
    public static final int START_REQUEST_CODE = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        ButterKnife.bind(this, view);
        initButton();

        return view;
    }

    public static MyFragment newInstance() {
        MyFragment myFragment = new MyFragment();
        Bundle args = new Bundle();
        myFragment.setArguments(args);
        return myFragment;
    }

    private void initButton() {
        btnStartMy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivityForResult(intent, START_REQUEST_CODE, null);
            }
        });
    }

}
