package com.jaxadev;

public class SportCar extends Car{

    public SportCar(int otKuchi) {
        super(otKuchi);
    }

    @Override
    void carSound() {
        System.out.println("Juda shovqinli ovoz");
    }
}
