package com.gaz.app;

import org.springframework.stereotype.Component;

@Component("byke")
public class Byke implements IVehicle{
    @Override
    public void move(){
        System.out.println("Bike is moving...");
    }
}
