package com.jaxadev;

public class Cobalt extends Car{

    String salon;

    @Override
    void carSound() {
        super.carSound();
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

    }
}
