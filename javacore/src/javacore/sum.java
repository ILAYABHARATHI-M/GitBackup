package javacore;
import java.util.*;
public class sum {
	 int id;
	String name ="";
	public void dis(String Name) {
		id++;
		name=Name;
		System.out.println("NAME="+name+" "+"ID="+id);
	}
public static void main(String[] args) {
   sum s=new sum();
   s.dis("saha");
   System.exit(0);
   s.dis("devan");
}
}
