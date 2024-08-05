package java8;

import java.util.function.Predicate;

public class StringIsEmpty {
	static boolean find( String a) {
		return a.isEmpty();
	}
	
public static void main(String[] args) {
	String s=" ";
	Predicate <String> p = StringIsEmpty :: find;
	System.out.println(p.test(s));
}

}
