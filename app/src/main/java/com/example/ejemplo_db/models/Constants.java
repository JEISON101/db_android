package com.example.ejemplo_db.models;

public class Constants {
    public static String NAME_DB = "Db_test";
    public static int VERSION_DB = 6;
    public static String DROP_CITIES = "drop table if exists cities";
    public static  String CREATE_CITIES = "create table cities (id integer auto_increment primary key, name_city varchar)";
    public static  String CREATE_USERS = "create table users ( id integer auto_increment primary key, name_user varchar)";
    public static  String CREATE_DATES = "create table dates (id integer auto_increment primary key, name_date varchar, lastname_date varchar,direction_date varchar,id_city integer)";
}

