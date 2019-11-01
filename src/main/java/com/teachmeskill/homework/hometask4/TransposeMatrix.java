package com.teachmeskill.homework.hometask4;

import java.util.Random;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] myMatrix = createMatrix();
        printMyMatrix(myMatrix);
        transposeMatrix(myMatrix);
        System.out.println();
        printMyMatrix(myMatrix);
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

    private static void transposeMatrix(int[][] myMatrix) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = i; j < myMatrix.length; j++) {
                int temp = myMatrix[i][j];
                myMatrix[i][j] = myMatrix[j][i];
                myMatrix[j][i] = temp;
            }
        }
    }
}