package oops1;
class A{
	void show() {
		int a=10;
		System.out.println("iam A");
	}
}
public class binding extends A {
	void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
public static void main(String[] args) {
	A n= new binding();//dynamic binding
	n.show();
	binding b =new binding();//sstatic bindinf
	
	b.add();
	b.show();
}
}
