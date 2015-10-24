package com.wolf.pupilsky;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wolf.pupilsky.utils.SlideDown;

public class HomeActivity extends AppCompatActivity {

    TextView title, content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#454545"));
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);

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
}
