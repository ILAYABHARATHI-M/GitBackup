package Thread;
class B extends Thread{
	public void run() {
		System.out.println("hai l");
	}
}
class C extends B{
	public void run() {
		System.out.println("hai ladjkfb");
	}
	
}
public class A  {

 public static void main(String[] args) {

	 B c= new C();
	
	 c.start();
	
}
}
