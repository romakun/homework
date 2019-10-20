package com.teachmeskill.homework.hometask2;

public class Task4 {
    public static void main(String[] args) {
        int firstNumber = 23;
        int secondNumber = 42;
        int resultNumber = 0;

        for (int i = 1; i <= secondNumber; i++) {
            resultNumber = resultNumber + firstNumber;
        }
        System.out.println("Результат умножения " + firstNumber + " на " + secondNumber + " = " + resultNumber);
    }
}
