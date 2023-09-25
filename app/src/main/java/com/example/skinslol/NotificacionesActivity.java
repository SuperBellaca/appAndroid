package com.example.skinslol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificacionesActivity extends AppCompatActivity {
Button btnNoti1;
Button btnNoti2;
Button btnNoti3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);
        btnNoti1 = findViewById(R.id.btnOfertasNotificaciones);
        btnNoti1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NotificacionesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}