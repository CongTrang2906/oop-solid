package com.example.designpatterns.DesignPatterns;

public class WoodFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }

    @Override
    public Chair delelteChair() {
        return new WoodChair();
    }

    @Override
    public Table deleteTable() {
        return new WoodTable();
    }
}
