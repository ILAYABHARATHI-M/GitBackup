package saha;
import java.util.*;
public class sumofnnumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=s.nextInt();
		int b=0;
		for(int i=a;i>0;i--) 
		    {
			  b = b+i;
			}
		
		System.out.println("The value of sum is"+b);
	}

}
