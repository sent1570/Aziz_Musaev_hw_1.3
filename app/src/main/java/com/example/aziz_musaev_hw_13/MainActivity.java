package com.example.aziz_musaev_hw_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText etNumber;
private Button btSignIn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber = findViewById(R.id.Number);
        btSignIn1 = findViewById(R.id.signIn1);
        onClicker();
    }
    public void onClicker(){
        btSignIn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                String text1 =   etNumber.getText().toString();
                intent.putExtra("number",text1);
                startActivity(intent);
            }
        });
    }
}