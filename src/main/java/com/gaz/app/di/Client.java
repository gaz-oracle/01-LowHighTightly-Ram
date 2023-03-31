package com.gaz.app.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        String message = "Spring Boot Spring Ioc-ID-IC";
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);
        /*
         @Primary indica que se debe dar preferencia a un bean cuando varios candidatos están calificados
         para autoconectar una dependencia de un solo valor.

         @Qualifier indica que un bean específico debe conectarse automáticamente cuando hay varios candidatos

         Por lo tanto, puede encontrar que @Qualifier y @Primary le dicen a Spring que use el bean específico
         cuando hay varios candidatos están calificados para la conexión automática. Pero @Qualifier es más específico
         y tiene alta prioridad. Entonces, cuando se encuentran @Qualifier y @Primary, se ignorará @Primary.
         */
    }
}
