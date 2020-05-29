package com.example.sarthakmishra.newsslidernew;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by SARTHAK MISHRA on 18-Feb-18.
 */

public class Pager extends FragmentStatePagerAdapter {
    public Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
