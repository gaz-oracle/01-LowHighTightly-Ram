package com.gaz.app.di;

public class Client {

    public static void main(String[] args) {
        String message = "This a message...";

        SMSService smsService = new SMSService();
        MessageSender messageSender = new MessageSender(smsService);

        messageSender.sendMessage_sender(message);

    }

}
