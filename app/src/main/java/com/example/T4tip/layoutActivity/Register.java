package com.example.T4tip.layoutActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.T4tip.R;

public class Register extends AppCompatActivity {
private Button next;
    private TextView to_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();
        to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent to_loin_intent = new Intent(Register.this, Login.class);
                startActivity(to_loin_intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Login_intent = new Intent(Register.this, realty_details.class);
                startActivity(Login_intent);
            }
        });

    }
    public void init()
    {
        to_login = (TextView)findViewById(R.id.login);
        next=findViewById(R.id.nextbtn);
    }
}
