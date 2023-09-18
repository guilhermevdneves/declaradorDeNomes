package com.example.declaradordenomes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.imcapplication.R;

public class ResultActivity extends AppCompatActivity {
    TextView resultado;
    String strNome, strSobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultado = (TextView) findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        strNome = intent.getStringExtra("nome");
        strSobrenome = intent.getStringExtra("sobrenome");

        String strResult = "Olá:  Seu nome completo é: " + strNome + " " + strSobrenome + "!";
        resultado.setText(strResult);
    }
}