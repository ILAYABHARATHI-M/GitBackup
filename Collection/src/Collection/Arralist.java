package Collection;
import java.util.*;
public class Arralist {
	public static void main(String[] args) {
		ArrayList <Integer> alist=new ArrayList<>();
		alist.add(1);
		alist.add(null);
		alist.add(12);
		alist.add(123);
		alist.add(1234);
		alist.add(null);
		alist.add(12345);
		alist.add(123456);
		alist.add(1234567);
		System.out.println(alist);
		Iterator<Integer> itr=alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator<Integer> litr =alist.listIterator(alist.size());
		while(litr.hasPrevious()) {
			System.out.println();
		}
		if (litr==null) {
			System.out.println("sahadevan");
		}
		else {
			System.out.println("devanc");
		}
		
		
	}

}
