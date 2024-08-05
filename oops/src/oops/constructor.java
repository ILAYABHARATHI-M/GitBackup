package oops;

public class constructor {
	String name;
	String pass;
	public constructor () {
		System.out.println();
	}
	public constructor(String name,String pass) {
		this.name=name;
		this.pass=pass;
		System.out.println(name+"\n"+pass);
	}
	public static void main(String[] args) {
		new constructor("sahadevan.c", "saha@1234");
	}

}
