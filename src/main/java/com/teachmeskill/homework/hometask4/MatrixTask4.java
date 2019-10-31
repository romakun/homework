package com.teachmeskill.homework.hometask4;

import java.util.Random;
import java.util.Scanner;

public class MatrixTask4 {
    public static void main(String[] args) {
        int[][] myMatrix = createMatrix();
        printMyMatrix(myMatrix);
        compareTheProductOfDiagonals(myMatrix);
    }

    private static int[][] createMatrix() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int matrixLengths = in.nextInt();
        int[][] myMatrix = new int[matrixLengths][matrixLengths];

        for (int i = 0; i < matrixLengths; i++) {
            for (int j = 0; j < matrixLengths; j++) {
                myMatrix[i][j] = random.nextInt(51);
            }
        }
        return myMatrix;
    }

    private static void printMyMatrix(int[][] myMatrix) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[0].length; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void compareTheProductOfDiagonals(int[][] myMatrix) {
        int firstDigitsComposition = 1;
        int secondDigitsComposition = 1;

        for (int i = 0; i < myMatrix.length; i++) {
            firstDigitsComposition *= myMatrix[i][i];
            secondDigitsComposition *= myMatrix[myMatrix.length - 1 - i][i];
        }

        if (firstDigitsComposition > secondDigitsComposition) {
            System.out.println("Произведение главной диагонали больше и = " + firstDigitsComposition);
        } else if (secondDigitsComposition > firstDigitsComposition) {
            System.out.println("Произведение второстепенной диагонали больше и = " + firstDigitsComposition);
        } else System.out.println("Произведение диагоналей одинаково и = " + firstDigitsComposition);
    }
}
