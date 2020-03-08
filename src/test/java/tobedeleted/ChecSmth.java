package tobedeleted;

import java.util.function.Consumer;

public class ChecSmth {

    public static void main(String[] args) {

        Consumer <String> v = (f)-> System.out.println(f.length());
       v.accept("papa");

    }
}
