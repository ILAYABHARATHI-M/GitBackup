package saha;
import java.util.Scanner;
public class task1switch {
	byte m;
	void print() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to get its month:");
		m=s.nextByte();
		
		switch(m) {
		case 1:
			System.out.println("------January");
			break;
		case 2:
			System.out.println("------February");
			break;
		case 3:
			System.out.println("------March");
			break;
		case 4:
			System.out.println("-------April");
			break;
		case 5:
			System.out.println("-------may");
			break;
		case 6:
			System.out.println("--------June");
			break;
		case 7:
			System.out.println("--------July");
			break;
		case 8:
		    System.out.println("---------August");
		    break;
		case 9:
			System.out.println("---------Septemper");
			break;
		case 10:
			System.out.println("----------October");
			break;
		case 11:
			System.out.println("----------November");
			break;
		case 12:
			System.out.println("----------December");
			break;
			default:
				System.out.println("----------Invalid input---------");
		}
	}
	public static void main(String[] args) {
		task1switch t=new task1switch();
		t.print();
	}
	

}
