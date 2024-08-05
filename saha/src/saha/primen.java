package saha;
import java.util.*;
public class primen {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value to check prime number:");
		int a=s.nextInt();
		int count=0;
		for(int i=1;i<=a;i++) {
			if (a%i==0) {
				
				count++;
			}
		}
		if(count==2) {
			System.out.println("-------Its a  prime number------");
		}
		else {
			System.out.println("------- Its a non prime number------");
		}
		
	
	}}