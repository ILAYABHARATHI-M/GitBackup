package map;
import java.util.*;
public class Stringduplicatetask {
public static void main(String[] args) {
	String s= "sahadevan";
	Map<Character,Integer> m =new HashMap<>();
	for(int i=0;i<s.length();i++) {
		m.put(s.charAt(i), i);
	}
	System.out.println(m);
}
}
