package saha;
import java.util.*;
public class primenumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value to check prime number :");
		int a=s.nextInt();
		int b=0;
		int i;
		for (i=2;i<=a/2;i++) {
				 
			if(a%i==0) {
				b=1;
						
				break;
				
			}
		}
		if(b==0) {
			System.out.println(a+"is a prime number");
		}
		else {
			System.out.println(a+"is a non prime number");
		}
		
		
	}

}
