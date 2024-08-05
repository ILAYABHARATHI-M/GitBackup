package oops;
import java.util.*;
abstract class A{
	private String Name;
	private String Pass;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	
	abstract public void show();
	
	
}
public class task extends A{
	public void show() {
		task o =new task();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name:");
		String a=s.nextLine();
		o.setName(a);
		System.out.println("Enter pass:");
		String b=s.nextLine();
		o.setPass(b);
		System.out.println(o.getName());
		System.out.println(o.getPass());
		
	}
	
	public static void main(String[] args) {
		task r =new task();
		r.show();
		
		
		
		
	}

}
