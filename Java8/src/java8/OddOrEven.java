package java8;

import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number :");
	int a =sc.nextInt();
	 if((a&1)==1) {
		 
		 System.out.println("Given number is odd");
	 }
	 else {
		 System.out.println("Given number is even");
	 }
	 
	
}
}
