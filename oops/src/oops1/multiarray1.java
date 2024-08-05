package oops1;
import java.util.*;
public class multiarray1 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter values");
		int r=3;
		int c=3;
		int a [][] =new int[r][c];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextInt();
				
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
	}
			System.out.println();

}
}}