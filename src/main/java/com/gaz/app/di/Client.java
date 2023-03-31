package com.gaz.app.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        String message = "Spring Boot Spring Ioc-ID-IC";
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);

        /* No se han creado Instancias de las clases, usando spring boot, que las ha creado automaticamente e
        Inyectado las dependencias entre los Objetos( solamnete el objeto de la ApplicationContext, para manejar
        y crear los bean en el Contenedor de Spring

        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();
        MessageSender messageSender = new MessageSender(smsService);
        //MessageSender messageSender = new MessageSender(emailService);
        messageSender.sendMessage(message);
         */






    }

}
