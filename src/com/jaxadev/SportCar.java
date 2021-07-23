package com.jaxadev;

public class SportCar extends Car{

    @Override
    void carSound() {
        System.out.println("Juda shovqinli ovoz");
    }

    @Override
    void mashinaYurdi() {
        System.out.println("Ha yurdi");
    }

    @Override
    void mashinaBalonlariNechta() {
        System.out.println("4 ta ");
    }

    @Override
    void tezlik(int speed) {
        System.out.println("Mashina tezligi " + speed);
    }
}
