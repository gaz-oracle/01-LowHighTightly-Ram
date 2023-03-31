package com.gaz.app.di;

public class MessageSender {

    //private  SMSService smsService;
    private EmailService emailService;

    public MessageSender(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendMessage_sender(String message){
        this.emailService.sendMessage_Email(message);
    }
}
