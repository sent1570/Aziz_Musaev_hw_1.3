package com.example.aziz_musaev_hw_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
private TextView tvNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tvNumber2 = findViewById(R.id.Number2);
        String text4 = getIntent().getStringExtra("number2");
        tvNumber2.setText("Номер телефона:" + text4);
    }

}