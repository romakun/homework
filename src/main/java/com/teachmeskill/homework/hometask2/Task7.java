package com.teachmeskill.homework.hometask2;

public class Task7 {
    public static void main(String[] args) {
        //Первый вариант
        long sumNumbers = 0;
        System.out.print("Первый вариант : ");
        for (int i = 1; i <= 100; i = i + 2) {
            sumNumbers = sumNumbers + i;
        }
        System.out.println(sumNumbers);
        sumNumbers = 0;

        //Второй вариант
        System.out.print("Второй вариант : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sumNumbers = sumNumbers + i;
            }
        }
        System.out.println(sumNumbers);
    }
}