package com.teachmeskill.homework.hometask6;

public class TransportApp {
    public static void main(String[] args) {
        Passenger passengerGroundTransport = new Passenger(500, 150, 333.0, "BMW", 4, 56, "Кроссовер", 100);
        Freight freightGroundTransport = new Freight(1000, 200, 500, "Audi", 6, 120, 2000);
        Civil civilAirTransport = new Civil(3000, 400, 3000, "Boeing", 20, 1000, 200, true);
        Military militaryAirTransport = new Military(2000, 1500, 1700, "Stealth", 15, 500, 4, false);

        System.out.println(passengerGroundTransport.getInfo());
        passengerGroundTransport.getMaxDistance(10);

        System.out.println(freightGroundTransport.getInfo());
        freightGroundTransport.checkCarryingCapacity(1000);

        System.out.println(civilAirTransport.getInfo());
        civilAirTransport.checkPassengersCount(210);

        System.out.println(militaryAirTransport.getInfo());
        militaryAirTransport.takeShot(50);
        militaryAirTransport.checkBailoutSystem();

    }
}
