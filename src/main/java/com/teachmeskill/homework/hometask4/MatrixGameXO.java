package com.teachmeskill.homework.hometask4;

import java.util.Scanner;

public class MatrixGameXO {
    public static void main(String[] args) {
        String[][] myMatrix = createMatrix();
        System.out.println("Игра в крестики нолики начинается. Первый игрок ходит Х, второй игрок ходит О: ");
        printMyMatrix(myMatrix);
        System.out.println(gameLogic(myMatrix));
    }

    private static String[][] createMatrix() {
        return new String[][]{{"+", "1", "2", "3"},
                              {"1", "-", "-", "-"},
                              {"2", "-", "-", "-"},
                              {"3", "-", "-", "-"}};
    }

    private static void printMyMatrix(String[][] myMatrix) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[0].length; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String gameLogic(String[][] myMatrix) {
        Scanner in = new Scanner(System.in);
        int myCounter = 1;
        int secondCounter = 0;
        boolean isTrue = false;
        String result = "";

        while (!isTrue) {
            isTrue = true;
            for (int i = 1; i < myMatrix.length; i++) {
                for (int j = 1; j < myMatrix.length; j++) {
                    if (myMatrix[i][j] == "-") {
                        isTrue = false;
                        switch (myCounter) {
                            case (1):
                                System.out.println("Ходит первый игрок");
                                System.out.print("Введите координату по горизонтали: ");
                                int horizontalCoordinate = in.nextInt();
                                System.out.print("Введите координату по вертикали: ");
                                int verticalCoordinate = in.nextInt();

                                while (myMatrix[verticalCoordinate][horizontalCoordinate] != "-") {
                                    System.out.println("Клетка по данным координатам уже занята, выберите пустую клетку");
                                    System.out.print("Введите координату по горизонтали: ");
                                    horizontalCoordinate = in.nextInt();
                                    System.out.print("Введите координату по вертикали: ");
                                    verticalCoordinate = in.nextInt();
                                }

                                myMatrix[verticalCoordinate][horizontalCoordinate] = "X";
                                printMyMatrix(myMatrix);
                                myCounter = 2;
                                break;
                            case (2):
                                System.out.println("Ходит второй игрок");
                                System.out.print("Введите координату по горизонтали: ");
                                horizontalCoordinate = in.nextInt();
                                System.out.print("Введите координату по вертикали: ");
                                verticalCoordinate = in.nextInt();

                                while (myMatrix[verticalCoordinate][horizontalCoordinate] != "-") {
                                    System.out.println("Клетка по данным координатам уже занята, выберите пустую клетку");
                                    System.out.print("Введите координату по горизонтали: ");
                                    horizontalCoordinate = in.nextInt();
                                    System.out.print("Введите координату по вертикали: ");
                                    verticalCoordinate = in.nextInt();
                                }

                                myMatrix[verticalCoordinate][horizontalCoordinate] = "O";
                                printMyMatrix(myMatrix);
                                myCounter = 1;
                                break;
                        }
                        secondCounter++;
                    }
                    if (secondCounter >= 5) {
                        if (myMatrix[1][1] == "X" && myMatrix[1][2] == "X" && myMatrix[1][3] == "X") {
                            return result = "Победил первый игрок!!!";
                        }
                        if (myMatrix[2][1] == "X" && myMatrix[2][2] == "X" && myMatrix[2][3] == "X") {
                            return result = "Победил первый игрок!!!";
                        }
                        if (myMatrix[3][1] == "X" && myMatrix[3][2] == "X" && myMatrix[3][3] == "X") {
                            return result = "Победил первый игрок!!!";
                        }
                        if (myMatrix[1][1] == "X" && myMatrix[2][1] == "X" && myMatrix[3][1] == "X") {
                            return result = "Победил первый игрок!!!";
                        }
                        if (myMatrix[1][2] == "X" && myMatrix[2][2] == "X" && myMatrix[3][2] == "X") {
                            return result = "Победил первый игрок!!!";
                        }
                        if (myMatrix[1][3] == "X" && myMatrix[2][3] == "X" && myMatrix[3][3] == "X") {
                            return result = "Победил первый игрок!!!";
                        }
                        if (myMatrix[1][1] == "X" && myMatrix[2][2] == "X" && myMatrix[3][3] == "X") {
                            return result = "Победил первый игрок!!!";
                        }
                        if (myMatrix[1][3] == "X" && myMatrix[2][2] == "X" && myMatrix[3][1] == "X") {
                            return result = "Победил первый игрок!!!";
                        }
                        if (myMatrix[1][1] == "O" && myMatrix[1][2] == "O" && myMatrix[1][3] == "O") {
                            return result = "Победил второй игрок!!!";
                        }
                        if (myMatrix[2][1] == "O" && myMatrix[2][2] == "O" && myMatrix[2][3] == "O") {
                            return result = "Победил второй игрок!!!";
                        }
                        if (myMatrix[3][1] == "O" && myMatrix[3][2] == "O" && myMatrix[3][3] == "O") {
                            return result = "Победил второй игрок!!!";
                        }
                        if (myMatrix[1][1] == "O" && myMatrix[2][1] == "O" && myMatrix[3][1] == "O") {
                            return result = "Победил второй игрок!!!";
                        }
                        if (myMatrix[1][2] == "O" && myMatrix[2][2] == "O" && myMatrix[3][2] == "O") {
                            return result = "Победил второй игрок!!!";
                        }
                        if (myMatrix[1][3] == "O" && myMatrix[2][3] == "O" && myMatrix[3][3] == "O") {
                            return result = "Победил второй игрок!!!";
                        }
                        if (myMatrix[1][1] == "O" && myMatrix[2][2] == "O" && myMatrix[3][3] == "O") {
                            return result = "Победил второй игрок!!!";
                        }
                        if (myMatrix[1][3] == "O" && myMatrix[2][2] == "O" && myMatrix[3][1] == "O") {
                            return result = "Победил второй игрок!!!";

                        }
                    }
                }
            }
        }
        return result = "Ничья!";
    }
}
