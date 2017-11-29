package com.example.mdxnote.financasapp.service;

/**
 * Created by MDXNOTE on 14/10/2017.
 */

public class Calculadora {
    public Double somar(Double n1, Double n2){
        return n1 + n2;
    }
    public Double somar(String n1, String n2){
        Double valor1 = new Double(n1);
        Double valor2 = new Double(n2);

        return somar(valor1, valor2);
    }

    public Double subtrair(String n1, String n2){
        Double valor1 = new Double(n1);
        Double valor2 = new Double(n2);

        return valor1-valor2;
    }

    public Double dividir(String n1, String n2){
        Double valor1 = new Double(n1);
        Double valor2 = new Double(n2);

        return valor1/valor2;
    }

    public Double multiplicar(String n1, String n2){
        Double valor1 = new Double(n1);
        Double valor2 = new Double(n2);

        return valor1*valor2;
    }
}
