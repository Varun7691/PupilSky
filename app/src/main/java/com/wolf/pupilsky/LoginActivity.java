package com.wolf.pupilsky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username_edit, password_edit;
    TextView forgot_password, sign_up;
    Button sign_in;
    ImageView google_login, facebook_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        username_edit = (EditText) findViewById(R.id.username_edit);
        password_edit = (EditText) findViewById(R.id.password_edit);
        forgot_password = (TextView) findViewById(R.id.forgot_password);
        sign_up = (TextView) findViewById(R.id.sign_up);
        sign_in = (Button) findViewById(R.id.sign_in);
        facebook_login = (ImageView) findViewById(R.id.facebook_login);
        google_login = (ImageView) findViewById(R.id.google_login);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username_edit_str = username_edit.getText().toString();
                String password_edit_str = password_edit.getText().toString();

                if (username_edit_str.isEmpty() || password_edit_str.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
