package com.udemy.java35;

public class Test35 {

    public static void main(String[] args) {
        GreetingService g = (name) -> {
           return   name.toUpperCase();
        };

        System.out.println(g.greet("Karol"));



        GreetingService na = (n)->n.toUpperCase();
        System.out.println(na.greet("jednolinijkowy return"));


    }
}
