package com.teachmeskill.homework.hometask3;

public class ArrayTask1 {
    public static void main(String[] args) {
        System.out.println(writeArray(createArray()));
    }

    //Метод создания массива
    private static int[] createArray() {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i = i + myArray.length - 1) {   //Реализовал через цикл, дабы при изменении длинны масива код не нужно было менять,
            myArray[i] = 1;                                                 //условия задачи все равно будут выполнены.
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
