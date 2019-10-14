package com.teachmeskill;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        chooseTask(enterNumber());
    }

    //Метод воода номера задачи
    public static int enterNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задачи от 1 до 7: ");
        int myNumber = in.nextInt();
        return myNumber;
    }

    //Метод выбора задачи для проверки
    public static void chooseTask(int enteredNumber) {

        switch (enteredNumber) {
            case 1:
                System.out.println(Task1.getNumberInfo());
                break;
            case 2:
                System.out.println(Task2.getTriangleInfo());
                break;
            case 3:
                System.out.println(Task3.getModifiedNumber());
                break;
            case 4:
                System.out.println(Task4.getNumberOfPositive());
                break;
            case 5:
                System.out.println(Task5.getNumbersInfo());
                break;
            case 6:
                System.out.println(Task6.getMaxNumber());
                break;
            case 7:
                System.out.println(Task7.getRightEnding());
                break;
        }
    }
}