package com.example.katarie.apppoo;

/**
 * Created by katarie on 21/09/2017.
 */

public class Car extends Vehicle {

    private String kilometers;

    public Car(String brand, String model, String kilometers) {
        super(brand, model);
        this.kilometers = kilometers;
    }

    public String getKilometers() {
        return kilometers;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "\nNombre de kilometres : " + getKilometers() ;

    }
}
