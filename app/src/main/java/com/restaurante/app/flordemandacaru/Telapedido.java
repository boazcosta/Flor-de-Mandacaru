package com.restaurante.app.flordemandacaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telapedido extends AppCompatActivity implements View.OnClickListener{
    String nome_mensagem;
    int prioridade_mensagem;


    View view;
    private Button btProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telapedido);


        btProximo= (Button) findViewById(R.id.proxima_tela_pedido_botao);
        btProximo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.proxima_tela_pedido_botao:
                startActivity(new Intent(this, Telacardapio.class));
                break;
        }
    }

    public void atribuirBaiaoDeDois(View View) {
        nome_mensagem = "Baião de Dois";
        prioridade_mensagem = 2;
    }
    public void atribuirAcaraje(View View) {
        nome_mensagem = "Acarajé";
        prioridade_mensagem = 3;
    }
    public void atribuirCarne(View View) {
        nome_mensagem = "Carne de Sol com Queijo Coalho";
        prioridade_mensagem = 2;
    }
    public void atribuirPacoca(View View) {
        nome_mensagem = "Paçoca";
        prioridade_mensagem = 1;
    }
    public void atribuirArroz(View View) {
        nome_mensagem = "Arroz Doce";
        prioridade_mensagem = 1;
    }
    public void atribuirCurau(View View) {
        nome_mensagem = "Curau";
        prioridade_mensagem = 1;
    }
    public void atribuirPamonha(View View) {
        nome_mensagem = "Pamonha";
        prioridade_mensagem = 1;
    }
    public void atribuirMilho(View View) {
        nome_mensagem = "Milho Cozido";
        prioridade_mensagem = 2;
    }

    public void atribuirBaba(View View) {
        nome_mensagem = "Baba Moça";
        prioridade_mensagem = 2;
    }

    public void voltar(View view){
        finish();
    }
}



