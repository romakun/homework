package com.teachmeskill.homework.hometask3;

public class ArrayTask4 {
    public static void main(String[] args) {
        System.out.println(writeArray(createArray()));
    }

    //Метод создания массива
    private static int[] createArray() {
        int[] myArray = new int[50];
        for (int i = 0, j = 1; i < myArray.length; i++, j += 2) {
            myArray[i] = j;
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
}