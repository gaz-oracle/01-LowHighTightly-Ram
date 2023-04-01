package com.gaz.app.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    /**
     * 1. No requiere crear Construtores y Metodos Setter.
     * 2. Spring NO recomienda este tipo de Inyeccion.
     *
     */
    @Autowired
    @Qualifier("emailService")
    private IMessageService iMessageService;

    @Autowired
    @Qualifier("sMSService")
    private IMessageService ismsService;

    public void sendMessage(String message){
        this.iMessageService.sendMessage(message);
        this.ismsService.sendMessage(message);
    }
}
