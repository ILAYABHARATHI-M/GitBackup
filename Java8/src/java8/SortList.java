package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	int sort(String a , String b) {
		 if(a.length()>b.length()) {
			 return 1;
		 }
		 else 
		 return -1;
	}
public static void main(String[] args) {
	SortList s= new SortList();
	List<String > li = Arrays.asList("saha","prashanth","dinesh","yuvaraj","aaravind","manu","vickey");
	
	Comparator <String> c= s :: sort;
	Collections.sort(li, c);
	System.out.println(li);
}
}
