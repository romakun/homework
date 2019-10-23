package com.teachmeskill.homework.hometask3;

import java.util.Random;

public class ArrayTask6 {
    public static void main(String[] args) {
        int[] myArray;
        myArray = createArray();
        System.out.println(writeArray(myArray));
        System.out.println("Количесво четных чисел в массиве = " + giveNumberOfEven(myArray));
    }

    //Метод создания массива
    private static int[] createArray() {
        Random randomNumber = new Random();
        int[] myArray = new int[15];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomNumber.nextInt(100);
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

    //Метод подсчета четных элементов в массиве
    private static int giveNumberOfEven(int[] myArray) {
        int numberOfEven = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0)
                numberOfEven++;
        }
        return numberOfEven;
    }
}