package com.teachmeskill;
import java.util.Scanner;

class Main {

    public static void main (String[] args){


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
            case 1: System.out.println(task1.task1Result());
                    break;
            case 2: System.out.println(task2.task2Result());
                    break;
            case 3: System.out.println(task3.task3Result());
                    break;
            case 4: System.out.println(task4.task4Result());
                    break;
            case 5: System.out.println(task5.task5Result());
                    break;
            case 6: System.out.println(task6.task6Result());
                    break;
            case 7: System.out.println(task7.task7Result());
                    break;
        }
    }
}