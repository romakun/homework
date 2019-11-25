package com.teachmeskill.homework.hometask8;


public class LineTransform {
    public static void main(String[] args) {
        String lane = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";


        String oop = lane.replaceAll("(Object-oriented programming(?:(?!Object-oriented programming).)*)Object-oriented programming((?:i(?!Object-oriented programming).)*)", "OOP");
    }
}

