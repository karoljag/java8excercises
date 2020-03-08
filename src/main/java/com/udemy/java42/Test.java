package com.udemy.java42;

public class Test {

    public static void main(String[] args) {
        Greeting_Service g;
        Greeting_Service_return r;

        g = n -> System.out.println( n.toUpperCase());

        g.greet("jjjj");

        r=n -> n.toUpperCase();
        System.out.println(r.greet("bbb"));
    }



}
