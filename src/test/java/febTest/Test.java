package febTest;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int a = 5;
        int b=7;
//        Suma sum = new Suma() {
//            @Override
//            public int calc(int a, int b) {
//                return a+b;
//            }
//
//        };
//        System.out.println(sum.calc(2, 5));


        Suma qa = (c,d)->c+d;

        System.out.println(qa.calc(a,b));

        Printl p = (n)->System.out.println(n);
        p.print("qqqq");

        List<Integer> integerList = Arrays.asList(0,1,2,3,4,5,6);
        integerList.forEach(el-> System.out.println(el));

        integerList.forEach(element -> {
            int x = 5;
            System.out.println("Element: " + element * x);
        });

    }




}