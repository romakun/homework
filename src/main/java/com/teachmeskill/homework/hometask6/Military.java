package com.teachmeskill.homework.hometask6;

import java.util.Objects;

public class Military extends Air {

    private int rocketCount;

    private boolean bailoutSystem;

    public Military() {
    }

    public Military(int power, int speed, double weight, String mark, int wingspan, int minimumRunwayLength, int rocketCount, boolean bailoutSystem) {
        super(power, speed, weight, mark, wingspan, minimumRunwayLength);
        this.rocketCount = rocketCount;
        this.bailoutSystem = bailoutSystem;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public boolean isBailoutSystem() {
        return bailoutSystem;
    }

    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    public void setBailoutSystem(boolean bailoutSystem) {
        this.bailoutSystem = bailoutSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Military)) return false;
        if (!super.equals(o)) return false;
        Military military = (Military) o;
        return rocketCount == military.rocketCount &&
                bailoutSystem == military.bailoutSystem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rocketCount, bailoutSystem);
    }

    @Override
    public String toString() {
        return "Military{" +
                "rocketCount=" + rocketCount +
                ", bailoutSystem=" + bailoutSystem +
                '}';
    }

    public String getInfo() {
        double powerKilowatts = getPower() * 0.74;
        return "Мощность средтва = " + getPower() + "; Мощность средвта в киловаттах = " + powerKilowatts + "; Скорость средства = " + getSpeed() + "; Масса средства = " + getWeight() + "; Размах крыльев = " + getWingspan() + ";  Минимальная длина взлётно-посадочной полосы для взлёта = " + getMinimumRunwayLength() + "; Количество ракет = " + rocketCount + "; Наличие системы катапультирования = " + bailoutSystem;
    }

    public void takeShot(int shotCount) {
        for (int i = 0; i < shotCount; i++) {
            if (rocketCount > 0) {
                System.out.println("Ракета пошла");
                rocketCount--;
            } else {
                System.out.println("Боеприпасы отсутствуют");
                i = shotCount;
            }
        }
    }

    public void checkBailoutSystem() {
        if (isBailoutSystem()) {
            System.out.println("Катапультация прошла успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
