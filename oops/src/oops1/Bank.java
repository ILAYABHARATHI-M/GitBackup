package oops1;
import java.util.*;
interface transaction{
  void deposit();
  void withdraw();

}

public class Bank implements transaction {
	 static int balance=5000;
	void operation() {
		System.out.println("!!!!!Welcome to East indian bank!!!!!!!");
		System.out.println("Enter a key(D-to deposit)(W-to withdraw):");
		Scanner s= new Scanner(System.in);
		String o=s.next();
		if(o.equals("W")) {
			withdraw();
		}
		else if(o.equals("D")) {
			deposit();
		}
		else {
			System.out.println("Invalid input try again");
			operation();
		}
		
	}
	public void deposit() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter amount to deposit:");
		int a=s.nextInt();
		balance=balance+a;
		System.out.println("!!!!!!!Deposit successfull!!!!! /n/n Your updated balance is  "+balance);
		operation();
		
	}
	public void withdraw() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter amount to widthdraw:");
		int a=s.nextInt();
		if(balance>a) {
		balance=balance-a;
		System.out.println("!!!!!!!Deposit successfull!!!!! /n/n Your updated balance is  "+balance);
		}
		else if(balance<a) {
			System.out.println("Your available balance is insufficiant ");
		}
		else {
			System.out.println("Invalid input type");
			operation();
		}
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.operation();
		
	}
}
