package com.gaz1.app2.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student {
    /**
     * La Clase Student DEPENDE de la clase Address.
     */

    private Address address;

    /**
     *
     **/
    public Student(Address address) {
        this.address = address;
        address.print();
    }

    public void print() {
        System.out.println("Student class method called...");
    }
}

class Address {

    public void print() {
        System.out.println("Address class method called...");
    }
}

@Configuration
class AppConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Student student() {
        return new Student(address());
    }
    /**
     * Para crear un @Bean de tipo Addres , se hace:
     * A. Crear un metodo de la clase Address publico
     * B. Que devuelve la creacion de un objeto (@Bean) de la clase Address.
     * C. Se le informa al Contenedor de Spring (IoC), que adminsitre el Objeto de la clase Address,para lo cual se
     *    utiliza la anotacción @Bean
     * D. Por lo tanto este metodo Address devuelve un objeto Address de la clase Address.
     *   - Aplica lo mismo para la clase Student.
     */
}

public class BeansAnnotation {
    /**
     * RECUPERACION DE LOS @BEANS DEL CONTENEDOR DE SPRING
     */

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = applicationContext.getBean(Student.class);
        student.print();


    }
}
