package com.restaurante.app.flordemandacaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Telamenu extends AppCompatActivity implements View.OnClickListener  {

    private Button btPedido;
    private Button btLibera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telamenu);

        btPedido = (Button) findViewById(R.id.pedido_tela_menu_botao);
        btPedido.setOnClickListener(this);

        btLibera = (Button) findViewById(R.id.liberar_tela_menu_botao);
        btLibera.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelect(MenuItem item){
          int id = item.getItemId();
           if (id == 16908332)
               this.finish();
               return true;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pedido_tela_menu_botao:
                startActivity(new Intent(this, Telapedido.class));
                break;
            case R.id.liberar_tela_menu_botao:
                startActivity(new Intent(this, Telalibera.class));
                break;
        }
    }
}
