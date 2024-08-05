package String;

import java.util.*;
public class anypalindrome {
	static int i=0; 
	 String na;
	 String na2;
	 String na3;
	 int l;
	char c;
	void input() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a name: ");
		na=s1.next();
		System.out.println(na);
		na2=na.substring(1, na.length());
		na3="";
		
		l=na2.length();
		char c='a';
		loop(na2);
		
	
		
	
	}
	void loop(String na2 ) {
		if(i<l) {
			char c;
			c=na2.charAt(i);
			this.na3=c+na3;
			i++;
			loop(na2);
			
		}
	
		}
		
		
	
	
	public static void main(String[] args) {
		anypalindrome obj=new anypalindrome();
		obj.input();
//		obj.loop();
		System.out.println(obj.na3);
		System.out.println(obj.na3+obj.na);
		
		
	}

}
