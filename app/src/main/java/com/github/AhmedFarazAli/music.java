package com.github.AhmedFarazAli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class music extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        btn=findViewById(R.id.button4);
        setupListeners();
    }
    private void setupListeners() {

        btn.setOnClickListener(view -> {
            Intent i = new Intent(music.this, orderDatails.class);
            startActivity(i);
        });
    }
}