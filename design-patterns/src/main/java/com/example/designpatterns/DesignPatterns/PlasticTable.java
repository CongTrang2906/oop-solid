package com.example.designpatterns.DesignPatterns;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }

    @Override
    public void delete() {
        System.out.println("Delete plastic table");
    }
}
