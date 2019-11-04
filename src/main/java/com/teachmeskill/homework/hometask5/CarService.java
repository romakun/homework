package com.teachmeskill.homework.hometask5;

import java.util.Scanner;

public class CarService {
    static Scanner in = new Scanner(System.in);

    public static void getCarBrand(Car[] saloonCar) {
        System.out.print("Выберите желаемую марку автомобиля: BMW, Subaru, Mercedes, Lamborghini, Citroen, Peugeot, Reno, Audi, Ferrari, Escalate: ");
        String carBrand = in.nextLine();
        for (int i = 0; i < saloonCar.length; i++) {
            if (saloonCar[i].getBrand().equals(carBrand)) {
                System.out.println("Car: id" + saloonCar[i].getId() + "; " + saloonCar[i].getBrand() + "; Model:" + saloonCar[i].getModel() + "; year:" + saloonCar[i].getCreationYear() + "; " + saloonCar[i].getColor() + "; $" + saloonCar[i].getPrice() + "; Registration Number: " + saloonCar[i].getRegistrationNumber());
            }
        }
    }

    public static void getCarBrandExploitation(Car[] saloonCar) {
        System.out.print("Выберите желаемую марку автомобиля: BMW, Subaru, Mercedes, Lamborghini, Citroen, Peugeot, Reno, Audi, Ferrari, Escalate: ");
        String carBrand = in.nextLine();
        System.out.println();
        System.out.print("Выберите срок эксплуатации: ");
        int exploitationYears = in.nextInt();

        for (int i = 0; i < saloonCar.length; i++) {
            if (saloonCar[i].getBrand().equals(carBrand) && 2019 - saloonCar[i].getCreationYear() == exploitationYears) {
                System.out.println("Car: id" + saloonCar[i].getId() + "; " + saloonCar[i].getBrand() + "; Model:" + saloonCar[i].getModel() + "; year:" + saloonCar[i].getCreationYear() + "; " + saloonCar[i].getColor() + "; $" + saloonCar[i].getPrice() + "; Registration Number: " + saloonCar[i].getRegistrationNumber());
            }
        }
    }

    public static void getCarYearAndPrice(Car[] saloonCar) {
        System.out.print("Введите год выпуска автомобиля: ");
        int carYear = in.nextInt();
        System.out.print("Введите цену автомобиля: ");
        int carPrice = in.nextInt();
        for (int i = 0; i < saloonCar.length; i++) {
            if (saloonCar[i].getCreationYear() == carYear && saloonCar[i].getPrice() > carPrice) {
                System.out.println("Car: id" + saloonCar[i].getId() + "; " + saloonCar[i].getBrand() + "; Model:" + saloonCar[i].getModel() + "; year:" + saloonCar[i].getCreationYear() + "; " + saloonCar[i].getColor() + "; $" + saloonCar[i].getPrice() + "; Registration Number: " + saloonCar[i].getRegistrationNumber());
            }
        }
    }
}

