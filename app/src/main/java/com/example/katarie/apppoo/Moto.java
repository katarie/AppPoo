package com.example.katarie.apppoo;

/**
 * Created by katarie on 21/09/2017.
 */

public class Moto extends Vehicle {
    private String Power;

    public Moto(String brand, String model, String power) {
        super(brand, model);
        Power = power;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + "\nPuissance : " + getPower() ;

    }
}
