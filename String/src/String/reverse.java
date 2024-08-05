
package String;
import java.util.*;
public class reverse {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	
	System.out.println("Enter a string: ");
	String a=sc.nextLine();
	String b[]=a.split(" ");
	System.out.println("reversed string: ");
	for(int i=0;i<b.length;i++) {
		StringBuilder c  =new StringBuilder(b[i]);
		c.reverse();
		System.out.print(c+" ");
	}
	
}
} 
