package com.example.skinslol;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnFuncion;
    Button btnFuncion2;
    Button btnFuncion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);
              btnFuncion = findViewById(R.id.btnParche);
              btnFuncion.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Intent intent = new Intent(MainActivity.this, ParcheActivity.class);
                      startActivity(intent);
                  }
              });

        btnFuncion2 = findViewById(R.id.btnNotificaciones);
        btnFuncion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NotificacionesActivity.class);
                startActivity(intent);
            }
        });
        btnFuncion3 = findViewById(R.id.btnOfertas);
        btnFuncion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
              }
    }

