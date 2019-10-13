package com.teachmeskill;
import java.util.Scanner;

public class task3 {

    public static String task3Result() {

        long enteredNumber = enterNumber();
        long newNumber = digitSign(enteredNumber);
        String taskResult = ("Полученное число = " + newNumber);
        return taskResult;
    }

    //Метод воода числа
    public static long enterNumber() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        long myNumber = in.nextInt();
        return myNumber;

    }

    //Метод для определения знака введенного числа и соответствующих его изменений
    public static long digitSign(long enteredNumber){

        if (enteredNumber > 0) {

            enteredNumber = enteredNumber + 1;
        } else if (enteredNumber < 0) {

            enteredNumber = enteredNumber - 2;
        } else {

            enteredNumber = 10;
        }
        return enteredNumber;

    }

}
