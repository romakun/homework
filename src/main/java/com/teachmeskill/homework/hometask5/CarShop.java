package com.teachmeskill.homework.hometask5;

public class CarShop {
    public static void main(String[] args) {
        CarService carService = new CarService();
        RandomData randomData = new RandomData();

        Car[] saloonCar = new Car[50];

        for (int i = 0; i < saloonCar.length; i++) {
            saloonCar[i] = new Car(randomData.getRandomId(), randomData.getRandomBrand(), randomData.getRandomModel(), randomData.getRandomYear(), randomData.getRandomColor(), randomData.getRandomPrice(), randomData.getRandomRegistrationNumber());
        }

        for (int i = 0; i < saloonCar.length; i++) {
            System.out.println("Car: id" + saloonCar[i].getId() + "; " + saloonCar[i].getBrand() + "; Model:" + saloonCar[i].getModel() + "; year:" + saloonCar[i].getCreationYear() + "; " + saloonCar[i].getColor() + "; $" + saloonCar[i].getPrice() + "; Registration Number: " + saloonCar[i].getRegistrationNumber());
        }

        System.out.println();
        carService.getCarBrand(saloonCar);

        System.out.println();
        carService.getCarBrandExploitation(saloonCar);

        System.out.println();
        carService.getCarYearAndPrice(saloonCar);
    }
}
