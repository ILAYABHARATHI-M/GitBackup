package Duraijewellery;

import java.util.Scanner;

import Reports.Sales;
import Reports.StockReport;

class Master extends StockReport {
	
	static int  Goldprice=6000 ;
	static int MasterTagnumber = 240000;
	
	void add() throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Press 1 Chain| 2 Stud| 3 Ring !");
		int b=sc.nextInt();
		if(b==1)
			Chain.addChain();
		else if(b==2)
			Stud.addStud();
		else if(b==3)
			Ring.addRing();
		else {
			System.err.println("Invalid input try again");
			return;
		}
	}
	void bill() throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Press 1 Chain| 2 Stud| 3 Ring !");
		int c=sc.nextInt();
		if(c==1)
			Chain.billChain();
		else if(c==2)
			Stud.billStud();
		else if(c==3)
			Ring.billRing();
		else {
			System.out.println("Invalid input try again");
			return;
		}
	}
	void report() throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Press 1 SalesReport| 2 StockReport!");
		int d=sc.nextInt();
		if(d==1)
			Sales.salesReport();
		else if(d==2)
		StockReport.stockReport();
		else {
			System.out.println("Invalid input");
		return;
		}
		
	}
	void exit() {
		System.exit(0);
	}
	void changeRate() throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter today GoldRate: ");
		int rate =sc.nextInt();
		Goldprice=rate;
		Thread.sleep(2000);
		System.out.println("$$Rate updated$$");
		start();
	}
	void start() throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		String s="\t\t\t\t Duarai jewelry Pvt Ltd ";
		for(int i=0;i<s.length();i++) {
			Thread.sleep(60);
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String w="Press 0 Rate update |1 for add|2 for Bill|3 to Report|4 to Exit! ";
		for(int j=0;j<w.length();j++) {
			Thread.sleep(30);
			System.out.print(w.charAt(j));
		}
		System.out.println();
		int a=sc.nextInt();
		if (a==0) {
			changeRate();
		}
		else if(a==1) {
			add();
		}
		else if(a==2) {
			bill();
		}
		else if(a==3) {
			report();
		}
		else if(a==4) {
			exit();
		} 
		else {
			System.out.println("Invalid input!!");
		}

		start();  		

	}




	public static void main(String[] args) throws InterruptedException {
		Master m= new Master();
		m.start();

	}
}
