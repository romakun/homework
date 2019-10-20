package com.teachmeskill.homework.hometask1;

import java.util.Scanner;

public class Task4 {

    public static String getNumberOfPositive() {
        String task4Result;
        int numberOfPositive = 0;

        //Ввод первого числа
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        long number1 = in1.nextInt();

        //Ввод второго числа
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        long number2 = in2.nextInt();

        //Ввод третьего числа
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите третье целое число: ");
        long number3 = in3.nextInt();

        //Подсчет положительных чисел
        if (number1 > 0) {
            numberOfPositive++;
        }
        if (number2 > 0) {
            numberOfPositive++;
        }
        if (number3 > 0) {
            numberOfPositive++;
        }
        task4Result = "Количество положительных чисел в наборе = " + numberOfPositive;
        return task4Result;
    }
}
