package com.teachmeskill.homework.hometask4;

import java.util.Random;
import java.util.Scanner;

public class MatrixTask5 {
    public static void main(String[] args) {
        int[][] myMatrix = createMatrix();
        printMyMatrix(myMatrix);
        getSumElements(myMatrix);
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

    private static void getSumElements(int[][] myMatrix) {
        int sumElements = 0;

        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix.length - 1 - i; j++) {
                if (myMatrix[i][j] % 2 == 0) {
                    sumElements += myMatrix[i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов находящихся над побочной диагональю матрицы = " + sumElements);
    }
}