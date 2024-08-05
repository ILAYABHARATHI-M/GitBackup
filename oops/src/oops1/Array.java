package oops1;
import java.util.*;
public class Array {
	int a[]= {1,2,3,4,5,6};
	String s[]= {"saha","devan"};
	int b[]=new int[5];
	
	public static void main(String[] args) {
		Array n=new Array();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for b");
		n.b[2]=s.nextInt();
		
		System.out.println(n.a[1]);
		System.out.println(n.s[1]);
		
		System.out.println(n.b[2]);
	}

}
