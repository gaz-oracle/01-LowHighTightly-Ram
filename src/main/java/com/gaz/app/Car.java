package com.gaz.app;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements IVehicle{
    @Override
    public void move(){
        System.out.println("Car is moving...");
    }
}
