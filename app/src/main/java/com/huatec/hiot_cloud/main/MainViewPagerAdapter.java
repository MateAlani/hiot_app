package com.huatec.hiot_cloud.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.huatec.hiot_cloud.utils.Constants;

class MainViewPagerAdapter extends FragmentPagerAdapter {
    public MainViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case Constants.MAIN_VIEWPAGER_INDEX_MESSAGE:
                //创建消息的Fragment片段 TODO
                break;
            case Constants.MAIN_VIEWPAGER_INDEX_EQUIPMENT:
                //创建设备的Fragment片段
                break;
            case Constants.MAIN_VIEWPAGER_INDEX_SCENE:
                //创建场景的Fragment片段
                break;
            case Constants.MAIN_VIEWPAGER_INDEX_MINE:
                //创建我的的Fragment片段
                break;
            default:
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return Constants.MAIN_FRAGMENT_COUNT;
    }
}