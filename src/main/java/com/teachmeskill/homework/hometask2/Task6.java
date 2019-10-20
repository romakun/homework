package com.teachmeskill.homework.hometask2;

public class Task6 {
    public static void main(String[] args) {
        //Первый вариант
        System.out.print("Первый вариант : ");
        for (int i = 2;i <= 100; i = i + 2){
            System.out.print(" " + i + " ");
        }
        System.out.println();

        //Второй вариант
        System.out.print("Второй вариант : ");
        for (int i = 2;i <= 100; i++){
            if (i%2 == 0) {
                System.out.print(" " + i + " ");
            }
        }
    }
}
