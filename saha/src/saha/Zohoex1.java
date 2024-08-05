package saha;

public class Zohoex1 {
    public Zohoex1(boolean a) {
    	if (a==true) {
    		System.out.println("This is IF part");
    	}
    	else {
    		System.out.println("This is ELSE part");
    	}
    }
    public static void main(String[] args) {
    	Zohoex1 s=new Zohoex1(true);
    	Zohoex1 n=new Zohoex1(false);
	}
}
