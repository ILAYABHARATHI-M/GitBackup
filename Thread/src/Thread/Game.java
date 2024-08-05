package Thread;
class Takeoff extends Thread{
	synchronized public void run() {
		for(int i=0;i<=4;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Takeoff....");
		}
	}
}
class Landing extends Takeoff{
	synchronized public void run() {
		for(int i=0;i<=4;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Landing....");
		}
	}
	
}
class Running extends Landing{
	synchronized public void run() {
		for(int i=0;i<=49;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running....");
		}
	}
	
}
class Shooting extends Running{
	synchronized public void run() {
		for(int i=0;i<=49;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Shooting....");
		}
	}
	
}
class RunShoot extends Shooting{
	 public void run() {
		for(int i=0;i<=50;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Running....\nShooting");
		}
		System.out.println("WINNER WINNER CHICKEN DINNER ");
		
	}
}
public class Game extends RunShoot {
public static void main(String[] args) throws InterruptedException {
	Takeoff n= new Takeoff();
	Landing n1=new Landing();
	Running n2=new Running();
    Shooting n3= new Shooting();
    RunShoot n4=new RunShoot();
    n.start();
    n.join();
    n1.start();
    n1.join();
    n2.start();
    n2.join();
    n3.start();
    n3.join();
    n4.start();
   
    
    
		
	
}
}
