package com.teachmeskill.homework.hometask6;

import java.util.Objects;

public class Air extends Transport{

    private int wingspan;

    private int minimumRunwayLength;

    public Air(){

    }

    public Air(int power, int speed, double weight, String mark, int wingspan, int minimumRunwayLength) {
        super(power, speed, weight, mark);
        this.wingspan = wingspan;
        this.minimumRunwayLength = minimumRunwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinimumRunwayLength() {
        return minimumRunwayLength;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setMinimumRunwayLength(int minimumRunwayLength) {
        this.minimumRunwayLength = minimumRunwayLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Air)) return false;
        if (!super.equals(o)) return false;
        Air air = (Air) o;
        return wingspan == air.wingspan &&
                minimumRunwayLength == air.minimumRunwayLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wingspan, minimumRunwayLength);
    }

    @Override
    public String toString() {
        return "Air{" +
                "wingspan=" + wingspan +
                ", minimumRunwayLength=" + minimumRunwayLength +
                '}';
    }
}

