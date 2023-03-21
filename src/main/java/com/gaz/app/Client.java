package com.gaz.app;

public class Client {
    public static void main(String[] args) {
        IVehicle vehicle1 = new Car();
        IVehicle vehicle2 = new Byke();
        IVehicle vehicle3 = new Cycle();

        vehicle1.move();
        vehicle2.move();
        vehicle3.move();
        System.out.println("*********************");

        Traveler traveler = new Traveler(vehicle1);
        traveler.starJourney();

    }

}
