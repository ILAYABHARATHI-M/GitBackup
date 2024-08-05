package Collection;
import java.util.*;
public class Q {
	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(1, "shaha");
		m.put(2, "deva");
		m.put(3, "shaha");
		System.out.println(m);
		m.replace(2, "cccc");
		System.out.println(m);
		
//		Queue<Integer> q= new LinkedList();
//		q.add(null);
//		q.clear();
//		q.contains(null);
//		q.element();
//		q.equals(q);
//		q.peek();
////		q.poll();
//		int x=10;
//		int y=x++ ;
//		y+=  ++x;
//		System.out.println(y);
//		byte a=1;
//		byte b=2;
//				byte c=(byte)(a+b);
////				System.out.println(c);
//		int a=10;
//		int b=12;
//		System.out.println(a&b);
//		System.out.println(a|b);
//		
		String s1="saha";
		String s2="SAHA";
		System.out.println(s1==s2);
		String s3=new String("saha");
		String s4=new String("saha");
		System.out.println(s1==s3);
		System.out.println(s1=="saha");
		System.out.println(s2=="SAHA");
		System.out.println(s3=="saha");
		

}}
