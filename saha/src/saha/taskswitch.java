package saha;
import java.util.Scanner;

public class taskswitch {
	String w;
	void days() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a day to check :");
		w=s.nextLine();
		switch(w){
		case"monday":
		case"tuesday":
		case"wednesday":
		case"thursday":
		case"friday":
			System.out.println("Its a weekday");
			break;
		case"saturday":
		case"sunday":
			System.out.println("Its a weekend");
			break;
			
		}
	}
	
	public static void main(String[] args) {
		taskswitch t=new taskswitch();
		t.days();
		
	}

}
