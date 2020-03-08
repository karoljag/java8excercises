package com.udemy.methodReferences;

public class Part1 {

    public static void main(String[] args) {
        // 1-------
        StringOperations1 s1 = (d) -> System.out.println("Received string is: " + d);
        s1.accept("Przyklad 1");

        //2---------
        StringOperations1 s2 = System.out::println;
        s2.accept("Przyklad 2");


    }
}
