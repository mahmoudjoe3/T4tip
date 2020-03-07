package com.example.T4tip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private TextView Sign_up;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUp_intent = new Intent(Login.this,Register.class);
                startActivity(SignUp_intent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this, realty_details.class);
                startActivity(intent);
            }
        });
    }

    public void init()
    {
        Sign_up = (TextView) findViewById(R.id.sign_up);
        Login = (Button)findViewById(R.id.login_btn);
    }
}
