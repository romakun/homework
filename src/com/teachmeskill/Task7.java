package com.teachmeskill;

import java.util.Scanner;

public class Task7 {

    public static String getRightEnding() {
        int programmersCount = enterNumber();
        String wordEnding = findWordEnding(programmersCount);
        wordEnding = programmersCount + " Программист" + wordEnding;
        return wordEnding;
    }

    //Метод воода количества программистов
    public static int enterNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество программистов: ");
        int programmistCount = in.nextInt();
        return programmistCount;
    }

    //Метод определения окончания для слова "Программист"
    public static String findWordEnding(int enteredNumber) {
        int lastCharacter1 = 0;
        int lastCharacter2 = 0;
        String wordEnding = "";

        lastCharacter1 = enteredNumber % 100;
        lastCharacter2 = lastCharacter1 % 10;

        if (lastCharacter1 > 10 && lastCharacter1 < 20) {
            return wordEnding = "ов";
        }
        if (lastCharacter2 > 1 && lastCharacter2 < 5) {
            return wordEnding = "а";
        }
        if (lastCharacter2 == 1) {
            return wordEnding = "";
        }
        return wordEnding = "ов";
    }
}
