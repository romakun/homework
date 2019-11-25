package com.teachmeskill.homework.hometask6;

import java.util.Objects;

public class Freight extends Ground {

    private int carryingCapacity;

    public Freight() {
    }

    public Freight(int power, int speed, double weight, String mark, int countWheel, int fuelConsumption, int carryingCapacity) {
        super(power, speed, weight, mark, countWheel, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Freight)) return false;
        if (!super.equals(o)) return false;
        Freight freight = (Freight) o;
        return carryingCapacity == freight.carryingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carryingCapacity);
    }

    @Override
    public String toString() {
        return "Freight{" +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }

    public String getInfo() {
        double powerKilowatts = getPower() * 0.74;
        return "Мощность средтва = " + getPower() + "; Мощность средвта в киловаттах = " + powerKilowatts + "; Скорость средства = " + getSpeed() + "; Масса средства = " + getWeight() + "; Количество колес = " + getCountWheel() + "; Расход топлива = " + getFuelConsumption() + "; Грузоподъемность(т) = " + carryingCapacity;
    }

    public void checkCarryingCapacity(int cargo) {
        if (cargo <= getCarryingCapacity()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
