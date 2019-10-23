package com.teachmeskill.homework.hometask3;

import java.util.Random;

public class ArrayTask7 {
    public static void main(String[] args) {
        int[] myArray = createArray();

        System.out.println(writeArray(myArray));
        changeOddToZero(myArray);
        System.out.println(writeArray(myArray));
    }

    //Метод наполнения массива
    private static int[] createArray() {
        Random randomNumber = new Random();
        int[] myArray = new int[20];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomNumber.nextInt(21);
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

    //Метод замены нечетных чисел в массиве на 0
    private static void changeOddToZero(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1)
                myArray[i] = 0;
        }
    }
}