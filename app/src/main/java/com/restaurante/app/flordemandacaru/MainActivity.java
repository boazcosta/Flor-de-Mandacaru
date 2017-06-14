package com.restaurante.app.flordemandacaru;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btLogin;
    private Button btEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = (Button) findViewById(R.id.cadastro_tela_login_botao);
        btLogin.setOnClickListener(this);

        btEntrar = (Button) findViewById(R.id.login_tela_login_botao);
        btEntrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cadastro_tela_login_botao:
                startActivity(new Intent(this, Telacadastro.class));
                break;
            case R.id.login_tela_login_botao:
                startActivity(new Intent(this, Telamenu.class));
                break;
        }
    }
}
