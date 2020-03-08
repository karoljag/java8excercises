package com.udemy.supplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class Test52 {





    public static void main(String[] args) {
        Supplier<Double> random= ()->Math.random();
        System.out.println(random.get());


    }


}
