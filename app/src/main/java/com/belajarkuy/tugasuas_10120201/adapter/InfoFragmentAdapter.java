//10120201 - Ilham Ramdhan Putra Lesmana - IF5
package com.belajarkuy.tugasuas_10120201.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class InfoFragmentAdapter extends FragmentStatePagerAdapter {
    public List<Fragment>fragmentList;

    public InfoFragmentAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
