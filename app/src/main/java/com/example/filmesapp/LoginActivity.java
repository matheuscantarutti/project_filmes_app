package com.example.filmesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText email;
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       binding();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString() == "admin" && senha.getText().toString() == "123"){
                    setResult(10);
                    finish();
                }
            }
        });
    }

    private void binding() {
        btnLogin = findViewById(R.id.btnLogin);
        email = findViewById(R.id.txtLoginEmail);
        senha = findViewById(R.id.txtLoginSenha);

    }
}