package com.example.ejemplo_db.models;

public class Date {
    private int id;
    public String name_date;
    public  String lastname_date;
    public  String location_date;
    public int id_city;

    public Date(){}

    public Date(String name_date, String lastname_date, String location_date, int id_city) {
        this.name_date = name_date;
        this.lastname_date = lastname_date;
        this.location_date = location_date;
        this.id_city = id_city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_date() {
        return name_date;
    }

    public void setName_date(String name_date) {
        this.name_date = name_date;
    }

    public String getLastname_date() {
        return lastname_date;
    }

    public void setLastname_date(String lastname_date) {
        this.lastname_date = lastname_date;
    }

    public String getLocation_date() {
        return location_date;
    }

    public void setLocation_date(String location_date) {
        this.location_date = location_date;
    }

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }
}
