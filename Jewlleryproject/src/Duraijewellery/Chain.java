package Duraijewellery;
import Reports.Sales;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Chain extends Master {
	String chainModel ;
	float ChainWeight;
	int Tagnumber;
	public Chain(int Tagnumber ,float ChainWeight,String ChainModel) {
		this.Tagnumber=Tagnumber;
		this.ChainWeight=ChainWeight;
		this.chainModel=ChainModel;
	}
	public Chain() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {

		return "Tagnumber: "+ Tagnumber + "Weight: "+ChainWeight+"Model: "+chainModel ;

	}

	public	static List <Chain > chain =new LinkedList<Chain>();

	public static void addChain() throws InterruptedException {
		Master m =new Master();
		Scanner sc =new Scanner(System.in);
		String w="1 for Add|2 for Menu!!";
		for(int j=0;j<w.length();j++) {
			Thread.sleep(50);
			System.out.print(w.charAt(j));
		}
		System.out.println();
		int a =sc.nextInt();
		if (a==1) {
			sc.nextLine();
			System.out.println("Enter Model name:");
			String model= sc.nextLine();
			float weight=0;
			try {
			System.out.println("Enter Weight(In grams):");
			 weight=sc.nextFloat();
			}
			catch(InputMismatchException e) {
				System.err.println("Invalid input");
				return;
			}
			int tag=++MasterTagnumber;
			chain.add(new Chain (tag,weight,model));
			Thread.sleep(1000);
			String s="!!!Item added!!!! Tagnumber="+MasterTagnumber;
			for(int i=0;i<s.length();i++) {
				Thread.sleep(40);
				System.out.print(s.charAt(i));
				
			    }
			System.out.println();
			addChain();
		}
		else if(a==2)
			return;
	}
	public static void billChain() throws InterruptedException {
		int GST=0;
		int MC=1000;
		int price=0;
		float weight1=0;
		String mname="";
		Scanner sc =new Scanner(System.in);
        //System.out.println(chain);
		System.out.println("Enter Tagnumer:");
		int tag=sc.nextInt();

		Iterator<Chain> itr =chain.iterator();
		while (itr.hasNext()) {
			Chain ch=(Chain)itr.next();
			if(tag==ch.Tagnumber) {
				price =	(int) ((ch.ChainWeight*Goldprice)+(ch.ChainWeight*MC));
				GST =(price*3)/100;

				int tag2=ch.Tagnumber;
				mname=ch.chainModel;
				weight1=ch.ChainWeight;
				System.err.println("Chain model::"+mname+"\nChain weight::"+weight1+"grams"+"\nMakingcharges per gram="+MC);

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
					
					Sales b= new Sales(mname, tag2, weight1, name);
					Sales.sales.add(b);
					ch.chainModel="";
					ch.ChainWeight=0;
					ch.Tagnumber=0;
					
					
				}

			}
			else {
				System.err.println("!!!!!!!!!!!!!!!!!!!!");
			}
			

		}

	}
}


