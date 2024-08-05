package java8;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class Marks{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter marks scored in Tamil:" );

		int m1 =sc.nextInt();
		
		System.out.println("Enter marks scored in English: ");
		
		int m2 =sc.nextInt();
		
		BiPredicate<Integer ,Integer > p = (a,b)-> 50<((a+b)/2);
		
		System.out.println(p.test(m1, m2));
		
		sc.close();
		
		sc.delimiter();
		
		
		
}
}