package com.wolf.pupilsky;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText firstname_edit, lastname_edit, email_edit, number_edit, password_edit;
    Button sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        sign_in = (Button) findViewById(R.id.sign_in);
        firstname_edit = (EditText) findViewById(R.id.firstname_edit);
        lastname_edit = (EditText) findViewById(R.id.lastname_edit);
        email_edit = (EditText) findViewById(R.id.email_edit);
        number_edit = (EditText) findViewById(R.id.number_edit);
        password_edit = (EditText) findViewById(R.id.password_edit);

        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname_edit_str = firstname_edit.getText().toString();
                String lastname_edit_str = lastname_edit.getText().toString();
                String email_edit_str = email_edit.getText().toString();
                String number_edit_str = number_edit.getText().toString();
                String password_edit_str = password_edit.getText().toString();

                if (firstname_edit_str.isEmpty() || lastname_edit_str.isEmpty() || email_edit_str.isEmpty() || number_edit_str.isEmpty() || password_edit_str.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignUpActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
