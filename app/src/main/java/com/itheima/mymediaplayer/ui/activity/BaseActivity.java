package com.itheima.mymediaplayer.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * 类    名:  BaseActivity
 * 创 建 者:  魏方涛
 * 创建时间:  2017/1/15 18:40
 * 更新者  :  $Author$
 * 更新时间:  $Date$
 * 描    述:  ${TODO}
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
        init();
    }

    /**
     * 初始化的时候使用,选择性继承
     */
    protected void init() {
    }

    /**
     * 初始化,获取布局文件
     * @return
     */
    protected abstract int getLayoutResId();
}
