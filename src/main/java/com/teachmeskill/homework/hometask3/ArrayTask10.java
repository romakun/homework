package com.teachmeskill.homework.hometask3;

import java.util.Random;

public class ArrayTask10 {
    public static void main(String[] args) {
        int[] myArray = createArray();

        System.out.println(writeArray(myArray));
        System.out.println("Индекс максимального числа в массиве : " + giveInfoAboutMaxNumber(myArray));
    }

    //Метод создания массива
    private static int[] createArray() {
        Random randomNumber = new Random();
        int[] myArray = new int[12];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomNumber.nextInt(16);
        }
        return myArray;
    }

    //Метод вывода массива
    private static String writeArray(int[] myArray) {
        String myArrayLine = "";

        for (int i = 0; i < myArray.length; i++) {
            myArrayLine = myArrayLine + myArray[i] + "; ";
        }
        return myArrayLine;
    }

    //Метод определения индекса максимального числа в массиве
    private static int giveInfoAboutMaxNumber(int[] myArray) {
        int comparisonNumber = 0;
        int indexComparisonNumber = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (comparisonNumber < myArray[i]) {
                comparisonNumber = myArray[i];
                indexComparisonNumber = i;
            }
        }
        return indexComparisonNumber;
    }
}