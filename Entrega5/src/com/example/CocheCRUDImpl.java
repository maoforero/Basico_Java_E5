package com.example;

import java.util.ArrayList;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Guardando: ");
    }

    @Override
    public ArrayList<String> findAll() {
        ArrayList<String> listAutos = new ArrayList<>();
        listAutos.add("Coche1");
        listAutos.add("Coche2");
        listAutos.add("Coche3");

        System.out.println("Listado General: " + listAutos);
        return listAutos;
    }

    @Override
    public void delete(String coche) {
        System.out.println("Borrando: " + coche);
    }
}
