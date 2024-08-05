package Collection;
import java.util.*;
public class TASK {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		ArrayList<String> ulist=new ArrayList<String> ();
		ulist.add("Sahadevan.c");
		ulist.add("26");
		ulist.add("Male");
		for (int i=1;i<5;i++) {
		System.out.println("Enter your input: ");
		ulist.add(sc.nextLine());
		}
		
		sc.close();
		System.out.println(ulist);
		
	
		System.out.println("\nYour details are showed below :");
		for(int i=0;i<ulist.size();i++)
		System.out.println(ulist.get(i));
		
		
	}

}
