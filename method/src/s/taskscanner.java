
package s;
import java.util.Scanner;


public class taskscanner {
	void name() {
		System.out.println("Enter your Name:");
		Scanner n=new Scanner(System.in);
		String name= n.nextLine();
	}}
	class A{
	 void age() {
		System.out.println("Enter your Age:");
		Scanner a=new Scanner(System.in);
		int age = a.nextInt();
		
		
	}}
	class B{
	void email() {
		System.out.println("Enter your Email:");
		Scanner e=new Scanner(System.in);
		String email = e.nextLine();
	}}
	class C{
	
	void pass() {
		System.out.println("Enter your Password:");
		Scanner p=new Scanner(System.in);
		String password = p.nextLine();
	}
	
	
public static void main(String[] args) {
	taskscanner na=new taskscanner();
	A ag = new A();
	B em =new B();
	C pa=new C();
	
}
}
