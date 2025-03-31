package com.example.ejemplo_db.models;

public class Constants {
    public static String NAME_DB = "Db_test";
    public static int VERSION_DB = 19;
    public static  String CREATE_CITIES = "create table cities (id integer primary key autoincrement, name_city varchar)";
    public static  String CREATE_USERS = "create table users ( id integer primary key autoincrement, name_user varchar)";
    public static  String CREATE_DATES = "create table dates (id integer primary key autoincrement, name_date varchar, lastname_date varchar,direction_date varchar,id_city integer, foreign key (id_city) references cities(id))";
}

