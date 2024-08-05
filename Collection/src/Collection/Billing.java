package Collection;
import java.util.*;
public class Billing {
	static int bottle=10;
	static int chips=10;
	static int pickle=10;
	static int glass=10;
	
	
	Scanner sc =new Scanner(System.in);
	void execute() {
		System.out.println("Enter any key to continue \n");
		System.out.println("1 for add stock : 2 for bill : 3 for exit");
		int a=sc.nextInt();
		if(a==1) {
			add();
		}
		else if(a==2) {
			bill();
		}
		else if(a==3) {
			exit();
		}
		else {
			System.out.println("Invalid input");
		}
		execute();
		
	}
	void add() {
		System.out.println("Which  U want to add ");
		System.out.println(" B for bottle \n C for chips \n P for pickle \n G for glass ");
		char a=sc.next().charAt(0);
		switch(a) {
		case 'B':
			addBottle();
			break;
		case 'C':
			addChips();
			break;
		case 'P':
			addPickle();
			break;
		case 'G':
			addGlass();
			break;
			default:
				System.out.println("invalid input");
			
		}
	}
	  private void addGlass() {
		  System.out.println("Enter the quantity to add ");
		  int a=sc.nextInt();
		  glass =glass+a;
		  System.out.println(" successfull "+" current stock "+glass);
	
		
	}
	private void addPickle() {
		  System.out.println("Enter the quantity to add ");
		  int a=sc.nextInt();
		  pickle =pickle+a;
		  System.out.println(" successfull "+" current stock "+pickle);
		
	}
	void addChips() {
		  System.out.println("Enter the quantity to add ");
		  int a=sc.nextInt();
		  chips =chips+a;
		  System.out.println(" successfull "+" current stock "+chips);
		
	}
	void addBottle() {
		  System.out.println("Enter the quantity to add ");
		  int a=sc.nextInt();
		  bottle =bottle+a;
		  System.out.println(" successfull "+" current stock "+bottle);
		
	}
	void bill() {
		System.out.println("Which  U want to Bill ");
		System.out.println(" B for bottle \n C for chips \n P for pickle \n G for glass ");
		char a=sc.next().charAt(0);
		switch(a) {
		case 'B':
			billBottle();
			break;
		case 'C':
			billChips();
			break;
		case 'P':
			billPickle();
			break;
		case 'G':
			billGlass();
			break;
			default:
				System.out.println("invalid input");
		}
		
	
	}
	 void billGlass() {
		  System.out.println("Enter the quantity to Bill ");
		  int a=sc.nextInt();
		  glass =glass-a;
		  System.out.println(" successfull "+" current stock "+glass);
		
	}
	 void billPickle() {
		  System.out.println("Enter the quantity to Bill ");
		  int a=sc.nextInt();
		  pickle =pickle-a;
		  System.out.println(" successfull "+" current stock "+pickle);
		
	}
	 void billChips() {
		  System.out.println("Enter the quantity to Bill ");
		  int a=sc.nextInt();
		  chips =chips-a;
		  System.out.println(" successfull "+" current stock "+chips);
		
	}
	 void billBottle() {
		  System.out.println("Enter the quantity to Bill ");
		  int a=sc.nextInt();
		  bottle =bottle-a;
		  System.out.println(" successfull "+" current stock "+bottle);
		
	}
	void exit() {
		System.err.println("Thank you  ");
		System.exit(3);
	}
	public static void main(String[] args) {
		Billing b =new Billing();
		b.execute();
		
	}

}
