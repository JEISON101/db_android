package com.example.ejemplo_db.models;

public class City {
    private int id;
    public String name;
    public City(){}
    public City(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
