package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamDemo {
public static void main(String[] args) {
	List<Integer>  values = Arrays.asList(1,3,234,66,43,12,12,21,21,21,12,12,12,12,4,7,85);
         
	Stream <Integer> data =values.stream();
//	System.out.println(data.count());
	//data.filter(n-> n%2==0).forEach(n-> System.out.println(n));
	//List <Integer > Llist =data.skip(4).collect(Collectors.toList());
	//System.out.println(Llist);
	//List <Integer > Llist =data.limit(5).collect(Collectors.toList());
	//System.out.println(Llist);
	//data.map(n-> n*2).forEach(n-> System.out.println(n));
	//List <Integer > Llist =data.sorted().collect(Collectors.toList());
	//System.out.println(Llist);
	//List <Integer > Llist =data.sorted((n, x)->(n>x)?-1:1).collect(Collectors.toList());
	//System.out.println(Llist);
	//List <Integer > Llist =data.sorted((n, x)->(n>x)?-1:1).distinct().collect(Collectors.toList());
	//System.out.println(Llist);
	 //Integer  L=data.sorted((n, x)->(n>x)?-1:1).min((n,x)-> (n>x)?-1:1 ).get();
	//System.out.println(L);
	
	List <Integer > list =new ArrayList<Integer>();
	list.add(1);
	list.add(3);
	list.add(4);
	list.add(6);
	list.add(6);
	list.add(9);
	list.add(12);
	list.add(23);
	list.add(567);
	
	Stream <Integer > data1 = list.stream();
	
   // List <Integer > List1 =	data1.filter(n-> n%2==0).collect(Collectors.toList());
   // System.out.println(List1);
	
   //	data1.map(n-> n*2).forEach(n-> System.out.println(n));;
		
   // data1.distinct().forEach(n-> System.out.println(n));
	

	
}

}
