package com.example.designpatterns.DesignPatterns;

public class PlasticChair implements Chair{
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }

    @Override
    public void delete() {
        System.out.println("Delete plastic chair");
    }
}
