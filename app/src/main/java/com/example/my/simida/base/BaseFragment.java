package com.example.my.simida.base;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by apple on 16/11/14.
 */

public class BaseFragment extends Fragment {
    private Activity mActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (Activity) context;
    }

    public Activity getMyActivity() {
        return mActivity;
    }


}
