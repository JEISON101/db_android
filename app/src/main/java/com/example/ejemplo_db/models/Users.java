package com.example.ejemplo_db.models;

public class Users {
    private int id;
    public String name_user;

    public Users(){}
    public Users(String name_user) {
        this.name_user = name_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }
}
