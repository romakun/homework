package com.teachmeskill.homework.hometask3;

import java.util.Random;

public class ArrayTask9 {
    public static void main(String[] args) {
        int[] myArray = createArray();

        System.out.println(writeArray(myArray));
        System.out.println(giveInfoAboutArray(myArray));
    }

    //Метод создания массива
    private static int[] createArray() {
        Random randomNumber = new Random();
        int[] myArray = new int[4];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomNumber.nextInt(11);
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

    //Метод определения является ли массив строго возрастающей последовательностью
    private static String giveInfoAboutArray(int[] myArray) {
        String infoAboutArray = "";
        int comparisonNumber = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (comparisonNumber < myArray[i]) {
                comparisonNumber = myArray[i];
                infoAboutArray = "Массив является строго возрастающей последовательностью";
            } else {
                infoAboutArray = "Массив не является строго возрастающей последовательностью";
                break;              //плохо, но разочек же можно ? =)
            }
        }
        return infoAboutArray;
    }
}