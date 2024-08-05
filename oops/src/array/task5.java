package array;
import java.util.*;
public class task5 {
	public static void main(String[] args) {
		int sum=0;
		int a[]= new int[5]; 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a five lenth array;");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
			
		}
		
		
		
		System.out.println("The sum of enterd array is"+sum);
	}

}
