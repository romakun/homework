package com.teachmeskill.homework.hometask4;

public class MatrixTask1 {
    public static void main(String[] args) {
        printMyMatrix(createMatrix());
    }

    private static int[][] createMatrix() {
        int[][] myMatrix = new int[3][4];
        int lastColumnIndex = myMatrix[0].length - 1;
        int lastLineIndex = myMatrix.length - 1;

        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[0].length; j++) {

//Первый не универсальный вариант, хотелось поюзать switch больше.
//                if(i == 0){
//                    switch (j){
//                        case(0):
//                        case(3):
//                            myMatrix[i][j] = 1;
//                            break;
//                        default:
//                            myMatrix[i][j] = 0;
//                    }
//                } else if(i == 2){
//                    switch (j){
//                        case(0):
//                        case(3):
//                            myMatrix[i][j] = 1;
//                            break;
//                        default:
//                            myMatrix[i][j] = 0;
//                    }
//                } else {
//                    myMatrix[i][j] = 0;
//                }

                if (i == 0 || i == lastLineIndex) {
                    if (j == 0 || j == lastColumnIndex) {
                        myMatrix[i][j] = 1;
                    } else {
                        myMatrix[i][j] = 0;
                    }
                } else {
                    myMatrix[i][j] = 0;
                }
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
}
