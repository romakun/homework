package com.teachmeskill.homework.hometask6;

import java.util.Objects;

public class Ground extends Transport {

    private int countWheel;

    private int fuelConsumption;

    public Ground() {

    }

    public Ground(int power, int speed, double weight, String mark, int countWheel, int fuelConsumption) {
        super(power, speed, weight, mark);
        this.countWheel = countWheel;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountWheel() {
        return countWheel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setCountWheel(int countWheel) {
        this.countWheel = countWheel;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ground)) return false;
        if (!super.equals(o)) return false;
        Ground ground = (Ground) o;
        return countWheel == ground.countWheel &&
                fuelConsumption == ground.fuelConsumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countWheel, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Ground{" +
                "countWheel=" + countWheel +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
