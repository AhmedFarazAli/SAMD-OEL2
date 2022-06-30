package com.github.AhmedFarazAli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button register;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
        setupListeners();

    }
    private void setupUI() {
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);
    }
    private void setupListeners() {
        login.setOnClickListener(v -> checkUsername());

        register.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, SignUp.class);
            startActivity(i);
        });
    }
    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    void  checkUsername(){
        if (isEmpty(username)) {
            username.setError("UserName is required!");
            Toast t = Toast.makeText(this, "UserName is required!", Toast.LENGTH_SHORT);
            t.show();
        }

        if (isEmpty(password)) {
            password.setError("Password is required!");
        }
        else {
            Intent i = new Intent(MainActivity.this, dashboard.class);
            startActivity(i);
        }
    }
}



















