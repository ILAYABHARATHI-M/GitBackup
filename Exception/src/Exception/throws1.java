package Exception;

import java.util.*;

class demo {
	static void show()throws ArithmeticException{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
}
public class throws1 {
public static void main(String[] args)  {
	demo s=new demo();
	try {
		s.show();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("dfdfdfdf");
	
}
}
