package com.udemy.assigment;

import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        MathOperation add = (a,b)->a+b;
        MathOperation substract =(a,b)->a-b;
        MathOperation multiply = (a,b)->a*b;
        MathOperation divide = (a,b)->a/b;
        Predicate<String> hasG =(m)-> (m.contains("g"));
        System.out.println( hasG.test("p"));

        System.out.println(calculate1(add));
        System.out.println(calculate1(substract));
        System.out.println(calculate1(multiply));
        System.out.println(calculate1(divide));


        System.out.println(calculate2(100,add,5));

    }

    private static int calculate1(MathOperation mathOperation) {

        int a = 100;
        int b = 5;

        return mathOperation.operate(a, b);

    }




    private static int calculate2(int onScreenNumber,MathOperation mathOperation,int enteredNumber) {
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }




}
