package com.gaz.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


class Student {
    /**
     * La Clase Student DEPENDE de la clase Address.
     */

    private Address address;
    /**   Comprobando si la Dependencia Address se inyecta al Objecto Student...
     *    Se llama a los Metodos de la clase Address dentro del metodo print() --> **/
    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student class method called...");
        /** SE LLAMA AL OBJETO (O SE INYECTA EL OBJETO address), PARA QUE EJECTE EL METODO .print() --> **/
        address.print();
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
        return new Student(address()); /** <-- INYECCION DE OBJETO A OTRO OBJETO A TRAVES DE SPIRNG IoC **/
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

public class BeanAnnotation {
    /**
     * RECUPERACION DE LOS @BEANS DEL CONTENEDOR DE SPRING
     */

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = applicationContext.getBean(Student.class);
        student.print();

        /**
         * DE FORMA PREDETERMINADA EL CONTENEDOR DE SPRING LES DA UN NOMBRE POR DEFAULT A LOS BEANS IGUAL QUE EL NOMBRE DE LOS METODOS
         * VAMOS A IMPRIMIR EL NOMBRE DE LOS METODOS: **/

        System.out.println("********** NAMES BEANS ***************");
        String [] beanNames = applicationContext.getBeanDefinitionNames();
        for (String i:beanNames) {
            System.out.println(i);
        }
        /**
         * SE PUEDE CAMBIAR EL NOMBRE DEL BEAN **/

    }
}

