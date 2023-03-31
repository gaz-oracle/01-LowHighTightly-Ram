package com.gaz.app.di;

import org.springframework.stereotype.Component;

@Component
//@Component("emailService")
public class EmailService implements IMessageService {

    @Override
    public void sendMessage(String message){

        System.out.println(message);
    }
}
