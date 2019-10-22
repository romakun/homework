package com.teachmeskill.homework.hometask3;

import java.util.Random;

public class ArrayTask8 {
    public static void main(String[] args) {
        int[] firstArray = createArray();
        int[] secondArray = createArray();

        System.out.println(writeArray(firstArray));
        System.out.println(writeArray(secondArray));

        double firstArithmeticalMean = giveArithmeticalMean(firstArray);
        double secondArithmeticalMean = giveArithmeticalMean(secondArray);

        System.out.println(giveComparisonResult(firstArithmeticalMean, secondArithmeticalMean));
    }

    //Метод создания массива
    private static int[] createArray() {
        Random randomNumber = new Random();
        int[] firstArray = new int[5];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = randomNumber.nextInt(16);
        }
        return firstArray;
    }

    //Метод вывода массива
    private static String writeArray(int[] myArray) {
        String myArrayLine = "";

        for (int i = 0; i < myArray.length; i++) {
            myArrayLine = myArrayLine + myArray[i] + "; ";
        }
        return myArrayLine;
    }

    //Метод подсчета среднего арифметичческого массива
    private static double giveArithmeticalMean(int[] myArray) {
        double arithmeticalMean = 0;

        for (int i = 0; i < myArray.length; i++) {
            arithmeticalMean = arithmeticalMean + myArray[i];
        }
        arithmeticalMean = arithmeticalMean / 2;
        return arithmeticalMean;
    }

    //Метод сравнения среднего арифметического массивов
    private static String giveComparisonResult(double firstArithmeticalMean, double secondArithmeticalMean) {
        String comparisonResult = "";
        if (firstArithmeticalMean > secondArithmeticalMean) {
            comparisonResult = "Среднее арифметическое первого массива больше и равно : " + firstArithmeticalMean;
        } else if (firstArithmeticalMean < secondArithmeticalMean) {
            comparisonResult = "Среднее арифметическое второго массива больше и равно : " + secondArithmeticalMean;
        } else {
            comparisonResult = "Средние арифметические обоих массивов равны";
        }
        return comparisonResult;
    }
}