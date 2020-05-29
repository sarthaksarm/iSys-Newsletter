package com.example.sarthakmishra.newsslidernew;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SARTHAK MISHRA on 18-Feb-18.
 */

public class Page_3  extends Fragment {

    public Page_3(){};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View Page3=inflater.inflate(R.layout.page3, container, false);
        return Page3;
    }
}