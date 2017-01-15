package com.itheima.mymediaplayer;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

import com.itheima.mymediaplayer.factory.FragmentFactory;
import com.itheima.mymediaplayer.ui.activity.BaseActivity;
import com.itheima.mymediaplayer.ui.activity.SettingsActivity;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.bottomBar)
    BottomBar mBottomBar;
    private FragmentManager mSupportFragmentManager;
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    /**
     * 数据的初始化
     */
    @Override
    protected void init() {
        super.init();
        mSupportFragmentManager = getSupportFragmentManager();

        mBottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                FragmentTransaction fragmentTransaction = mSupportFragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,FragmentFactory.getInstance().getFragment(tabId));
                fragmentTransaction.commit();
            }
        });
    }

    /**
     * 创建菜单
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * 设置按钮的选项
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
