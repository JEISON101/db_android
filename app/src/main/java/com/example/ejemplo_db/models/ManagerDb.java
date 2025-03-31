package com.example.ejemplo_db.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

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
        db=dbHelper.getReadableDatabase();
    }

    public long insertData(){
        openDbWrite();
        ContentValues valores = new ContentValues();
        valores.put("id", 1);
        valores.put("name_date", "Pocoyó");
        valores.put("lastname_date", "Zuares");
        valores.put("direction_date","cra 9 12n34");
        valores.put("id_city", 1);

        long result = db.insert("dates",null,valores);
        return result;
    }
}
