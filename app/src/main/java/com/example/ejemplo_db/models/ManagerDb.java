package com.example.ejemplo_db.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ejemplo_db.controllers.Ciudades;

public class ManagerDb {
    DbHelper dbHelper;
    SQLiteDatabase db;

    public ManagerDb(Context context){
        dbHelper = new DbHelper(context);
    }
    public void openDbWrite(){
        db = dbHelper.getWritableDatabase();
    }

    public void openDbRd(){
        db = dbHelper.getReadableDatabase();
    }

    public long insertDate(Date date){
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("name_date", date.getName_date());
        valores.put("lastname_date", date.getLastname_date());
        valores.put("location_date", date.getLocation_date());
        valores.put("id_city", date.getId_city());
        long rest = db.insert("dates",null,valores);
        return rest;
    }

    public long insertCity(City city){
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("name_city", city.getName());
        long rest = db.insert("cities", null, valores);
        return rest;
    }

    public long insertUser(Users users){
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("name_user", users.getName_user());
        long rest = db.insert("users", null, valores);
        return rest;
    }
}
