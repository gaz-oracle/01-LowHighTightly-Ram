package com.gaz.app;

public class Car implements IVehicle{
    @Override
    public void move(){
        System.out.println("Car is moving...");
    }
}
