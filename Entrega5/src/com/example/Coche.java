package com.example;

public class Coche {

    //1. atributos
    String model;
    String iD;
    boolean statusActive;
    int year;

    //2. Constructor

    public Coche(){}

    public Coche(String model, String iD, boolean statusActive, int year){
        this.model = model;
        this.iD = iD;
        this.statusActive = statusActive;
        this.year = year;
    }

    //3. Metodos


    @Override
    public String toString() {
        return "Coche{" +
                "model='" + model + '\'' +
                ", iD='" + iD + '\'' +
                ", statusActive=" + statusActive +
                ", year=" + year +
                '}';
    }
}
