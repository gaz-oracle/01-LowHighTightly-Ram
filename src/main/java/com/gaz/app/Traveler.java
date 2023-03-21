package com.gaz.app;

public class Traveler {
    //Create a intance inside Constructor:

    Car car = null;

    public Traveler(){
        this.car = new Car();
    }

    public void starJourney(){
        this.car.move();
    }
}
