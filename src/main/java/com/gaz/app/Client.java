package com.gaz.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    //new branch Dev4
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Car car = applicationContext.getBean(Car.class);
        Byke byke =  applicationContext.getBean(Byke.class);
        Cycle cycle = applicationContext.getBean(Cycle.class);
        Traveler traveler = applicationContext.getBean(Traveler.class);
        // Retrieve Spring Beans from Spring IOC Container
        car.move();
        byke.move();
        cycle.move();
        traveler.starJourney();
    }
}
