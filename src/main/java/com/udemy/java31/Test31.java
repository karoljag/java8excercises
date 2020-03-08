package com.udemy.java31;

import com.udemy.java31.GreetingService;

public class Test31 {

    public static void main(String[] args) {
        System.out.println("--------  31  ----------------");

        GreetingService g1 = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Hi "+name);
            }
        };
        g1.greet("Karol");

        //--------------------------------------------

        GreetingService g2 = (s)-> System.out.println(s);
        g2.greet("Mam na imie pierwsza lambda");


        //---------------------------------------------
        GreetingService g3 = (String n)-> {
            System.out.println("lenght:"+n.length());
            System.out.println(n.toUpperCase());
        };
        g3.greet("Jarek");

        //---------------------------------------------




    }
}
