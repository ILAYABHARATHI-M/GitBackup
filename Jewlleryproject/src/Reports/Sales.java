package Reports;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Duraijewellery.Chain;



public class Sales {
	String Customername;
	String ModelName;
	int Tagnumber;
	float weight;


	public Sales(String mname, int tag, float weight1, String name) {
		this.ModelName=mname;
		this.Tagnumber=tag;
		this.weight=weight1;
		this.Customername=name;

	}


	@Override
	public String toString() {
		return "Sales ModelName=" + ModelName + ": Tagnumber=" + Tagnumber + ": weight=" + weight+"g : Customername="+Customername ;
	}


	public	static List <Sales > sales=new LinkedList<Sales>();

	public static  void salesReport() throws InterruptedException {
		int a=0;
		Iterator<Sales> itr =sales.iterator();
		while (itr.hasNext()) {
			Thread.sleep(500);
			System.out.println(++a +":" + itr.next());
			

		}
		
	}


}
