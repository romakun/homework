package com.teachmeskill.homework.hometask2;

public class Task3 {
    public static void main(String[] args) {
        int myNumber = 0;

        for (int i = 1; i <= 256; i = i * 2) {
            System.out.print(myNumber + " + " + i + " = ");
            myNumber = myNumber + i;
            System.out.println(myNumber);
        }
    }
}
