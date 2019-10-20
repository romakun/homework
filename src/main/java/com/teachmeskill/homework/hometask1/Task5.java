package com.teachmeskill.homework.hometask1;

import java.util.Scanner;

public class Task5 {

    public static String getNumbersInfo() {
        String task4Result;
        int numberOfPositive = 0;
        int numberOfNegative = 0;

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

        //Подсчет положительных и отрицательных чисел
        if (number1 > 0) {
            numberOfPositive++;
        } else if (number1 < 0) {
            numberOfNegative++;
        }
        if (number2 > 0) {
            numberOfPositive++;
        } else if (number2 < 0) {
            numberOfNegative++;
        }
        if (number3 > 0) {
            numberOfPositive++;
        } else if (number3 < 0) {
            numberOfNegative++;
        }
        task4Result = "Количество положительных чисел в наборе = " + numberOfPositive + "; Количество отрицательных чисел в наборе = " + numberOfNegative;
        return task4Result;
    }
}
