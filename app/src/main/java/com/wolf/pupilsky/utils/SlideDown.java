package com.wolf.pupilsky.utils;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.wolf.pupilsky.R;

/**
 * Created by VarunBarve on 10/24/2015.
 */
public class SlideDown {
    public static void slide_down(Context ctx, View v) {
        Animation a = AnimationUtils.loadAnimation(ctx, R.anim.expand_anim);
        if (a != null) {
            a.reset();
            if (v != null) {
                v.clearAnimation();
                v.startAnimation(a);
            }
        }
    }

    public static void slide_up(Context ctx, View v) {
        Animation a = AnimationUtils.loadAnimation(ctx, R.anim.collapse_anim);
        if (a != null) {
            a.reset();
            if (v != null) {
                v.clearAnimation();
                v.startAnimation(a);
            }
        }
    }
}
