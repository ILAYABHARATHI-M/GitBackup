package Thread;

 class PrintTable {
	synchronized void print(int a) {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i*a);
		}
	}

}
class ExampleThread1 extends Thread{
	PrintTable ref;
	ExampleThread1 (PrintTable ref){
		this.ref=ref;
	}
	public void run() {
		ref.print(3);
	}
}
class ExampleThread2 extends Thread{
	PrintTable ref;
	ExampleThread2 (PrintTable ref){
		this.ref=ref;
	}
	public void run() {
		ref.print(5);
	}
}


class Mainclass extends Thread{
	
	public static void main(String[] args) {
		PrintTable n= new PrintTable();
		ExampleThread1 n1= new ExampleThread1(n);
		ExampleThread2 n2= new ExampleThread2(n);
		n1.start();
		n2.start();
	}
}