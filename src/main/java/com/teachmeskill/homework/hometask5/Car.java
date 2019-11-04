package com.teachmeskill.homework.hometask5;

public class Car {

    private int id;

    private String brand;

    private String model;

    private int creationYear;

    private String color;

    private int price;

    private int registrationNumber;

    public Car() {
    }

    public Car(int id, String brand, String model, int creationYear, String color, int price, int registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.creationYear = creationYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
}
