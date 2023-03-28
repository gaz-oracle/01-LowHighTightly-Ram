package com.gaz.app;

public class UserDemoIoC {

    private Address address;

    public UserDemoIoC(){
        address = new Address();
    }

    public void getAddress(){
        address.getAddress();
    }

    class Address{

        public void getAddress(){
            // Logic goes here.
        }
    }
}
