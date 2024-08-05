package java8;

public class MethodRefThread {
	
	static void thread() throws InterruptedException {
		for(int i=0;i<50;i++) {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName());
			System.out.println(i*1000);
		}
	}
	
   public static void main(String[] args) {
	   
	 Runnable r = () -> {
		try {
			thread();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	 
	 Thread t1 =new Thread(r);
	 Thread t2 =new Thread(r);
	 
	 t1.setName("1111111");t2.setName("2222222");
	 t1.start();
	 t2.start();
}
}
