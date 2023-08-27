package com.example.designpatterns.DesignPatterns;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }

    @Override
    public void delete() {
        System.out.println("Delete wood table");
    }
}