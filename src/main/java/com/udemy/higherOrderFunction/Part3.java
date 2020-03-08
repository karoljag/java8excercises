package com.udemy.higherOrderFunction;

public class Part3 {

    public static void main(String[] args) {
        String v =getLambda1().greet("GdfT");
        System.out.println(v);


        String v2 = getLambda2().greet("fkfrGGGkr");
        System.out.println(v2);
    }


    private static  GreetServiceHOF  getLambda1(){
        GreetServiceHOF g = (b)->b.toUpperCase();
        return g;
    }

    private static  GreetServiceHOF  getLambda2(){
      return (b)->b.toLowerCase();
    }



}
