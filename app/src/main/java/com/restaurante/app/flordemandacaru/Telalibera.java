package com.restaurante.app.flordemandacaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telalibera extends AppCompatActivity implements View.OnClickListener {

    Button btLiberaMesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telalibera);


        btLiberaMesa = (Button) findViewById(R.id.mesa_tela_liberaMesa_botao);
        btLiberaMesa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mesa_tela_liberaMesa_botao:
                startActivity(new Intent(this, Telamenu.class));
                break;
        }
    }
}