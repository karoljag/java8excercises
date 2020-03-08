package com.udemy.java35;

public class Test38x41 {

    public static void main(String[] args) {
        GreetingService g1 = (name)->name.toUpperCase();

        test(g1);
        test(name -> name.toUpperCase());
        test(a->a.substring(2,5));
        test(a->a.replace("u","X"));
    }





    private static void test (GreetingService g){
     String returnedString =  g.greet("udemy");
        System.out.println(returnedString);
    }
}
