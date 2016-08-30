package com.kesteli.filip.tablayouttemplate;

/**
 * Created by Filip on 30.8.2016..
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by programer on 18.5.2016..
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] tabs = {"Light", "Dark", "Purple"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new PrviFragment();
                break;
            case 1:
                fragment = new DrugiFragment();
                break;
            case 2:
                fragment = new TreciFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}