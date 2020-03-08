package com.udemy.higherOrderFunction;

public class Part2 {

    public static void main(String[] args) {

//        convertToUpperCase("CdCVFSSddd");
//        convertToLowerCase("jfnkjEDDSpo''!@##d");

        test(n->n.toUpperCase());
        test((n)->n.toUpperCase());

    }

    private static void convertToUpperCase(String s){
        System.out.println(s.toUpperCase());
    }

    private static void convertToLowerCase(String s){
        System.out.println(s.toLowerCase());
    }


    // ta metoda ma dane a w linijce 11 i 12 przekazujesz zachowanie metody
    private static void test(GreetServiceHOF g) {
        String returnedString = g.greet("udemy");
        System.out.println(returnedString);
    }

}
