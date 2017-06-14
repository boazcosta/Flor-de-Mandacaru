package com.restaurante.app.flordemandacaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Telacadastro extends AppCompatActivity implements View.OnClickListener {

    private Button btConfirma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacadastro);

        btConfirma = (Button) findViewById(R.id.confirma_tela_cadastro_botao);
        btConfirma.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.confirma_tela_cadastro_botao:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}