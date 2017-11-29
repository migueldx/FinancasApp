package com.example.mdxnote.financasapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mdxnote.financasapp.service.Calculadora;
import com.example.mdxnote.financasapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnSomar = (Button) findViewById(R.id.btn_somar);
        Button btnSubtrair = (Button) findViewById(R.id.btn_subtrair);
        Button btnDividir = (Button) findViewById(R.id.btn_dividir);
        Button btnMultiplicar = (Button) findViewById(R.id.btn_multiplicar);


        btnSomar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText campoNumero1 = (EditText) findViewById(R.id.campo_numero1);
                String texto1 = campoNumero1.getText().toString();

                EditText campoNumero2 = (EditText) findViewById(R.id.campo_numero2);
                String texto2 = campoNumero2.getText().toString();

                Calculadora calc = new Calculadora();
                Double soma =  calc.somar(texto1, texto2);

                TextView saida = (TextView)findViewById(R.id.saida);

                saida.setText(soma.toString());
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText campoNumero1 = (EditText) findViewById(R.id.campo_numero1);
                String texto1 = campoNumero1.getText().toString();

                EditText campoNumero2 = (EditText) findViewById(R.id.campo_numero2);
                String texto2 = campoNumero2.getText().toString();

                Calculadora calc = new Calculadora();
                Double soma =  calc.subtrair(texto1, texto2);

                TextView saida = (TextView)findViewById(R.id.saida);

                saida.setText(soma.toString());
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText campoNumero1 = (EditText) findViewById(R.id.campo_numero1);
                String texto1 = campoNumero1.getText().toString();

                EditText campoNumero2 = (EditText) findViewById(R.id.campo_numero2);
                String texto2 = campoNumero2.getText().toString();

                Calculadora calc = new Calculadora();
                Double soma =  calc.dividir(texto1, texto2);

                TextView saida = (TextView)findViewById(R.id.saida);

                saida.setText(soma.toString());
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText campoNumero1 = (EditText) findViewById(R.id.campo_numero1);
                String texto1 = campoNumero1.getText().toString();

                EditText campoNumero2 = (EditText) findViewById(R.id.campo_numero2);
                String texto2 = campoNumero2.getText().toString();

                Calculadora calc = new Calculadora();
                Double soma =  calc.multiplicar(texto1, texto2);

                TextView saida = (TextView)findViewById(R.id.saida);

                saida.setText(soma.toString());
            }
        });

    }




}
