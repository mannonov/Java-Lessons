package com.jaxadev;

abstract class Car {

    String carModel;

    int otKuchi;

    String carColor;

    Bus bus = new Bus();

    void carSound(){

        System.out.println("G'inggg");

    }

    abstract void mashinaYurdi();

    abstract void mashinaBalonlariNechta();

    abstract void tezlik(int speed);

    static class Bus{

        String busModel;

    }

}
