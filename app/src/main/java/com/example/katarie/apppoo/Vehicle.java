package com.example.katarie.apppoo;

/**
 * Created by katarie on 21/09/2017.
 */

public class Vehicle {
    private String brand;
    private String model;


    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription(){
        getBrand();
        getModel();
        return String.format("Marque : %1$s \nModele : %2$s", brand, model);

    }
}
