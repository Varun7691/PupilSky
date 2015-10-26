package com.wolf.pupilsky;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.wolf.pupilsky.utils.SlideDown;

import net.simonvt.menudrawer.MenuDrawer;
import net.simonvt.menudrawer.Position;

public class HomeActivity extends AppCompatActivity {

    public static MenuDrawer mMenuDrawer;
    TextView title, content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#454545"));
        }

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);

        mMenuDrawer = MenuDrawer.attach(this, MenuDrawer.Type.OVERLAY, Position.LEFT,
                MenuDrawer.MENU_DRAG_WINDOW);

        mMenuDrawer.setTouchMode(MenuDrawer.TOUCH_MODE_BEZEL);

        mMenuDrawer.setContentView(R.layout.activity_home);
        mMenuDrawer.setMenuView(R.layout.slider);
        mMenuDrawer.setDropShadowEnabled(false);

        title = (TextView) findViewById(R.id.title);
        content = (TextView) findViewById(R.id.content);

        content.setVisibility(View.GONE);

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (content.isShown()) {
                    SlideDown.slide_up(HomeActivity.this, content);
                    content.setVisibility(View.GONE);
                } else {
                    content.setVisibility(View.VISIBLE);
                    SlideDown.slide_down(HomeActivity.this, content);
                }
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            mMenuDrawer.toggleMenu();
        }
        return super.onOptionsItemSelected(item);
    }
}
