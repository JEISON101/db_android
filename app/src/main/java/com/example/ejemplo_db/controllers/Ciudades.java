package com.example.ejemplo_db.controllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejemplo_db.R;
import com.example.ejemplo_db.models.City;
import com.example.ejemplo_db.models.ManagerDb;

public class Ciudades extends AppCompatActivity {

    Button btn_insert_ciudad;
    EditText txt_name_city;
    ManagerDb managerDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudades);

        btn_insert_ciudad = findViewById(R.id.btn_insert_city);
        txt_name_city=findViewById(R.id.txt_name_city);

        City city = new City(txt_name_city.getText().toString());


        btn_insert_ciudad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long rest = managerDb.insertCity(city);
                if(rest > 0){
                    Toast.makeText(Ciudades.this, "Ciudad agregada", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Ciudades.this, "No se pudo agregar la ciudad", Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });

    }

}