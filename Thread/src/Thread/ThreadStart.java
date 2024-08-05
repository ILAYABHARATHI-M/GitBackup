package Thread;

public class ThreadStart extends Thread {
	public void run() {
		
		
			try {
				for(int i=0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println("Loading......");
				}
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			
		}
		
		}
		
	
public static void main(String[] args) throws InterruptedException {
	 ThreadStart sa= new ThreadStart();
	 sa.start();
	 sa.setName("sahadevan");
	 for(int i=0;i<20;i++) {
			Thread.sleep(1000);
		 System.out.println(sa.getState());
		 System.out.println("sahadevanchelladurai");
	 }
	
}}
