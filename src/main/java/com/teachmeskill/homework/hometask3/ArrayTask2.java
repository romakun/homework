package com.teachmeskill.homework.hometask3;

public class ArrayTask2 {
    public static void main(String[] args) {
        System.out.println(writeArray(createArray()));
    }

    //Метод создания массива
    private static int[] createArray() {
        int[] myArray = new int[10];
        for (int i = 1; i < myArray.length; i = i + 2) {    //Можно и через if, но если знаешь как работает массив,
            myArray[i] = 1;                                 //То на мой взгляд так проще
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