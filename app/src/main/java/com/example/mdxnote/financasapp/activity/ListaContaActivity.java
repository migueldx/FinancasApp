package com.example.mdxnote.financasapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mdxnote.financasapp.R;
import com.example.mdxnote.financasapp.model.Conta;
import com.example.mdxnote.financasapp.service.ContaService;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListaContaActivity extends AppCompatActivity {
    @BindView(R.id.lv_lista_conta)
    ListView listaConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_conta);
        ButterKnife.bind(this);

        List<Conta> listaContas = new ContaService().buscarTodos();

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, listaContas);

        listaConta.setAdapter(adapter);
    }

    @OnClick(R.id.btn_novo)
    public void aoClicarBotaoNovo(){
        Intent irParaCadastro = new Intent(this, CadastroContaActivity.class);
        startActivityForResult(irParaCadastro, 100);
    }
}
