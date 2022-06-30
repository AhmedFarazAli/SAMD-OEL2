package com.github.AhmedFarazAli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class appliances extends AppCompatActivity {
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appliances);
        btn=findViewById(R.id.btnn);

        setupListeners();
    }
    private void setupListeners() {

        btn.setOnClickListener(view -> {
            Intent i = new Intent(appliances.this, orderDatails.class);
            startActivity(i);
        });
    }
}