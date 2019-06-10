package com.company;

public class Accord extends Sedan {
    String year;
    Engine engine;
    Transmission transmission;

    public Accord(String make, String model, int milesTraveled, int numDoors, boolean poweredWindows, int years, Engine engine, Transmission trans) {
        super(make, model, milesTraveled, numDoors, poweredWindows);
        this.engine= engine;
        this.transmission= trans;
    }
}
