package saha;

public class Fibonacci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c;
	//System.out.println(a);
	//System.out.println(b);
	for( int i=0;i<=10;i++) {
		c=b+a;
		System.out.print(c+" ");
		a=b;
		b=c;
		
	}
}
}

