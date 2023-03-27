package com.gaz.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {
    //Create an intance inside Constructor:

    public IVehicle vehicle;
    @Autowired
    public Traveler(@Qualifier("byke") IVehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public void starJourney()
    {
        this.vehicle.move();
    }
}
