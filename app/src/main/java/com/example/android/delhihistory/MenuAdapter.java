package com.example.android.delhihistory;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MenuAdapter extends FragmentPagerAdapter {

    public MenuAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new Screen1Fragment();
        else if (position==1)
            return new Screen2Fragment();
        else
            return new Screen3Fragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "1";}
        else if (position==1)
            return "2";
        else
            return "3";
    }
}
