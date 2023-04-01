package com.gaz.app.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Component("emailService")
@Component
public class EmailService implements IMessageService {
    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
