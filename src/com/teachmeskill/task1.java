package com.teachmeskill;
import java.util.Scanner;


public class task1 {

    //Главный метод возвращающий результат задачи
    public static String task1Result() {

        long enteredNumber = enterNumber();
        String taskResult = (digitCount(enteredNumber) + digitSign(enteredNumber));
        return taskResult;
    }

    //Метод воода числа
     public static long enterNumber() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        long myNumber = in.nextInt();
        return myNumber;

    }

    //Метод для определения количества цифр в веденном числе
     public static String digitCount(long enteredNumber){

        String resultCount;
        if (-10 < enteredNumber & enteredNumber < 10) {

            resultCount = "Это однозначное";
        } else if (-100 < enteredNumber && enteredNumber < 100) {

            resultCount ="Это двухзначное";
        } else {

            resultCount = "Это трехнзначное и более";
        }
        return resultCount;
     }

    //Метод для определения знака введенного числа
    public static String digitSign(long enteredNumber){

        String resultSign;
        if (enteredNumber > 0) {

            resultSign = " положительное число";
        } else if (enteredNumber < 0) {

            resultSign = " отрицательное число";
        } else {

            resultSign = " не положительное и не отрицательное число";
        }
        return resultSign;

    }
}
