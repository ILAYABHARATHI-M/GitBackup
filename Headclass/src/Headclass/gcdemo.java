package Headclass;

public class gcdemo {
	public void finalize() {
		System.out.println("iam garbage collector");
	}
public static void main(String[] args) {
	gcdemo g= new gcdemo();
	g=null;
	System.gc();
	System.out.println(g+"helo");

	System.out.println("..............");
	
}
}
