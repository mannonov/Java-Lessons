package com.jaxadev;

public class Human {

    private String fName;

    private String lName;

    private int age;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String fName, String lName, int age) {

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

    public Human() {

    }

    void humanInfo(Human human) {

        System.out.println("Yoshi : " + human.age + " Ismi : " + human.fName + " Familiyasi : " + human.lName);

    }

}
