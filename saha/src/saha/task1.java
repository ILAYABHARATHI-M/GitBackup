
package saha;
import java.util.Scanner;


public class task1 {
	Scanner n=new Scanner(System.in);
	String name;
	String password;
	String mail;
	int age;
	void name() {
		System.out.println("Enter your Name:");
		
	     name= n.nextLine();
		
	}
	
	 void age() {
		System.out.println("Enter your Age:");

		age = n.nextInt();
		
		
	}
	
	void email() {
		System.out.println("Enter your Email:");
		mail = n.nextLine();
		
	}
	
	
	void pass() {
		System.out.println("Enter your Password:");
		
		 password = n.nextLine();
		
		
	}
	void data() {
		System.out.println("Your age is:::"+ age);
		System.out.println("your name is:::"+ name);
		System.out.println("Your email is:::"+ mail);
		System.out.println("Your password is:::"+  password);
		
	}
	
	
public static void main(String[] args) {
	task1 na=new task1();
	na.name();
	na.age();
	na.email();
	na.pass();
	na.data();
	}
}
