package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Lambdacomparator {
	int StdId;
	String StdName;
	
public Lambdacomparator(int stdId, String stdName) {
		
		StdId = stdId;
		StdName = stdName;
	}
public String  toString() {
	
	return "Student name :"+StdName+" SudentId:    "+ StdId;
}
public static void main(String[] args) {
	
	List <Lambdacomparator> li =new ArrayList<Lambdacomparator>();
	li.add(new Lambdacomparator(1, "saha"));
	li.add(new Lambdacomparator(3, "prashant"));
	li.add(new Lambdacomparator(5, "aravind"));
	li.add(new Lambdacomparator(3, "manu"));
	li.add(new Lambdacomparator(8, "varma"));
	
	
	Comparator<Lambdacomparator>  comp = (i,n)->i.StdId>n.StdId?1:-1;
			Collections.sort(li,comp);
			System.out.println(li);
			Iterator<Lambdacomparator> itr =li.iterator();
			while(itr.hasNext()) {
				//Lambdacomparator la = (Lambdacomparator) itr.next();
				System.err.println(itr.next());
			}
}
}
