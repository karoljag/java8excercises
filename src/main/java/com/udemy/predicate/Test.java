package com.udemy.predicate;

import java.util.function.Predicate;

public class Test {



    public static void main(String[] args) {
        Predicate<Integer> isGT2 = (n) -> n > 2;
        Predicate<Integer> isGT10 = (n) -> n<10;

        System.out.println(


//                isGT2.and(isGT10).test(1)
                isGT2.negate().test(4)

        );

    }
}
