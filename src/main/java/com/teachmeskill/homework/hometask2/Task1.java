package com.teachmeskill.homework.hometask2;

public class Task1 {
    public static void main(String[] args) {
        final int trainingDays = 7;
        double trainingResult = 0;
        double firstTraining = 10;

        System.out.println("Результат 1 тренировки = " + firstTraining);

        for (int i = 2; i <= trainingDays; i++) {
            firstTraining = firstTraining + (firstTraining / 100) * 10;
            System.out.println("Результат " + i + " тренировки = " + firstTraining);
            trainingResult = trainingResult + firstTraining;
        }
        System.out.println("Общий результат тренировок = " + trainingResult);
    }
}
