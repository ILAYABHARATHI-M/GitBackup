package java8;

import java.util.function.BiConsumer;

public class MethodReference {
	 static void show(int a ,int b) {
		
		
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> c = MethodReference :: show;
		 c.accept(34567, 34567);
	}

}
