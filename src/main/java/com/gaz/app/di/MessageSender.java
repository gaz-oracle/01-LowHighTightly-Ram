package com.gaz.app.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component: Anotacion de spring que crea los objetos de la clase en cuestion,
// Yadministra su ciclo de vida
// @Autowire : le dice a Spring que inyecte los objetos de manera automática,
//  a otros objetos de otras clases,en este caso por medio del CONTRUCTUCTOR.
@Component
public class MessageSender {

    private IMessageService iMessageService;

     @Autowired
    public MessageSender(@Qualifier("emailService") IMessageService iMessageService) {
        this.iMessageService = iMessageService;
    }

    public void sendMessage(String message){

        this.iMessageService.sendMessage(message);
    }
}
