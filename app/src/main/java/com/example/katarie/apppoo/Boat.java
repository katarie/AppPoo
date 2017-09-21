package com.example.katarie.apppoo;

/**
 * Created by katarie on 21/09/2017.
 */

public class Boat extends Vehicle{
    private String hours;

    public Boat(String brand, String model, String hours) {
        super(brand, model);
        this.hours = hours;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + "\nNombre d'heure : " + getHours() ;

    }
}
