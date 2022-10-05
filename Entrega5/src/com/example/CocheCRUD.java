package com.example;

import java.util.ArrayList;

public interface CocheCRUD {

    void save();

    ArrayList<String> findAll();

    void delete(String coche);
}
