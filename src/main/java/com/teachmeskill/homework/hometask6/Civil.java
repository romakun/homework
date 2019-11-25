package com.teachmeskill.homework.hometask6;

import java.util.Objects;

public class Civil extends Air {

    private int passengersCount;

    private boolean businessClass;

    public Civil() {
    }

    public Civil(int power, int speed, double weight, String mark, int wingspan, int minimumRunwayLength, int passengersCount, boolean businessClass) {
        super(power, speed, weight, mark, wingspan, minimumRunwayLength);
        this.passengersCount = passengersCount;
        this.businessClass = businessClass;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Civil)) return false;
        if (!super.equals(o)) return false;
        Civil civil = (Civil) o;
        return passengersCount == civil.passengersCount &&
                businessClass == civil.businessClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCount, businessClass);
    }

    @Override
    public String toString() {
        return "Civil{" +
                "passengersCount=" + passengersCount +
                ", businessClass=" + businessClass +
                '}';
    }

    public String getInfo() {
        double powerKilowatts = getPower() * 0.74;
        return "Мощность средтва = " + getPower() + "; Мощность средвта в киловаттах = " + powerKilowatts + "; Скорость средства = " + getSpeed() + "; Масса средства = " + getWeight() + "; Размах крыльев = " + getWingspan() + ";  Минимальная длина взлётно-посадочной полосы для взлёта = " + getMinimumRunwayLength() + "; Количество пассажиров = " + passengersCount + "; Наличие бизнесс класса = " + businessClass;
    }

    public void checkPassengersCount(int passengersCount) {
        if (passengersCount <= getPassengersCount()) {
            System.out.println("Самолет заполнен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
