package java8;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterTask {
	
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Word: ");
	String a = sc.next();
	char []s=a.toCharArray();
//	String a = "saha";

//	String []s1=a.split("");
//	
//	for(int i=0 ; i<s1.length;i++) {
//		if(i==2) {
//			System.out.print(s1[i].replace("h", ""));
//		}
//		else {
//			System.out.print(s1[i]);
//		}
//	}
//	
//	String s2 = s1[2].replace("h", " ");
//	
//	 
//	String ss=String.valueOf(s);
//	String ss1;
//	for(int i=0;i<s.length;i++) {
//		ss1=Character.toString(s[i]);
//		if(ss.contains(ss1)) {
//			System.out.println("contains value....."+ss);
//		}
//		else {
//			System.out.println("else..."+ss);
//		}
//	}
//	Arrays.sort(s);
	System.out.println(s);
	
	for(int i=0;i<s.length;i++) {
		int count=1;
		for(int j=i+1;j<s.length;j++) {
			if(s[i]==s[j]) {
				count=count+1;
				if(count>1){
					System.out.println(s[i]+" "+count);
				}
				
			}
			
			
		}
		
	}
	
	
	 }
}
