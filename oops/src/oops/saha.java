package oops;
import java.util.*;
interface Headoffice{
	int logintime=10;
	void type_of_work();
	void dress_code();
	void exit_time();
	
}
interface Branchoffice {
	
	void type_of_work();
	void dress_code();
	void exit_time();
	
}
 class dinesh implements Headoffice,Branchoffice {
	public void type_of_work() {
		System.out.println("Work from home");
	}
	public void dress_code() {
		System.out.println("casuals  wear");
	}
	public void exit_time() {
		System.out.println("Anytime he wants");
	}
 }
 public  class saha implements Headoffice,Branchoffice {
	public void type_of_work() {
		System.out.println("Work from office");
	}
	public void dress_code() {
		System.out.println("Normal wear");
	}
	public void exit_time() {
		System.out.println("After 6pm");
	}
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name:");
		String a=s1.nextLine();
		saha s=new saha();
		dinesh n=new dinesh();
		switch(a) {
		case"Dinesh":
			n.type_of_work();
		    n.exit_time();
		    n.dress_code();
		    break;
		case"dinesh":
			n.type_of_work();
		    n.exit_time();
		    n.dress_code();
		    break;
		case"DINESH":
			n.type_of_work();
		    n.exit_time();
		    n.dress_code();
		    break;
		case"saha":
			s.type_of_work();
		    s.exit_time();
		    s.dress_code();
		    break;
		case"Saha":
			s.type_of_work();
		    s.exit_time();
		    s.dress_code();
		    break;
		case"SAHA":
			s.type_of_work();
		    s.exit_time();
		    s.dress_code();
		    break;
		    default:
		    	System.out.println("Invalid input");
		    
		}
	}

}
