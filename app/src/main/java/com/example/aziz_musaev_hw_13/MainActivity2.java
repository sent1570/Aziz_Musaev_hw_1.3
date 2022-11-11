package com.example.aziz_musaev_hw_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
private TextView tvNumber1;
    private TextView tvRandomNumber;
private Button btGenerateCode;
private EditText etPassword;
    private Button btSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btGenerateCode = findViewById(R.id.generateCode);
        tvNumber1 = findViewById(R.id.Number1);
        etPassword = findViewById(R.id.Password);
        btSignIn = findViewById(R.id.signIn);
        tvRandomNumber = findViewById(R.id.randomNumber);
        String text2 =  getIntent().getStringExtra("number");
        tvNumber1.setText("Введите код на введенный номер:" + text2);
        onClicker();
    }
    public void onClicker (){
        btGenerateCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                Integer a = random.nextInt(10);
                Integer b = random.nextInt(10);
                Integer c = random.nextInt(10);
                Integer s = random.nextInt(10);
                Integer d = random.nextInt(10);
                Integer f = random.nextInt(10);
                String asd = a.toString() + b.toString() + c.toString() + s.toString()
                        + d.toString() + f.toString();
                tvRandomNumber.setText( "Ваш код:"  +  asd);
                btSignIn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (etPassword.getText().toString().length() != 0) {
                            if (Integer.parseInt(asd) == Integer.parseInt(etPassword.getText().toString())) {
                                Intent intent2 = new Intent(MainActivity2.this, MainActivity3.class);
                                String text6 = getIntent().getStringExtra("number");
                                intent2.putExtra("number2", text6);
                                startActivity(intent2);
                            }
                            else {
                                Toast.makeText(MainActivity2.this, "Неправильный пароль", Toast.LENGTH_SHORT).show();
                            }
                        }
                            else {
                                Toast.makeText(MainActivity2.this, "Неправильный пароль", Toast.LENGTH_SHORT).show();
                            }

                    }
                });
            }
        });


    }
}