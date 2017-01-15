package com.itheima.mymediaplayer.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * 类    名:  BaseFragment
 * 创 建 者:  魏方涛
 * 创建时间:  2017/1/15 19:06
 * 更新者  :  $Author$
 * 更新时间:  $Date$
 * 描    述:  Fragment的基类,用于初始化数据 布局等
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResId(), null);
        ButterKnife.bind(rootView);
        init();
        return rootView;
    }
    /**
     * 初始化数据
     */
    protected abstract void init();
    /**
     * 舒适化布局
     * @return
     */
    protected abstract int getLayoutResId();
}
