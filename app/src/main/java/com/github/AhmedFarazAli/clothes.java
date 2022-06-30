package com.github.AhmedFarazAli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class clothes extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);
        btn=findViewById(R.id.button2);
        setupListeners();
    }
    private void setupListeners() {

        btn.setOnClickListener(view -> {
            Intent i = new Intent(clothes.this, orderDatails.class);
            startActivity(i);
        });
    }
}