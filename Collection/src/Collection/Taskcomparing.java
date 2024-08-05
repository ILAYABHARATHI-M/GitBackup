package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Namesorting1 implements Comparator<Taskcomparing>{

	@Override
	public int compare(Taskcomparing o1, Taskcomparing o2) {
		if(o1.name.charAt((o1.name.length())-1)>o2.name.charAt((o2.name.length())-1))
		return 1;
		else
			return -1;
	}
	
}

class Sort implements Comparator<Taskcomparing> {
	@Override
	public int compare(Taskcomparing i,Taskcomparing j) {
		if(!(i.id%10<j.id%10)) {
			return 1;
		}
		else
			return -1;
		
	}
	
}

public class Taskcomparing {
	
	int id;
	String name;
	public Taskcomparing(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Taskcomparing> List = new ArrayList<Taskcomparing>();
		List.add(new Taskcomparing(12,"saha"));
		List.add(new Taskcomparing(23,"prashantz"));
		List.add(new Taskcomparing(36,"varman"));
		List.add(new Taskcomparing(47,"sanagasree"));
		List.add(new Taskcomparing(15,"ravi"));
		Sort s= new Sort();
		Namesorting1 n= new Namesorting1();
		System.out.println(List);
		System.out.println("Which type sorting u want:");
		String str=sc.next();
		
		if(str.equals("id")) {
		Collections.sort(List,s);
		System.out.println("ID lastdigit wise sorting");
		for(Taskcomparing e:List)
			System.out.println(e);}
		else if(str.equals("name")) {
		System.out.println("\nNAME lastdigit wise sorting");
		Collections.sort(List,n);
		for(Taskcomparing e:List)
			System.out.println(e);
		}

}
	
	
	
}