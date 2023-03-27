package com.gaz.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("byke")
@Primary // Instancia o @Bens primario en el contexto de Spring
public class Byke implements IVehicle{
    @Override
    public void move(){
        System.out.println("Bike is moving...@Bean primario ..ej");
    }
}
