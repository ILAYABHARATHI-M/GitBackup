package java8;

import java.util.function.BiFunction;

public class ConcodinateUsingMReference {
	static String find(String a ,String b) {
		return a+b;
	}
 	
	public static void main(String[] args) {
		
		BiFunction <String ,String,String> b= ConcodinateUsingMReference :: find;
		System.out.println(b.apply("Uniq", "Technology"));
	}

}
