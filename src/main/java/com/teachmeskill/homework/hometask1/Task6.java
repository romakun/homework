package com.teachmeskill.homework.hometask1;

import java.util.Scanner;

public class Task6 {

    public static String getMaxNumber() {
        String maxNumber;

        //Ввод первого числа
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        long number1 = in1.nextInt();

        //Ввод второго числа
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите второе целое число: ");
        long number2 = in2.nextInt();

        //Сравнение 2х чисел
        if (number1 > number2) {
            maxNumber = "Первое число больше второго и равняется " + number1;
        } else if (number1 < number2) {
            maxNumber = "Второе число больше первого и равняется " + number2;
        } else {
            maxNumber = "Оба числа равны " + number1;
        }
        return maxNumber;
    }
}
