package com.teachmeskill.homework.hometask2;

public class MathTask2 {
    public static void main(String[] args) {
        long firstNumber = 100;
        long secondNumber = 10;

        System.out.println("Первый способ с использованием метода min : " + Math.min(firstNumber, secondNumber));

        if (firstNumber < secondNumber) {
            System.out.println("Второй способ с использованием if : " + firstNumber);
        } else {
            System.out.println("Второй способ с использованием if : " + secondNumber);
        }
    }
}