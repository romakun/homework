package com.teachmeskill.homework.hometask3;

public class ArrayTask3 {
    public static void main(String[] args) {
        System.out.println(writeArryLine(createArray()));
        System.out.println(writeArrayColumn(createArray()));
    }

    //Метод создания массива
    private static int[] createArray() {
        int[] myArray = new int[10];
        for (int i = 0, j = 2; j <= 20; i++, j += 2) {
            myArray[i] = j;
        }
        return myArray;
    }

    //Метод вывода массива в строку
    private static String writeArryLine(int[] myArray) {
        String myArrayLine = "";
        for (int i = 0; i < myArray.length; i++) {
            myArrayLine = myArrayLine + myArray[i] + " ";
        }
        return myArrayLine;
    }

    //Метод вывода массива в столбец
    private static String writeArrayColumn(int[] myArray) {
        String myArrayLine = "";
        for (int i = 0; i < myArray.length; i++) {
            myArrayLine = myArrayLine + myArray[i] + "\n";
        }
        return myArrayLine;
    }
}