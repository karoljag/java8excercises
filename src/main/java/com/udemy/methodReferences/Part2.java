package com.udemy.methodReferences;

import java.util.Objects;

public class Part2 {

    public static void main(String[] args) {

        //--1--
        StringOperations2 v1 = b ->  Objects.isNull(b);
        System.out.println(v1.accept("V1"));
        System.out.println(v1.accept(null));

        //--2--
        StringOperations2 v2 =Objects::isNull;
        System.out.println(v2.accept("V2"));
        System.out.println(v2.accept(null));

        //--3--
        StringOperations2a v2a = (x)->x.toUpperCase();
        //StringOperations2a v3 = String::toUpperCase;
        System.out.println( v2a.accept("mnEEmm"));


    }
}
