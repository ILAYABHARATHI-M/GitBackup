package java8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo2 {
	

	
		
		public static void main(String[] args) {
			
			@SuppressWarnings("rawtypes")
			List<String> list=Arrays.asList("uniq","hello");
			List list1=Arrays.asList("uniq","hello",'u',98);
			@SuppressWarnings("rawtypes") 
			List list2=Arrays.asList("tom",87,9.8,"jerry");
			@SuppressWarnings("rawtypes")
			List list3=Arrays.asList("a",'b',1234,"d");
			
			@SuppressWarnings({ "unchecked", "rawtypes" })
			List<List<Object>> alllist=new LinkedList(Arrays.asList(list1,list2,list3));
			
			System.out.println(alllist);
			
			@SuppressWarnings("rawtypes")
			List finallist= alllist.stream().flatMap((fm) -> fm.stream()).collect(Collectors.toList());
			
			System.out.println(finallist);
			
			System.out.println(list.stream().anyMatch(a -> a.startsWith("u")));
			System.out.println(list.stream().allMatch(a -> a.startsWith("u")));
		
			List<String> list4=Arrays.asList("uniq","hello","welcome");
			
			Optional<String> op=finallist.parallelStream().findFirst();
			System.out.println(op);
			
			Optional<String> op1=list4.stream().findFirst();
			System.out.println(op1);
			
			Optional<String> op2=list4.stream().reduce((a,b) -> a+","+b);
			
			System.out.println(op2);
			
			List<Integer> list5=Arrays.asList();
			
			Integer op3=list5.stream().reduce(12,(a,b) -> a+b);
			
			System.out.println(op3);
			
		}

	}

