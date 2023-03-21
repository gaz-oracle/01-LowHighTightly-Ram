package com.gaz.app;

public class Traveler {
    //Create a intance inside Constructor:

    public IVehicle vehicle;

    public Traveler(IVehicle vehicle){
        this.vehicle = vehicle;
    }

    public void starJourney(){
        this.vehicle.move();
    }
}
