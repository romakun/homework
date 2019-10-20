package com.teachmeskill.homework.hometask2;

public class MathTask4 {
    public static void main(String[] args) {
        double myNumber = 3.555555555;

        System.out.println("Округление в большую сторону числа " + myNumber + " при помощи метода ceil : " + Math.ceil(myNumber));
        System.out.println("Округление в меньшую сторону числа " + myNumber + " при помощи метода floor : " + Math.floor(myNumber));
        System.out.println("Округление с точностью до сотых числа " + myNumber + "  при помощи метода round : " + Math.round(myNumber * 100d) / 100d);
    }
}
