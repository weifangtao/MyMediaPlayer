package com.itheima.mymediaplayer.factory;

import android.support.v4.app.Fragment;

import com.itheima.mymediaplayer.R;
import com.itheima.mymediaplayer.ui.fragment.HomeFragment;
import com.itheima.mymediaplayer.ui.fragment.MVFragment;
import com.itheima.mymediaplayer.ui.fragment.VBangFragment;
import com.itheima.mymediaplayer.ui.fragment.YueDanFragment;

/**
 * 类    名:  FragmentFactory
 * 创 建 者:  魏方涛
 * 创建时间:  2017/1/15 20:44
 * 更新者  :  $Author$
 * 更新时间:  $Date$
 * 描    述:  Fragment的工厂类
 */

public class FragmentFactory {
    //做成单例模式
    private  FragmentFactory(){}
    public static  FragmentFactory mFragmentFactory;

    private HomeFragment mHomeFragment;
    private MVFragment mMVFragment;
    private VBangFragment mVBangFragment;
    private YueDanFragment mYueDanFragment;
    //方式一
//    public static FragmentFactory getInstance(){
//        if(mFragmentFactory==null){
//            return mFragmentFactory=new FragmentFactory();
//        }
//        return mFragmentFactory;
//    }
    //方式二
//    public synchronized static FragmentFactory getInstance(){
//        if(mFragmentFactory==null){
//            return mFragmentFactory=new FragmentFactory();
//        }
//        return mFragmentFactory;
//    }
    //方式三
    public static FragmentFactory getInstance(){
        if(mFragmentFactory==null){
            synchronized (FragmentFactory.class){
                if(mFragmentFactory==null){
                    return mFragmentFactory=new FragmentFactory();
                }
            }
        }
        return mFragmentFactory;
    }

    public Fragment getFragment(int tabId) {
        switch (tabId){
            case R.id.tab_home:
               return getHomeFragment();
            case R.id.tab_vbang:
                return getVBangFragment();
            case R.id.tab_mv:
                return getMVFragment();
            case R.id.tab_yuedan:
                return getYueDanFragment();
        }
        return null;
    }

    private Fragment getHomeFragment() {
        if(mHomeFragment==null){
            return mHomeFragment=new HomeFragment();
        }
        return mHomeFragment;
    }

    public VBangFragment getVBangFragment() {
        if(mVBangFragment==null){
            return mVBangFragment=new VBangFragment();
        }
        return mVBangFragment;
    }

    public MVFragment getMVFragment() {
        if(mMVFragment==null){
            return mMVFragment=new MVFragment();
        }
        return mMVFragment;
    }

    public YueDanFragment getYueDanFragment() {
        if(mYueDanFragment==null){
            return mYueDanFragment=new YueDanFragment();
        }
        return mYueDanFragment;
    }
}
