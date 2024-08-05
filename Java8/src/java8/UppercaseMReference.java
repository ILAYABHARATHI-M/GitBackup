package java8;

import java.util.function.Function;

public class UppercaseMReference  {
	static String find(String a) {
		return a.toUpperCase();
	}
public static void main(String[] args) {
	Function <String ,String > f = UppercaseMReference :: find;
	System.out.println(f.apply("sahadevan"));
	
}
}
