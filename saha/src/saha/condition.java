
package saha;
import java.util.Scanner;

public class condition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to military selection ");
		System.out.println("Enter your age:");
		int age=s.nextInt();
		System.out.println("Enter your height");
		int height=s.nextInt();
		System.out.println("Enter your weight");
		int weight=s.nextInt();
		System.out.println("Enter your health");
		int health =s.nextInt();
		if(age>22) {
			if (height>=170) {
				if(weight<100) {
					if(health>90) {
						System.out.println("You are eligible to join  military");
						
					}
					else {
						System.out.println("Your health is less than 90 so you are not eligible");
					}
					
					
				}
				else {
					System.out.println("Yout weight greater than 100 so you are not eligible");
				}
				
			}
			else {
				System.out.println("Your height is less than 170 so you are not eligible");
			}
			
		}
		else {
			System.out.println("Your age is less then 22 so you are not eligible");
		}
		
	}

}
