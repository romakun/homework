package com.teachmeskill.homework.hometask8;

import java.util.Scanner;

public class LineCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько строк вы хотите ввести?");
        int lineCount = in.nextInt();

        String[] lineArray = new String[lineCount];

        in.nextLine();

        for (int i = 0; i < lineCount; i++) {
            System.out.println("Введите строку");
            lineArray[i] = in.nextLine();
        }

        String maxLine = "";
        String minLine = lineArray[0];

        for (int i = 0; i < lineCount; i++) {
            if (maxLine.length() < lineArray[i].length()) {
                maxLine = lineArray[i];
            }
            if (minLine.length() > lineArray[i].length()) {
                minLine = lineArray[i];
            }
        }

        System.out.println("Самая длинная строка длинной " + maxLine.length() + " : " + maxLine);
        System.out.println("Самая короткая строка длинной " + minLine.length() + " : " + minLine);
    }
}
