package fpl.quangnm.lab1.demo4;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class Demo43Adapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();  // chua frament
    private final List<String> frStringTitle = new ArrayList<>();  // chua frament
    public Demo43Adapter(@NonNull FragmentManager fm) {
        super(fm);
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return frStringTitle.get(position);
    }
    public void addFrm(Fragment fragment, String string){
        fragmentList.add(fragment);
        frStringTitle.add(string);

    }
}
