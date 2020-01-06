package com.example.exportationapp;

public class Cultivo {
    private String name;
    private Double hectares;

    public Cultivo (String name, Double hectares) {
        this.name = name;
        this.hectares = hectares;
    }

    public void sumHectares(Double hectares) {
        this.hectares = this.hectares + hectares;
    }

    public String getName() {
        return name;
    }

    public Double getHectares() {
        return hectares;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHectares(Double hectares) {
        this.hectares = hectares;
    }
}
