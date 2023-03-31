package com.gaz.app.di;

public class MessageSender {

    private IMessageService iMessageService;

    public MessageSender(IMessageService iMessageService) {
        this.iMessageService = iMessageService;
    }

    public void sendMessage_sender(String message){
        this.iMessageService.sendMessage(message);
    }
}
