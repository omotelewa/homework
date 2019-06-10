package com.company;

public class Sedan extends Car {
    int numDoors;
    boolean poweredWindows;
    public Sedan(String make, String model, int milesTraveled,int numDoors, boolean poweredWindows) {
        super(make, model, milesTraveled);
        this.numDoors= numDoors;
        this.poweredWindows=poweredWindows;
    }
}
