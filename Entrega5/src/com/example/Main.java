package com.example;

public class Main {

    static CocheCRUD coche = new CocheCRUDImpl();

    public static void main(String[] args) {

        coche.save();
        coche.findAll();
        coche.delete("coche1");

    }
}
