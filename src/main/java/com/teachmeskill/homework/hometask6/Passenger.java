package com.teachmeskill.homework.hometask6;

import java.util.Objects;

public class Passenger extends Ground {

    private String bodyType;

    private int passengersCount;

    public Passenger() {
    }

    public Passenger(int power, int speed, double weight, String mark, int countWheel, int fuelConsumption, String bodyType, int passengersCount) {
        super(power, speed, weight, mark, countWheel, fuelConsumption);
        this.bodyType = bodyType;
        this.passengersCount = passengersCount;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        if (!super.equals(o)) return false;
        Passenger passenger = (Passenger) o;
        return passengersCount == passenger.passengersCount &&
                bodyType.equals(passenger.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType, passengersCount);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "bodyType='" + bodyType + '\'' +
                ", passengersCount=" + passengersCount +
                '}';
    }

    public String getInfo() {
        double powerKilowatts = getPower() * 0.74;
        return "Мощность средтва = " + getPower() + "; Мощность средвта в киловаттах = " + powerKilowatts + "; Скорость средства = " + getSpeed() + "; Масса средства = " + getWeight() + "; Количество колес = " + getCountWheel() + "; Расход топлива = " + getFuelConsumption() + "; Тип кузова = " + bodyType + "; Количество пасажиров = " + passengersCount;
    }

    public void getMaxDistance(double time) {
        double maxDistance = time * getSpeed();
        double usedFuel = getUsedFuel(maxDistance);
        System.out.println("За время " + time + "ч, автомобиль " + getMark() + " двигаясь с максимальной скоростью " + getSpeed() + "км/ч проедет " + maxDistance + " км  и израсходует " + usedFuel + " литров топлива.");
    }

    private double getUsedFuel(double distance) {
        return (distance / 100) * getFuelConsumption();
    }
}
