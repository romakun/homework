package com.teachmeskill.homework.hometask5;

public class CarShop {
    public static void main(String[] args) {
        Car[] saloonСar = new Car[50];

        for (int i = 0; i < saloonСar.length; i++) {
            saloonСar[i] = new Car(RandomData.getRandomId(), RandomData.getRandomBrand(), RandomData.getRandomModel(), RandomData.getRandomYear(), RandomData.getRandomColor(), RandomData.getRandomPrice(), RandomData.getRandomRegistrationNumber());
        }

        for (int i = 0; i < saloonСar.length; i++) {
            System.out.println("Car: id" + saloonСar[i].getId() + "; " + saloonСar[i].getBrand() + "; Model:" + saloonСar[i].getModel() + "; year:" + saloonСar[i].getCreationYear() + "; " + saloonСar[i].getColor() + "; $" + saloonСar[i].getPrice() + "; Registration Number: " + saloonСar[i].getRegistrationNumber());
        }

        System.out.println();
        CarService.getCarBrand(saloonСar);

        System.out.println();
        CarService.getCarBrandExploitation(saloonСar);

        System.out.println();
        CarService.getCarYearAndPrice(saloonСar);
    }
}
