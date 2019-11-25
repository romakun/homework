package com.teachmeskill.homework.hometask6;

import java.util.Objects;

public class Transport {

    private int power;

    private int speed;

    private double weight;

    private String mark;

    public Transport() {

    }

    public Transport(int power, int speed, double weight, String mark) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public String getMark() {
        return mark;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return power == transport.power &&
                speed == transport.speed &&
                Double.compare(transport.weight, weight) == 0 &&
                mark.equals(transport.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, speed, weight, mark);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", speed=" + speed +
                ", weight=" + weight +
                ", mark='" + mark + '\'' +
                '}';
    }
}
