package com.teachmeskill.homework.hometask8;

public class WordsTransform {
    public static void main(String[] args) {
        String firstWord = "Mara";
        String secondWord = "Roma";
        int wordMid = firstWord.length() / 2;

        String firstResultWord = firstTransformWord(firstWord, secondWord, wordMid);
        System.out.println(firstResultWord);

        String secondResultWord = secondTransformWord(firstWord, secondWord, wordMid);
        System.out.println(secondResultWord);
    }

    private static String firstTransformWord(String firstWord, String secondWord, int mid) {
        String[] firstWordParts = {firstWord.substring(0, mid), firstWord.substring(mid)};
        String[] secondWordParts = {secondWord.substring(0, mid), secondWord.substring(mid)};

        return firstWordParts[0] + secondWordParts[1];
    }

    private static String secondTransformWord(String firstWord, String secondWord, int mid) {
        String firstWordPart = firstWord.substring(0, mid);
        String secondWordPart = secondWord.substring(0, mid);

        return secondWord.replace(secondWordPart, firstWordPart);
    }

}
