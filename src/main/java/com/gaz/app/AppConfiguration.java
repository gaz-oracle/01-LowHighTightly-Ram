package com.gaz.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public IVehicle car(){

        return new Car();
    }
    @Bean
    public IVehicle byke(){
        return new Byke();
    }
    @Bean
    public IVehicle cycle(){

        return new Cycle();
    }
    @Bean
    public Traveler traveler(){
        return new Traveler(car());
    }// DI: Inyecction of a Object(car) an Other Object(traveler)

}
