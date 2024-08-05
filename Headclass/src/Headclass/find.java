package Headclass;
import java.util.*;
public class find {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=s.nextInt();
		Prime p= new Prime();
		System.out.println(p.prime(a));
	}

}
