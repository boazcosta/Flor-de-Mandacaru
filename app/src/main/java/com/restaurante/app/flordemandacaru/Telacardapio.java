package com.restaurante.app.flordemandacaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telacardapio extends AppCompatActivity implements View.OnClickListener{


    Button btBebidas;
    String nome_mensagem;
    int prioridade_mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telabebidas);

        btBebidas = (Button) findViewById(R.id.proxima_tela_bebidas_botao);
        btBebidas.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.proxima_tela_bebidas_botao:
                startActivity(new Intent(this, Telasobremesa.class));
                break;
        }
    }

    public void atribuirAgua(View View) {
        nome_mensagem = "Água";
        prioridade_mensagem = 2;
    }
    public void atribuirAguaDeCoco(View View) {
        nome_mensagem = "Água de Coco";
        prioridade_mensagem = 3;
    }
    public void atribuirCaipirinha(View View) {
        nome_mensagem = "Caipirinha";
        prioridade_mensagem = 2;
    }
    public void atribuirCerveja(View View) {
        nome_mensagem = "Cerveja";
        prioridade_mensagem = 1;
    }
    public void atribuirCoca(View View) {
        nome_mensagem = "Coca Cola";
        prioridade_mensagem = 1;
    }
    public void atribuirGuarana(View View) {
        nome_mensagem = "Guaraná";
        prioridade_mensagem = 1;
    }
    public void atribuirSuco(View View) {
        nome_mensagem = "Suco";
        prioridade_mensagem = 1;
    }
    public void atribuirVBranco(View View) {
        nome_mensagem = "Vinho Branco";
        prioridade_mensagem = 2;
    }

    public void atribuirVPorto(View View) {
        nome_mensagem = "Vinho do Porto";
        prioridade_mensagem = 2;
    }

    public void atribuirWisky(View View) {
        nome_mensagem = "Wisky";
        prioridade_mensagem = 2;
    }

    public void voltar(View view){
        finish();
    }
}

