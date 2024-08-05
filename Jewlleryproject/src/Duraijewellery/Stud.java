package Duraijewellery;



import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Scanner;



import Reports.Sales;

public class Stud extends Master {
	String StudModel;
	float StudWeight;
    int Tagnumber;
	public Stud() {}
	public Stud(int Tagnumber ,float StudWeight,String StudModel) {
		this.Tagnumber=Tagnumber;
		this.StudWeight=StudWeight;
		this.StudModel=StudModel;
	}
	@Override
	public String toString() {

		return "Tagnumber: "+Tagnumber + "Weight: " +StudWeight+ "Model: "+ StudModel;

	}

	public static List < Stud> stud =new LinkedList< Stud>();



	public static  void addStud() throws InterruptedException {
		Master m =new Master();
		Scanner sc =new Scanner(System.in);
		System.out.println(" 1 for Add|2 for Menu!!");
		int a =sc.nextInt();
		if (a==1) {
			sc.nextLine();
			System.out.println("Enter model name:");
			String model=sc.nextLine();
			System.out.println("Enter Weight:");
			float weight=0;
			try {
			 weight=sc.nextFloat();
			}
			catch(InputMismatchException e) {
				System.err.println("Invalid input");
				return;
			}
			int tag=++MasterTagnumber;
			stud.add(new Stud (tag,weight,model));
			String s="!!!Item added!!!! Tagnumber="+MasterTagnumber;
			for(int i=0;i<s.length();i++) {
				Thread.sleep(50);
				System.out.print(s.charAt(i));
			    }
			System.out.println();
			addStud();
		}
		else if(a==2)
			return;
	}
	public static void billStud() throws InterruptedException {
		int GST=0;
		int MC=1000;
		int price=0;
		float weight1=0;
		String mname="";
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter Tagnumer:");
		int tag=sc.nextInt();

		Iterator<Stud> itr =stud.iterator();
		while (itr.hasNext()) {
			Stud st=(Stud)itr.next();
			if(tag==st.Tagnumber) {
				price =	(int) ((st.StudWeight*Goldprice)+(st.StudWeight*MC));
				GST =(price*3)/100;

				tag=st.Tagnumber;
				mname=st.StudModel;
				weight1=st.StudWeight;
				System.err.println("Stud model::"+mname+"\nStud weight::"+weight1+"grams"+"\nMakingcharges per gram="+MC);
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
					st.StudModel="";
					st.StudWeight=0;
					st.Tagnumber=0;

				}

			}
			else {
				System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!");
			}


		}

	}
}
