package saha;
import java.util.*;
public class Table3 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter a number:");
	int a=s.nextInt();
	int num=3;
	for(int i=1;i<=a;i++) {
		int result= num*i;
		int b=result % 10;
		 if(b==5||b==7)
			 continue;
	
		
		System.out.println(num+"*"+i+"="+result);
		
		
	}
}
}
