package com.example.designpatterns.SOLID.O;

//Open/Closed Principle : han che chinh sua ben trong 1 class hay mot module co san, thay vao do hay mo rong chung
public class Student {
    private String studentType;
    // class student co function tinh hoc phi
    // trong do:
        // sinh vien binh thuong dong 100% hoc phi
        // sinh vien tai nang duoc giam 20% hoc phi
        // du hoc sinh phai tang them 30% hoc phi

    // Vi pham nguyen tac Open/Closed Principle, khi can them nhiu loai sinh vien thi phai edit code
    public double studentFeesWrong(int creditNum, double creditPrice){
        double fees =  creditPrice * creditNum;
        if (studentType.equals("talent student")){
          return   fees * 0.8;
        }else if(studentType.equals("overseas student")){
            return fees * 1.2;
        }else {
            return fees;
        }
    }

    // Ap dung nguyen tac Open/Closed Principle
    public double studentFees(int creditNum, double creditPrice){
        return creditPrice * creditNum;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }
}
