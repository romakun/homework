package com.teachmeskill.homework.hometask3;

public class ArrayTask5 {
    public static void main(String[] args) {
        System.out.println(writeArray(flipOverArray(createArray())));
    }

    //Метод создания массива
    public static int[] createArray() {
        int[] myArray = new int[50];
        for (int i = 0, j = 1; i < myArray.length; i++, j += 2) {
            myArray[i] = j;
        }
        return myArray;
    }

    //Метод переворачивания массива
    private static int[] flipOverArray(int[] myArray) {
        int saveArrayNumber = 0;

        for (int i = 0, j = 49; i < 25; i++, j--) {
            saveArrayNumber = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = saveArrayNumber;
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