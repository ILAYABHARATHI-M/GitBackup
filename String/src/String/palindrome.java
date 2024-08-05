package String;
import java.util.*;
public class palindrome {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String a=s.next();
		String b="";
		char c;
		for(int i=0;i<a.length();i++) {
			c=a.charAt(i);
			b=c+b;
			
		}
	
		if(a.equals(b)) {
			System.out.println("given word is palindrome");
			
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
