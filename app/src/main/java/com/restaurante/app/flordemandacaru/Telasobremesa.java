package com.restaurante.app.flordemandacaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telasobremesa extends AppCompatActivity implements View.OnClickListener {
    private Button btCancela;
    private Button btConclui;


    String nome_mensagem;
    int prioridade_mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telasobremesa);

        btCancela = (Button) findViewById(R.id.cancelar_tela_sobremesa_botao);
        btCancela.setOnClickListener(this);

        btConclui = (Button) findViewById(R.id.conclui_tela_sobremesas_botao);
        btConclui.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancelar_tela_sobremesa_botao:
                startActivity(new Intent(this, Telamenu.class));
                break;
            case R.id.conclui_tela_sobremesas_botao:
                startActivity(new Intent(this, Telamenu.class));
                break;
        }
    }

    public void atribuirBolinho(View View) {
        nome_mensagem = "Bolinho de Camarão";
        prioridade_mensagem = 2;
    }
    public void atribuirBoloTrufado(View View) {
        nome_mensagem = "Bolo Trufado de Chocolate";
        prioridade_mensagem = 3;
    }
    public void atribuirBoloMaracuja(View View) {
        nome_mensagem = "Bolo de Maracujá";
        prioridade_mensagem = 2;
    }
    public void atribuirCreme(View View) {
        nome_mensagem = "Creme Inglês";
        prioridade_mensagem = 1;
    }
    public void atribuirCoca(View View) {
        nome_mensagem = "Coca Cola";
        prioridade_mensagem = 1;
    }
    public void atribuirMilk(View View) {
        nome_mensagem = "Milk Shake Tudão";
        prioridade_mensagem = 1;
    }
    public void atribuirPudim(View View) {
        nome_mensagem = "Pudim de Leite";
        prioridade_mensagem = 1;
    }
    public void atribuirTBranco(View View) {
        nome_mensagem = "Torta de Chocolate Branco";
        prioridade_mensagem = 2;
    }

    public void atribuirTFrango(View View) {
        nome_mensagem = "Torta de Frango";
        prioridade_mensagem = 2;
    }

    public void atribuirTCatupiri(View View) {
        nome_mensagem = "Torta de Frango com Catupiri";
        prioridade_mensagem = 2;
    }

    public void atribuirMorango(View View) {
        nome_mensagem = "Torta de Morango";
        prioridade_mensagem = 2;
    }

    public void voltar(View view){
        finish();
    }
}


