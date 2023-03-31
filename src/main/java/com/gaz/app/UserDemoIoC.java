package com.gaz.app;

public class UserDemoIoC { //  <--DEPENDENDIENTE :Que depende de otras personas para desenvolverse en muchas actividades cotidiana

    private Address address;// <--DEPENDENCIA:Situación de la persona o cosa que depende de otras

    public UserDemoIoC(){
        address = new Address();
    }

    public void getAddress(){
        address.getAddress();
    }

    class Address{ // LA CLASE Address ES BASICAMENTE UNA DEPENDENCIA PARA UN OBJETO DE LA CLASE user.

        public void getAddress(){
            // Logic goes here.
        }
    }
}
