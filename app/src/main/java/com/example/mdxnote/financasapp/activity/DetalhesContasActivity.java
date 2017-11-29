package com.example.mdxnote.financasapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mdxnote.financasapp.R;
import com.example.mdxnote.financasapp.model.Conta;
import com.example.mdxnote.financasapp.service.ContaService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetalhesContasActivity extends AppCompatActivity {

    @BindView(R.id.tv_texto_conta)
    TextView tvConta;

    @BindView(R.id.tv_valor_conta)
    TextView tvValor;

    private Conta conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_conta);

        ButterKnife.bind(this);


        Bundle bundle = getIntent().getExtras();
        conta = (Conta) bundle.getSerializable("conta");


        tvConta.setText(conta.getDescricao().toString());
        tvValor.setText(conta.getValor().toString());


    }

    @OnClick(R.id.btn_confirmar)
    public void aoClicarConfirmar(){
        ContaService contaService = new ContaService();
        contaService.cadastrar(conta);
        Toast.makeText(this,"Cadastrado com sucesso!",Toast.LENGTH_SHORT).show();

        Intent irParaListaContas = new Intent(this, ListaContaActivity.class);
        startActivity(irParaListaContas);
    }
}
