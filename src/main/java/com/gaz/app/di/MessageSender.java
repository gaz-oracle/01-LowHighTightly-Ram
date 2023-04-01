package com.gaz.app.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private IMessageService iMessageService;
    private IMessageService ismsService;

   @Autowired
    public void setiMessageService(@Qualifier ("emailService") IMessageService iMessageService) {
        this.iMessageService = iMessageService;
        System.out.println("ID FROM Setter 1  -> emailService!");
    }
    @Autowired
    public void setSmsService(@Qualifier ("sMSService")IMessageService smsService) {
        this.ismsService = smsService;
        System.out.println("ID FROM Setter 2  -> sMSService!");
    }
    public void sendMessage(String message){
        this.iMessageService.sendMessage(message);
        this.ismsService.sendMessage(message);
    }
}
