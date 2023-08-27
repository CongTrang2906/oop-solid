package com.example.designpatterns.SOLID.O;

public class TalentedStudent extends Student{
    // sinh vien tai nang duoc giam phi 20%
    @Override
    public double studentFees(int creditNum,double creditPrice) {
        return super.studentFees(creditNum,creditPrice) * 0.8;
    }
}
