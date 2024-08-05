package chatgpt;
import java.util.Scanner;
public class sibitask1 {
	String name,mob,dept,yr;
	Scanner s=new Scanner(System.in);
	void clg() {
		System.out.println("NAME");
		name=s.nextLine();
		System.out.println("MOB.NO");
		mob=s.nextLine();
		System.out.println("DEPATMENT");
		dept=s.nextLine();
		System.out.println("YEAR");
		yr=s.nextLine();
		if(dept.equals("ECE")&&yr.equals("1"))
		{
			if(yr.equals("2"))
			{
				if(yr.equals("3"))
				{
					if(yr.equals("4"))
					{
				
						
						System.out.println("Your fee is 18000\n Your subjects are java and maths");
					}
					
			
					
					System.out.println("Your fee is 12000\n Your subjects are java and maths");
				}
				
				System.out.println("Your fee is 10000\n Your subjects are java and maths");
			}
			
			System.out.println("Your fee is 8000\n Your subjects are java and maths");
		}
		
		
		
		
	}
	
	

}
