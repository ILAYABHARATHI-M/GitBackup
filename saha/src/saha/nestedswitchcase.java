package saha;
import java.util.*;
public class nestedswitchcase {
	String veg;
	int kg;
	int t_price;
	int o_price;
	
	void vegitable() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter wanted vegitable--onion--or--tomato");
		veg=s.nextLine();
		System.out.println("Enter wanted Kilograms");
		kg=s.nextInt();
		t_price=40;
		o_price=50;
		
		switch(veg) {
		case"onion":
			switch(kg){
			case 1:
				System.out.println("Your amount is"+kg*o_price);
				break;
			case 2:
				System.out.println("Your amount is"+kg*o_price);
				break;
				
			}
		case "tomato":
			switch(kg) {case 1:
				System.out.println("Your amount is"+kg*t_price);
				break;
			case 2:
				System.out.println("Your amount is"+kg*t_price);
				break;
				
			
			}
			default:
				System.out.println("----Wrong input-----");
			
		}
		
	}
public static void main(String[] args) {
	nestedswitchcase t=new nestedswitchcase();
	t.vegitable();
}
}
