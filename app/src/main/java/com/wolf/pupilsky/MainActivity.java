package com.wolf.pupilsky;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView mSplashLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSplashLogo = (ImageView) findViewById(R.id.splash_logo);

        Animation left_to_right = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        Animation right_to_left = AnimationUtils.loadAnimation(this, R.anim.right_to_left);

        mSplashLogo.setAnimation(left_to_right);

        mSplashLogo.startAnimation(left_to_right);

        left_to_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, 1000);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });


    }
}
