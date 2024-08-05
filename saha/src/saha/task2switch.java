package saha;
import java.util.*;
public class task2switch {

	void finder() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		char c=s.next().charAt(2);
		switch(c) {
		case'a':
			System.out.println("a is the vowel in input");
			break;
		case'e':
			System.out.println("a is the vowel in input");
			break;
		case'i':
			System.out.println("a is the vowel in input");
			break;
		case'o':
			System.out.println("a is the vowel in input");
			break;
		case'u':
			System.out.println("a is the vowel in input");
			break;
			default:
				System.out.println("no vowel in third alphabet@ input");
		}
	}
	
	public static void main(String[] args) {
		task2switch t=new task2switch();
		t.finder();
		
	}

}
