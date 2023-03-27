package com.gaz.app;

import org.springframework.stereotype.Component;

@Component("cycle")
public class Cycle implements IVehicle{
    @Override
    public void move(){
        System.out.println("Cycle is moving...");
    }
}
