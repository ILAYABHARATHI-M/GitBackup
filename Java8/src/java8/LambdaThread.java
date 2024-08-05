package java8;

public  class LambdaThread  {
	
public static void main(String[] args) {
	Runnable  r = ()-> {for(int i=0;i<=100;i++) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("uniq tech");
	}};
	
	
	//LambdaThread t1= new LambdaThread();
	Thread t= new Thread(r);
	Thread t1= new Thread(r);
	t.setName("saha");
	
	t1.setName("devan");
	
	t.start();
	t1.start();
	
}




}
