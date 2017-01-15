package com.itheima.mymediaplayer.ui.activity;

import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.itheima.mymediaplayer.MainActivity;
import com.itheima.mymediaplayer.R;

import butterknife.BindView;

public class SplashActivity extends BaseActivity {
    @BindView(R.id.splash_image)
    ImageView mSplashImage;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init() {
        super.init();
        //动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //动画完成之后条转到主界面
                Intent intent=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mSplashImage.startAnimation(animation);
    }


}
