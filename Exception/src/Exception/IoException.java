package Exception;
import java.io.*;
import java.util.*;
public class IoException {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		System.out.println("Enter current year: ");
		int b=s.nextInt();
		System.out.println("Enter your birth year: ");
		int c=s.nextInt();
		int d=b-c;
		System.out.println("Your age in " +b+":"+ d);
		}
		catch(Exception o) {
			System.out.println("!!!!!!!!invalid input!!!!!!!");
		}
		
	}

}
