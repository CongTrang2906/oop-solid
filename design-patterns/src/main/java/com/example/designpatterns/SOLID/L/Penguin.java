package com.example.designpatterns.SOLID.L;

public class Penguin implements Bird{
    @Override
    public void fly() throws Exception {
        throw new Exception("Penguin No Fly");
    }
}
