package com.github.AhmedFarazAli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class books extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        btn=findViewById(R.id.button);
        setupListeners();
    }
    private void setupListeners() {

        btn.setOnClickListener(view -> {
            Intent i = new Intent(books.this, orderDatails.class);
            startActivity(i);
        });
    }
}