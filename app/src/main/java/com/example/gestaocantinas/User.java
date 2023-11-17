package com.example.gestaocantinas;

public class User {
    private int id;
    private String name;
    private String identificationNumber;
    private String role;

    public User(int id, String name, String identificationNumber, String role) {
        this.id = id;
        this.name = name;
        this.identificationNumber = identificationNumber;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
