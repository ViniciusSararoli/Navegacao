package com.example.navegacao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProxima = (Button) findViewById(R.id.btnProxima);
        btnProxima.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                proximaTela();
            }
        });
    }

    public void proximaTela() {
        Intent principal = new Intent(this,Principal.class);
        startActivity(principal);
    }
}