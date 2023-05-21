package com.jcg.onlineproductapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username;

    EditText password;
    Button button;


    @SuppressLint("MissingInflatedID")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);

        //admin and
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("1234")){
                    Intent intent=new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this,"LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}