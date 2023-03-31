package com.gaz.app.di;

public class Client {

    public static void main(String[] args) {
        String message = "Classes with Low Tighthly...";

        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();

        MessageSender messageSender = new MessageSender(smsService);
       // MessageSender messageSender = new MessageSender(emailService);

        messageSender.sendMessage(message);



    }

}
