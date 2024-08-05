package saha;
import java.util.*;

class A{
	static int a,b;
}
class B{
	void input() {
		A n=new A();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		n.a=s.nextInt();
		System.out.println("Enter a value:");
		n.b=s.nextInt();
		System.out.println(n.a);
		System.out.println(n.b);
		
	}
}
class C{
	void print() {
		 A n=new A();
	int c=n.a+n.b;
	System.out.println(c);
}}
class taskmethod {
	
	public static void main(String[] args) {
		A n=new A();
		B r=new B();
		C t=new C();
		r.input();
		t.print();
	}

}