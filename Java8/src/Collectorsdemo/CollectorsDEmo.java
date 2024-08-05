package Collectorsdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDEmo {
	public static void main(String[] args) {
		List <Integer> li = Arrays.asList(1,2,3,4,5);
		double avgintval =li.stream().collect(Collectors.averagingInt(Integer :: intValue));
		// Another way : double avgintval =li.stream().collect(Collectors.averagingInt(a -> a.intValue()));

		System.out.println(avgintval);

		long count = li.stream().collect(Collectors.counting());
		System.out.println(count); // return the count value stored in the list

		Map<Boolean, List<Integer>> group =li.stream().collect(Collectors.groupingBy(s-> s>3));
		System.out.println(group);//return map so we using map to store the data

		List <String >  colors = Arrays.asList("red","green","blue","yellow","orange","purple");
		Map <Integer ,List<String>> colorgroup =colors.stream().collect(Collectors.groupingBy(String :: length));
		// group by length based on the string
		System.out.println(colorgroup);


		Map <Character ,List <String>> groupbychar =colors.stream().collect(Collectors.groupingBy(s -> s.charAt(1)));
		// group by length based on the Character
		System.out.println(groupbychar);

		//joining  return type  String so we use 

		String join =colors.stream().collect(Collectors.joining("," ," These are the colors"," in this list")); //There three parameters 
		System.out.println(join);// 1 delimiter ,2prefix , 3suffix 

		List <String > mapping = colors.stream().collect(Collectors.mapping(a-> a+ "color", Collectors.toList()));
		// like the map method in the stream but two parameters one for changing the value another for store it to the list
		System.out.println(mapping);

		Optional <Integer> maxval = li.stream().collect(Collectors.maxBy((a,b)-> a>b ? 1:-1));
		System.out.println(maxval);

		// used to find the max and min value returns optional class 

		Optional <Integer> maxval1 = li.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
		// Another way to find NaturelOrder return the ascending order as default
		System.out.println(maxval1);

		Map <Boolean,List<String>> partionmap =colors.stream().collect(Collectors.partitioningBy(s-> s.startsWith("r")));
		// Default key == Boolean we can change the "value"  thats the differnce from GRouping 
		System.out.println(partionmap);


		// reduce the list as per our comments
		Optional <String> reduce =	colors.stream().collect(Collectors.reducing( (s,a) -> s+a));
		System.out.println(reduce);
		
		int sum= li.stream().collect(Collectors.summingInt( Integer :: intValue));
		System.out.println(sum);//Using to sum the Integer LIST // long list = summinglong //Double lidt ==summing double
		
		
		Set <Integer > set = li.stream().collect(Collectors.toSet());
		System.out.println(set); // return a set 
		
		Map<Object, Object> tomap =colors.stream().collect(Collectors.toMap(a-> a.length(), color -> color,(existingval,newVal)-> existingval));
		System.out.println(tomap);

	}

}
