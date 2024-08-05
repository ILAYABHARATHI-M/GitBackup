package java8;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.*;;

public class FunctionaInterfaceDemo {
public static void main(String[] args) {
	Predicate<Integer> p= (a)-> a>10;// Boolean return type
	System.out.println(p.test(10));
	BiPredicate<String,String > b=(a,c)->{int len1=a.length();int len2=c.length();return len1>len2;};
	System.out.println(b.test("hello", "hii")) ;
	
	Function <String,Integer> f=(a)-> 1;
	System.out.println(f.apply("welcome"));   // 1St arguments next return type
	
	BiFunction <Integer,Integer ,Integer > bf= (v,h)-> {return v+h;};
	System.out.println(bf.apply(12, 12));

	BiFunction <String,String ,Integer > bf1= (v,h)-> {return Integer.parseInt(h)+Integer.parseInt(v);};
	System.out.println(bf1.apply("12", "12"));
	
	Consumer <String > c= (v)->System.out.println(v);
	c.accept("Welcome");// Non return type
	
	BiConsumer <Integer,Integer> c1= (v ,h )->System.out.println(v+h);
	c1.accept(1000,1000);
	
	Supplier<Integer> s=()-> 7+8;
	System.out.println(s.get()); // No parameter method
	
	UnaryOperator<String> u=(a)-> a; 
	System.out.println(u.apply("welcome")); //Return type and argument are same
	
	BinaryOperator<Integer> bi=(a,r)-> a+r;
	System.out.println(bi.apply(3000, 3000));
	
	
	
}
}
