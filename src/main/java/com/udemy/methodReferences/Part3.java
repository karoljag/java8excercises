package com.udemy.methodReferences;

public class Part3 {

    public static void main(String[] args) {
//        StringOperations3 threeA = (s,v)->s.concat(v);
        StringOperations3 threeA=String::concat;
        System.out.println(threeA.accept("Karol ","Jagla"));
    }
}
