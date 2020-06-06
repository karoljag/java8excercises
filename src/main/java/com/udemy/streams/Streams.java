package com.udemy.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<Integer> iterate = Stream.iterate(1, n -> n + 1);


        List<String> names = Arrays.asList("Zosia", "Ala", "Ala", "Ala", "Dorota", "Kasia", "Asia", "Karol", "Karolina", "Ala", "Olo");
        Stream<String> namStream = names.stream();

        names.stream()
                .filter(n -> n.endsWith("a"))
                .forEach(n -> System.out.println(n));

        System.out.println("----------------------------------------------");
        names.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.endsWith("a");
            }
        })
                .sorted()
                .forEach(System.out::println);


        List<String> imiona = names.stream()
                .filter(l -> l.endsWith(""))
                .collect(Collectors.toList());

        Set<String> imionaSet = names.stream()
                .filter(l -> l.endsWith(""))
                .collect(Collectors.toSet());


        System.out.println("List_im: " + imiona);
        System.out.println("imionaSet: " + imionaSet);

        System.out.println("------------------USER-------------------------- ");


        List<User> listaUserow = names.stream()

                .map(string -> new User(string, new Random().nextInt(80)))
                .filter(user ->user.getName().endsWith("a"))
                .sorted(Comparator.comparing(User::getName).reversed())
                .collect(Collectors.toList());


        System.out.println(listaUserow.toString());



    }


};

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        System.out.println("Tworze usera: "+name);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}