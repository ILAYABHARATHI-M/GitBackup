 package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SqureTask {
	static void  squre (Integer a) {
		
		System.out.println(a*a);
	}
public static void main(String[] args) {
	  List <Integer> li =Arrays.asList(1,2,3,4,5,6,7,8);
	  
	//  Function  < Integer ,Integer  > f= SqureTask :: squre;
	  
//	  for(int i=0;i<li.size();i++) {
//		  
//		  Integer a = f.apply(li.get(i));
//		  System.out.println(a);
//		  
//	  }
	  
	  li.forEach(SqureTask :: squre);
	    
	 
}
}
