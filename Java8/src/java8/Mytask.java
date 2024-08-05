package java8;

import java.util.function.Supplier;

public class Mytask {
public static void main(String[] args) {
       Supplier<String> p = () -> "sahade";
       
       System.out.println(p.get() );
}
}
