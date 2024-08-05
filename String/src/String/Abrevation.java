package String;
import java.util.*;
public class Abrevation {public static void main(String[] args) {
	

	Scanner s1=new Scanner (System.in);
	System.out.println("Enter a line: ");
	String a=s1.nextLine();
	String [] sa=a.split(" ");
	char ca[]=new char [sa.length];
	for(int i=0;i<sa.length;i++) {
		ca[i]=sa[i].charAt(0);
		
	}
	System.out.println("Shortcut: ");
	for(int i=0;i<ca.length;i++) {
		System.out.print(ca[i]);
		
	}

}

}