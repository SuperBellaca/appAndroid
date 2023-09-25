package com.example.skinslol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParcheActivity extends AppCompatActivity {
    Button btnParche1;
    Button btnParche2;
    Button btnParche3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parche);
        btnParche1 = findViewById(R.id.btnOfertaParche);
        btnParche1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ParcheActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnParche2 = findViewById(R.id.btnParcheMain);
        btnParche2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ParcheActivity.this, ParcheActivity.class);
                startActivity(intent);
            }
        });
        btnParche3 = findViewById(R.id.btnNotiParche);
        btnParche3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ParcheActivity.this, NotificacionesActivity.class);
                startActivity(intent);
            }
        });
    }
}