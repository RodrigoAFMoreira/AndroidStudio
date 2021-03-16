package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button soma;
    private Button subtracao;
    private Button multiplicacao;
    private Button divisao;
    private TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        soma = (Button)findViewById(R.id.soma);
        subtracao = (Button)findViewById(R.id.subtracao);
        multiplicacao = (Button)findViewById(R.id.multiplicacao);
        divisao = (Button)findViewById(R.id.multiplicacao);
        resposta = (TextView) findViewById(R.id.resposta);


        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                int soma = numero1 + numero2;
                resposta.setText("Result: " + String.valueOf(soma));
                }
        });

        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                int subtracao = numero1 - numero2;
                resposta.setText("Result: " + String.valueOf(subtracao));
            }
        });

        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                int multiplicacao = numero1 * numero2;
                resposta.setText("Result: " + String.valueOf(multiplicacao));
            }
        });

        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Alerta");
                alerta.setMessage("A divisão é infinita");
                AlertDialog alertDialog = alerta.create();
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                if (numero2 != 0) {
                    int divisao = numero1 / numero2;
                    resposta.setText("Result: " + String.valueOf(divisao));
                }
                if(numero2 == 0){
                    alertDialog.show();
                }
            }
        });
    }
}