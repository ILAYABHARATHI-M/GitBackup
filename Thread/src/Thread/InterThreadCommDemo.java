package Thread;



class Customer{
	
	static int amount=5000;
	
	public synchronized void withdraw(int amount) {
		
		if(amount > this.amount) {
			
			System.out.println("Insufficient Balance...");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		this.amount-=amount;
		
		System.err.println("Your balance is "+this.amount);
		System.out.println("Withdraw amount successfull...");
		
		
	}
	
	public synchronized void deposite(int amount) {
		
		System.out.println("Your amount is being deposit...");
		
		this.amount+=amount;
		
		System.out.println("Your amount is deposited...");
		
		
		notifyAll();
	}
	
}

class callDeposite extends Thread{
	
	Customer c;
	
	callDeposite (Customer c){
		
		this.c=c;
		
	}
	
	public void run() {
		
		c.deposite(5000);
		
	}
	
}

class callWithdraw extends Thread{
	
	Customer c;
	
	callWithdraw(Customer c){
		
		this.c=c;
		
	}
	
	public void run() {
		
		c.withdraw(6000);
		
	}
	
}

public class InterThreadCommDemo {
	
	public static void main(String [] args) {
		
		Customer c=new Customer();
		
		callWithdraw withdraw=new callWithdraw(c);
		
		callDeposite deposite=new callDeposite(c);
		
		withdraw.start();
		
		deposite.start();
		
	}

}
