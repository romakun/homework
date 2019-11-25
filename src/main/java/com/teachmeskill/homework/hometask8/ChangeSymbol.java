package com.teachmeskill.homework.hometask8;

import java.util.Scanner;

public class ChangeSymbol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите строку:");
        String lane = in.nextLine();

        String[] words = lane.split(" ");


        for (int i = 0; i < words.length; i++) {
            char firstSymbol = words[i].charAt(0);
            char[] wordChars = words[i].toCharArray();
            if (wordChars.length > 3) {
                wordChars[3] = firstSymbol;
                words[i] = String.valueOf(wordChars);
            } else {
                words[i] = String.valueOf(wordChars);
            }

        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
