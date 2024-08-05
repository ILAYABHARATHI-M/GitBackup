package String;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first word:");
		String a1=s.next();
		System.out.println("Enter second word:");
		String a2=s.next();
				
		
		
		char [] a=a1.toCharArray();
		Arrays.sort(a);
		
		char [] b=a2.toCharArray();
		Arrays.sort(b);
         if(Arrays.equals(a,b)) {
        	 System.out.println("Given words are Anagram");
         }
         else {
        	 System.out.println("Given words are not Anagram");
         }
}

}
