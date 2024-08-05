package javacore;
class dec{
	int a;
	int b;
	int c;
	public dec(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
class sumdef{
	dec s=new dec(20,30,40);
	int d=s.a+s.b;
	int e=(s.a+s.b)*s.c/d;
	int f=(s.a*s.b)/(s.b+s.a);
	void show() {
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
public class sstask1 {
	public static void main(String[] args) {
		sumdef n=new sumdef();
		n.show();
	}

}
