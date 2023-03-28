package com.gaz.app.javabasedconfiguaration;

import com.gaz.app.configuration.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    //new branch Dev5 - 15. Anotaciones estereotipadas
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Car car = applicationContext.getBean(Car.class);
        Byke byke =  applicationContext.getBean(Byke.class);
        Cycle cycle = applicationContext.getBean(Cycle.class);
        Traveler traveler = applicationContext.getBean(Traveler.class);

        car.move();
        byke.move();
        cycle.move();
        traveler.starJourney();
    }
}
