package saha;

import java.util.Scanner;

public class task3 {
	String name,mob,dept,year;
	Scanner s=new Scanner(System.in);
 void detail(String dept ,String year ) {
		System.out.println("Enter Name:");
		name=s.nextLine();
		System.out.println("Enter Mobilenumber:");
		mob=s.nextLine();
		System.out.println("Enter department(ECE|EEE|CSE|MECH):");
		dept=s.nextLine();
		System.out.println("Enter year:");
		year=s.nextLine();
		if (dept.equals("ECE")) {
			if(year.equals("1")) {
				System.out.println("Your fee is 8000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("ECE")) {
			if(year.equals("2")) {
				System.out.println("Your fee is 10000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("ECE")) {
			if(year.equals("3")) {
				System.out.println("Your fee is 12000\nyour subjects are java and maths");
			}
		}
		
		if (dept.equals("ECE")) {
			if(year.equals("4")) {
				System.out.println("Your fee is 18000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("EEE")) {
			if(year.equals("1")) {
				System.out.println("Your fee is 8000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("EEE")) {
			if(year.equals("2")) {
				System.out.println("Your fee is 10000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("EEE")) {
			if(year.equals("3")) {
				System.out.println("Your fee is 12000\nyour subjects are java and maths");
			}
		}
		
		if (dept.equals("EEE")) {
			if(year.equals("4")) {
				System.out.println("Your fee is 18000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("CSE")) {
			if(year.equals("1")) {
				System.out.println("Your fee is 8000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("CSE")) {
			if(year.equals("2")) {
				System.out.println("Your fee is 10000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("CSE")) {
			if(year.equals("3")) {
				System.out.println("Your fee is 12000\nyour subjects are java and maths");
			}
		}
		
		if (dept.equals("CSE")) {
			if(year.equals("4")) {
				System.out.println("Your fee is 18000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("MECH")) {
			if(year.equals("1")) {
				System.out.println("Your fee is 8000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("MECH")) {
			if(year.equals("2")) {
				System.out.println("Your fee is 10000\n your subjects are java and maths");
			}
		}
		
		if (dept.equals("MECH")) {
			if(year.equals("3")) {
				System.out.println("Your fee is 12000\nyour subjects are java and maths");
			}
		}
		
		if (dept.equals("MECH")) {
			if(year.equals("4")) {
				System.out.println("Your fee is 18000\n your subjects are java and maths");
			}
		}
		
	}
 
 
 public static void main(String[] args) {
	task3 a=new task3();
	a.detail(a.dept,a.year);
	
}
	
}