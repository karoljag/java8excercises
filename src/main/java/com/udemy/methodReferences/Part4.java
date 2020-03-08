package com.udemy.methodReferences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Part4 {

    private static final List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");


        StringOperations4 n = (s)->list.add(s);
        StringOperations4 k = list::add;

        n.accept("lambda");
        k.accept("mamba");



//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
