package com.gaz.app.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Component("emailService")
@Component
@Primary
public class EmailService implements IMessageService {

    @Override
    public void sendMessage(String message){

        System.out.println(message);

        /*
         @Primary indica que se debe dar preferencia a un bean cuando varios candidatos están calificados
         para autoconectar una dependencia de un solo valor.

         @Qualifier indica que un bean específico debe conectarse automáticamente cuando hay varios candidatos

         Por lo tanto, puede encontrar que @Qualifier y @Primary le dicen a Spring que use el bean específico
         cuando hay varios candidatos están calificados para la conexión automática. Pero @Qualifier es más específico
         y tiene alta prioridad. Entonces, cuando se encuentran @Qualifier y @Primary, se ignorará @Primary.
         */
    }
}
