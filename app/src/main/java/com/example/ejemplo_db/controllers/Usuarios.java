package com.example.ejemplo_db.controllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ejemplo_db.R;
import com.example.ejemplo_db.models.ManagerDb;
import com.example.ejemplo_db.models.Users;

public class Usuarios extends AppCompatActivity {

    Button btn_insert_user;
    EditText txt_name_user;
    ManagerDb managerDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);

        btn_insert_user=findViewById(R.id.btn_insert_user);
        txt_name_user=findViewById(R.id.txt_name_user);

        Users user = new Users(txt_name_user.getText().toString());

        btn_insert_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long rest = managerDb.insertUser(user);
                if(rest > 0){
                    Toast.makeText(Usuarios.this, "Usuario agregadado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Usuarios.this, "No se pudo agregar el usuario", Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });

    }
}