package com.gaz.app.di;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements IMessageService {

    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
