package com.gaz.app.javabasedconfiguaration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {


    public IVehicle vehicle;
    @Autowired
    public Traveler( IVehicle vehicle) // Se va a inyectar el @bean primario.
    {
        this.vehicle = vehicle;
    }

    public void starJourney()
    {
        this.vehicle.move();
    }
}
