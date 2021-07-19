package com.jaxadev;

public class Human {

    String fName;

    String lName;

    int age;

    public Human(String fName, String lName, int age){

        this.age = age;
        this.fName = fName;
        this.lName = lName;

    }

    public Human(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(){

    }

    public void humanInfo(Human human){

        System.out.println("Yoshi : " + human.age + " Ismi : " + human.fName + " Familiyasi : " + human.lName);

    }

}
