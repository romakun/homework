package com.teachmeskill.homework.hometask2;

public class MathTask1 {
    public static void main(String[] args) {
        long firstNumber = 1;
        long secondNumber = 1;

        System.out.println("Первый способ с использованием метода max : " + Math.max(firstNumber, secondNumber));

        if (firstNumber > secondNumber) {
            System.out.println("Второй способ с использованием if : " + firstNumber);
        } else {
            System.out.println("Второй способ с использованием if : " + secondNumber);
        }
    }
}
