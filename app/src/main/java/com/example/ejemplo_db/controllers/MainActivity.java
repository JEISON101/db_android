package com.example.ejemplo_db.controllers;



import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ejemplo_db.R;
import com.example.ejemplo_db.models.DbHelper;
import com.example.ejemplo_db.models.ManagerDb;


public class MainActivity extends AppCompatActivity {
    ManagerDb managerDb;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        managerDb = new ManagerDb(MainActivity.this);
        managerDb.openDbRd();


      long result = managerDb.insertData();

      if(result > 0){
          Toast.makeText(this, "Datos insertados ✔️", Toast.LENGTH_SHORT).show();
      }else{
          Toast.makeText(this, "No se insertaron los datos ✖️", Toast.LENGTH_SHORT).show();
      }
    }
}