package com.example.designpatterns.DesignPatterns;

public class User {
    public static void main(String[] args) {

        FurnitureAbstractFactory factoryFlastic = FurnitureFactory.getFactory(MaterialType.FLASTIC);
        FurnitureAbstractFactory factoryWood = FurnitureFactory.getFactory(MaterialType.WOOD);

        // Create
        Chair chair = factoryFlastic.createChair();
        chair.create(); // Create plastic chair
        Table table = factoryFlastic.createTable();
        table.create(); // Create plastic table

        //Delete
        Chair chair1 = factoryFlastic.delelteChair();
        chair1.delete();





    }
}
