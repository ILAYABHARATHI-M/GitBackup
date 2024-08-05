package saha;

public class Zohoexample {
	void show(int a) {
		if(a==1) {
			System.out.println("This is if part");
			 show(0);
		}
		else {
			System.out.println("This is else part");
		}
	}
public static void main(String[] args) {
	 Zohoexample s=new  Zohoexample();
	 s.show(1);
	
	
}
}
