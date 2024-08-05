package Duraijewellery;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Reports.Sales;

public class Ring extends Master {
    int Tagnumber;
	String RingModel;
	float RingWeight;
	public Ring(int Tagnumber ,float RingWeight,String RingModel) {
		this.Tagnumber=Tagnumber;
		this.RingWeight=RingWeight;
		this.RingModel=RingModel;
	}
	public Ring() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {

		return "Tagnumber: "+Tagnumber + "Weight: "+RingWeight+"Modelname: " +RingModel;

	}

	public static	List <Ring > ring =new LinkedList<Ring>();



	public static void  addRing() throws InterruptedException {
		Master m =new Master();
		Scanner sc =new Scanner(System.in);
		System.out.println(" 1 for Add|2 for Menu!!");
		int a =sc.nextInt();
		if (a==1) {
			sc.nextLine();
			System.out.println("Enter Modelname");
			String model=sc.nextLine();
			float weight=0;
			try {
			System.out.println("Enter Weight:");
			weight=sc.nextFloat();
			}
			catch(InputMismatchException e) {
				System.err.println("Invalid input");
				return;
			}
			int tag=++MasterTagnumber;
			ring.add(new Ring (tag,weight,model));
			String s="!!!Item added!!!! Tagnumber="+MasterTagnumber;
			for(int i=0;i<s.length();i++) {
				Thread.sleep(50);
				System.out.print(s.charAt(i));
			    }
			System.out.println("Tagnumber="+MasterTagnumber);
			addRing();
		}
		else if(a==2)
			return;
	}
	public static void billRing() throws InterruptedException {
		int GST=0;
		int MC=1200;
		int price=0;
		float weight1=0;
		String mname="";
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Tagnumer:");
		int tag=sc.nextInt();

		Iterator<Ring> itr =ring.iterator();
		while (itr.hasNext()) {
			Ring ri=(Ring)itr.next();
			int tag1=(int)ri.Tagnumber;
			if(tag==tag1) {
				price =	(int) ((ri.RingWeight*Goldprice)+(ri.RingWeight*MC));
				GST =(price*3)/100;

				tag=ri.Tagnumber;
				mname=ri.RingModel;
				weight1=ri.RingWeight;
				System.err.println("Ring model::"+mname+"\nRing weight::"+weight1+"grams"+"\nMakingcharges per gram="+MC);

				System.err.println("Price="+"Rs "+price);
				System.err.println("GST="+GST);
				System.err.println("TOTAL Price="+"Rs "+(price+GST));
				sc.nextLine();
				System.out.println("Enter Customername:");
				String name= sc.nextLine();
				System.out.println("Enter 1 to genarate bill");
				int key=sc.nextInt();
				if(key==1) {
					String s="!!Bill genarated !!";
					for (int i=0;i<s.length();i++) {
						Thread.sleep(50);
						System.out.print(s.charAt(i));
					}
					Sales b= new Sales(mname, tag, weight1, name);
					Sales.sales.add(b);
					ri.RingModel="";
					ri.RingWeight=0;
					ri.Tagnumber=0;
							
				}

			}
			else {
				System.err.println("!!!!!!!!!!!!!!!!!!");
			}

		}

	}
}


