package com.gaz.app.di;

public class MessageSender {

    private  SMSService smsService;

    public MessageSender(SMSService smsService) {
        this.smsService = smsService;
    }

    public void sendMessage_sender(String message){
        this.smsService.sendMessage_service(message);
    }
}
