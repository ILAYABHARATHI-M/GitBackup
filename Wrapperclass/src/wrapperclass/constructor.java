package wrapperclass;

public class constructor {
	int a;
	int b;
	 constructor() {
		this.a=10;
		this.b=10;
	}
	public void constructor() {
		System.out.println("iam method");
		System.out.println(a+b);
	}
public static void main(String[] args) {
	constructor c=new constructor();
	c.constructor();
}
}
