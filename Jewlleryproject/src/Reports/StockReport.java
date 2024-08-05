package Reports;
import java.util.Iterator;
import java.util.Scanner;

import Duraijewellery.*;
public class StockReport   {
	public static void stockReport() {
		Scanner sc =new Scanner(System.in);
		System.out.println("1 for chain|2 for Stud|3 for Ring");
		int a=sc.nextInt();
		if(a==1)
			chainReport();
		else if(a==2)
			studReport();
		else if(a==3)
			ringReport();
		else
			System.out.println("Invalid Input");
	}
   public static void studReport() {
	   Stud s=new Stud();
	   Iterator itr =s.stud.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
   }
   public static void chainReport() {
	   Chain c =new Chain();
	   Iterator itr =c.chain.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
   }
   public static void ringReport() {
	   Ring r=new Ring();
	   Iterator itr =r.ring.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
   }
  
}
