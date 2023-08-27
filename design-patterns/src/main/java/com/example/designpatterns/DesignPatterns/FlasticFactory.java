package com.example.designpatterns.DesignPatterns;
public class FlasticFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }
    @Override
    public Table createTable() {
        return new PlasticTable();
    }
    @Override
    public Chair delelteChair() {
        return new PlasticChair();
    }
    @Override
    public Table deleteTable() {
        return new PlasticTable();
    }
}
