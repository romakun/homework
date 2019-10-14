package com.teachmeskill;
import java.util.Scanner;

public class Task2 {

    public static String getTriangleInfo(){

        String taskResult;

        //Ввод стороны А
        Scanner inA = new Scanner(System.in);
        System.out.print("Введите сторону А треугольника: ");
        long sideA = inA.nextInt();

        //Ввод стороны B
        Scanner inB = new Scanner(System.in);
        System.out.print("Введите сторону B треугольника: ");
        long sideB = inB.nextInt();

        //Ввод стороны C
        Scanner inC = new Scanner(System.in);
        System.out.print("Введите сторону C треугольника: ");
        long sideC = inC.nextInt();

        //Проверяем существет ли треугольник
        if (sideA + sideB > sideC){
            if (sideA + sideC > sideB){
                if (sideB + sideC > sideA){
                    taskResult = "Треугольник существует";
                } else{
                    taskResult = "Треугольник не существует";
                }
            } else{
                taskResult = "Треугольник не существует" ;
            }
        } else{
            taskResult = "Треугольник не существует";
        }
        return taskResult;
    }

}
