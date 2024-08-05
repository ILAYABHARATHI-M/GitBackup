package saha;
import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		System.out.println("Enter your percentage");
		Scanner s=new Scanner(System.in);
		int per=s.nextInt();
		if(per>90&&per>=100) {
			System.out.println("your grade is O");
		}
		
		if(per>75&&per>=90) {
			System.out.println("Your grade is A");
		}
		if(per>50&&per>=75) {
			System.out.println("Your grade is B");
		}
		if(per>35&&per>=50){
			System.out.println("Your grade is C");
			
		}
		else {
			System.out.println("Your grade is F");
		}
		
	}
}
