package com.gaz.app.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


class Student {

    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student class method called...");
        address.print();
    }

    private void init() {
        System.out.println("Initialization logic");
    }

    private void destroy() {
        System.out.println("Destruction logic");
    }
}

class Address {

    public void print() {
        System.out.println("Address class method called...");
    }
}

@Configuration
class AppConfig {

    @Bean(name = "@Bean Address")
    public Address address() {
        return new Address();
    }

    @Bean(name = "@Bean Student", initMethod = "init", destroyMethod = "destroy")
    public Student student() {
        return new Student(address());
    }

}

public class BeanAnnotation {

    public static void main(String[] args) {

        try(var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class) ) {

            Student student = (Student) applicationContext.getBean("@Bean Student");
            String [] beanNames = applicationContext.getBeanDefinitionNames();
            for (String i:beanNames) {
                System.out.println(i);
            }
            student.print();
        }
       // https://www.geeksforgeeks.org/spring-init-and-destroy-methods-with-example/
    }
}

