package com.example.designpatterns.SOLID.S;

public class SingleResponsibility {  //Example this is class "Coder"
    // Mỗi class chỉ chịu trách nhiệm về một nhiệm vụ cụ thể nào đó
    // Không có nhiều hơn "1" lý do để chỉnh sửa class

    //function coding
    public void coding(){
        System.out.println("I'm coding!!!");
    }
    //function stop code
    public void codeStop(){
        System.out.println("Stop code!!!");
    }

    //function find user
    public String findUser(String user){
        return user;
    }
    //function find userName
    public String findUserName(String userName){
        return userName;
    }


    // => Class nay vi pham nguyen tac thu nhat trong SOILD "SingleResponsibility"
    // => cac function findUser(), findUserName() tren nguyen ly hoat dong khong  sai, nhung no can thiet ke tai class Fish

}
