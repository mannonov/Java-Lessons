package com.jaxadev;

public class Cobalt extends Car{

    String salon;

    public Cobalt(String carModel, int otKuchi, String carColor, String salon) {
        super(carModel, otKuchi, carColor);
        this.salon = salon;
    }


    @Override
    void carSound() {
        System.out.println("Girrr Girrr");
    }
}
