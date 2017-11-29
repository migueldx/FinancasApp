package com.example.mdxnote.financasapp.service;

import com.example.mdxnote.financasapp.model.Conta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MDXNOTE on 28/10/2017.
 */

public class ContaService {
    private static List<Conta> listaConta = new ArrayList<>();

    public void cadastrar(Conta conta){
        listaConta.add(conta);
    }

    public List<Conta> buscarTodos(){
        return listaConta;
    }
}
