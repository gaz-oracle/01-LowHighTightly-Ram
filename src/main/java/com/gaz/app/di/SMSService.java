package com.gaz.app.di;

public class SMSService implements IMessageService {

    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
