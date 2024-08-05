package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTask {
	
	static boolean isPrime(long number) {
		for(long i=2;i<=number/2;i++) {
			if(number%i==0)
				return false;

		}
		return true;
	}

	public static void main(String[] args) {

		List <Integer> li =Arrays.asList(2,3,4,5,6,7,8,17);
		Stream <Integer > s = li.stream();
		int sum=  s.filter(n-> n%2==0).mapToInt(n -> n*n).sum();
		System.out.println(sum);
		
		
		
		Stream <Integer > s1 = li.stream();
		long count =  s1.filter(StreamTask :: isPrime).count();
		System.out.println(count);
	}
}
