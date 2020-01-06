package com.example.exportationapp;

public class Cultivo {
    private String name;
    private Double tons;

    public Cultivo (String name, Double tons) {
        this.name = name;
        this.tons = tons;
    }

    public void sumTons(Double tons) {
        this.tons = this.tons + tons;
    }

    public String getName() {
        return name;
    }

    public Double getTons() {
        return tons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTons(Double tons) {
        this.tons = tons;
    }
}
