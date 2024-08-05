package saha;
import java.util.Scanner;
public class sibitask1 {
	String name,mob,dept,yr;
	Scanner s=new Scanner(System.in);
	void clg() {
		System.out.println("NAME");
		name=s.nextLine();
		System.out.println("MOB.NO");
		mob=s.nextLine();
		System.out.println("DEPARTMENT");
		dept=s.nextLine();
		System.out.println("YEAR");
		yr=s.nextLine();
		if(dept.equals("ECE")&&yr.equals("1"))
		{
		
			System.out.println("Your fee is 8000\n Your subjects are java and maths");
		}
		if(dept.equals("ECE")&&yr.equals("2"))
		{
	 
			
			System.out.println("Your fee is 10000\n Your subjects are java and maths");
		}
		if(dept.equals("ECE")&&yr.equals("3"))
		{
			
			 System.out.println("Your fee is 12000\n Your subjects are java and maths");
		}

		
		
		
		
	}
	public static void main(String[] args) {
		sibitask1 t=new sibitask1();
		t.clg();
		
	}
	
	

}
