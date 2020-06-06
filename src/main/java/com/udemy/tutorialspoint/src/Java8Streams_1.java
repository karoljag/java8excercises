package com.udemy.tutorialspoint.src;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Streams_1 {

    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        filtered.forEach((s)-> System.out.println(s));
//        filtered.forEach(System.out::println);

/*
--------------------------------------------------------------------------------------------------
        forEach
        Stream has provided a new method ‘forEach’ to iterate each element of the stream. The following code segment shows how to print 10 random numbers using forEach.
*/

//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);
//----------------------------------------------------------------------------------------------------------------------

        /*       The ‘map’ method is used to map each element to its corresponding result. The following code segment prints unique squares of numbers using map*/
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

//get list of unique squares
//        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
//        squaresList.forEach(System.out::println);
//------------------------------------------------------------------------------------------------------------------------------
        /*
The ‘filter’ method is used to eliminate elements based on a criteria. The following code segment prints a count of empty strings using filter.
        * */
        // List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl","w","sd");

//get count of empty string
        //   int count = (int) strings.stream().filter(string -> string.length()<3).count();
//        List<String> li =  strings.stream().filter(string -> string.length()<3).collect(Collectors.toList());
//        li.forEach(s-> System.out.println(s));

//----------------------------------------------------------------------------------------------------------------------------
/*
sorted
The ‘sorted’ method is used to sort the stream. The following code segment shows how to print 10 random numbers in a sorted order.
*/
//        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 4848);
//        intList.stream().filter(e -> e > 6 || e < 10).forEach(System.out::println);
//        Random random = new Random();
//        random.ints().limit(10).sorted().forEach(System.out::println);
//        random.ints().limit(1000).filter(e -> e > 10 && e < 64573883).filter(v -> v % 2 == 0).forEach(System.out::println);
//        int[] ls = random.ints().limit(1000).filter(e -> e > 10 && e < 64573883).filter(v -> v % 2 == 0).toArray();
//        System.out.println("Result from table:");
//        List<Integer> dd = Arrays.stream(ls)
//                .boxed()
//                .collect(Collectors.toList());
//        dd.stream().forEach(System.out::println);
//
//
//        System.out.println("ILE:" + random.ints()
//                .limit(1000)
//                .filter(e -> e > 10 && e < 64573883)
//                .filter(v -> v % 2 == 0)
//                .count());


        ///----------------------------------------------------------------------------------------------------------------------------------
//COLLECTORS
        System.out.println("COLLECTORS");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).filter(s -> s.length()<3).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
        //STATISTICS
        List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x.hashCode()).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

    }
}
