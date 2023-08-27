package com.example.designpatterns.SOLID.O;

public class OverseasStudent extends Student{
    @Override
    public double studentFeesWrong(int creditNum,double creditPrice) {
        return super.studentFees(creditNum,creditPrice) * 1.2;
    }
}
