package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Namesorting implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.name.compareToIgnoreCase(o2.name);
	}
	
}

class Sorting  implements Comparator<Student1>{

	@Override
	public int compare(Student1 i, Student1 j) {
		if(i.id<j.id) {
			
		}
		return 0;
	}
	
}
public class Student1 {
	int id;
	String name;
	public Student1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
	public static void main(String[] args) {
		ArrayList<Student1> List = new ArrayList<Student1>();
		List.add(new Student1(12,"saha"));
		List.add(new Student1(22,"prashant"));
		List.add(new Student1(32,"varma"));
		List.add(new Student1(42,"sanaga"));
		List.add(new Student1(15,"ravi"));
		Sorting s= new  Sorting();
		Namesorting n= new Namesorting();
		Collections.sort(List,s);
		System.out.println(List);
		
		for(Student1 L:List)
			System.out.println(L);
		System.out.println();
		Collections.sort(List,n);
		for(Student1 L:List)
			System.out.println(L);
	}

}
