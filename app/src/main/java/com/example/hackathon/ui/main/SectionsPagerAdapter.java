package com.example.hackathon.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.hackathon.FragmentEtapa1;
import com.example.hackathon.FragmentEtapa2;
import com.example.hackathon.FragmentEtapa3;
import com.example.hackathon.FragmentEtapa4;
import com.example.hackathon.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position){
            case 0:
                FragmentEtapa1 fragmentEtapa1 = new FragmentEtapa1();
                return fragmentEtapa1;
            case 1:
                FragmentEtapa2 fragmentEtapa2 = new FragmentEtapa2();
                return fragmentEtapa2;
            case 2:
                FragmentEtapa3 fragmentEtapa3 = new FragmentEtapa3();
                return  fragmentEtapa3;
            case 3:
                FragmentEtapa4 fragmentEtapa4 = new FragmentEtapa4();
                return  fragmentEtapa4;
        }
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 4;
    }
}