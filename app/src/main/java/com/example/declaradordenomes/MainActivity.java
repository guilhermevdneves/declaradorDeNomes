package com.example.declaradordenomes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.imcapplication.R;

public class MainActivity extends AppCompatActivity {
    EditText nome,sobrenome;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.editTextNome);
        sobrenome = (EditText) findViewById(R.id.editTextSobrenome);
        botao = (Button) findViewById(R.id.buttonOk);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarTelaResultado();
            }
        });
    }

    public void mostrarTelaResultado(){

        if(TextUtils.isEmpty(nome.getText().toString())){
            nome.setError("Campo obrigatório!");
            return;
        }
        if(TextUtils.isEmpty(sobrenome.getText().toString())){
            sobrenome.setError("Campo obrigatório!");
            return;
        }

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("nome",nome.getText().toString());
        intent.putExtra("sobrenome",sobrenome.getText().toString());

        startActivity(intent);
    }
}