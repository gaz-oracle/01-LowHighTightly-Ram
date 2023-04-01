package com.gaz.app.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private IMessageService iMessageService;
    private IMessageService smsService;

    // @Autowired //Se le dice expliciatamante a El Contenedor de Spring que  use el constructor para inyectar la dependencia.
    public MessageSender( IMessageService iMessageService) {
        this.iMessageService = iMessageService;
         System.out.println("From --> Constructor based dependency Injection 1");
    }
     @Autowired
    public MessageSender(IMessageService iMessageService, IMessageService smsService ) {
        this.iMessageService = iMessageService;
        this.smsService = smsService;
        System.out.println("From --> Constructor based dependency Injection 2");
    }
    public void sendMessage(String message){
        this.iMessageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
