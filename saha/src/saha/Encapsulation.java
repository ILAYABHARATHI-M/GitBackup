package saha;
import java.util.Scanner;
 class User {
	private String name;
	private String pass;
	void set_name(String name1) {
		name=name1;
	}
	String get_name() {
		return name;
		
	}
	void set_pass(String pass1) {
		pass=pass1;
	}
	String get_pass() {
		return pass;
	}

}
class Encapsulation extends User{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter name:");
		String n=s1.nextLine();
		Encapsulation r=new Encapsulation();
		r.set_name(n);
		System.out.println("Enter password:");
		String n2=s1.nextLine();
		r.set_pass(n2);
		System.out.println("your name is:"+r.get_name());
		System.out.println("Your password is:"+r.get_pass());
		
	}
}