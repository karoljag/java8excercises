package com.udemy.higherOrderFunction;

public class Part1 {

    public static void main(String[] args) {


        test((n) -> n.toUpperCase());
        test((n) -> n.toLowerCase() + n.length());
        test((n) -> n.substring(2, 4));

        GreetServiceHOF f  = (s)->s.toLowerCase();
        System.out.println(f.greet("dd"));

        Ftemp a1 = (h)-> System.out.println(h.toUpperCase());
        a1.nothing("male");
    }

    private static void test(GreetServiceHOF g) {
        String returnedString = g.greet("udemy");
        System.out.println(returnedString);
    }
}
