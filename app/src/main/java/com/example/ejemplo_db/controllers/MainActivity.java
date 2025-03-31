package com.example.ejemplo_db.controllers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ejemplo_db.R;

public class MainActivity extends AppCompatActivity {
    Button btn_agregar_ciudad, btn_agregar_dato, btn_agregar_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_agregar_ciudad=findViewById(R.id.btn_agregar_ciudad);
        btn_agregar_dato=findViewById(R.id.btn_agregar_dato);
        btn_agregar_usuario=findViewById(R.id.btn_agregar_usuario);

        btn_agregar_ciudad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir_ciudad = new Intent(MainActivity.this, Ciudades.class);
                startActivity(ir_ciudad);
            }
        });

        btn_agregar_dato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir_date = new Intent(MainActivity.this, Datos.class);
                startActivity(ir_date);
            }
        });

        btn_agregar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir_user = new Intent(MainActivity.this, Usuarios.class);
                startActivity(ir_user);
            }
        });
    }
}