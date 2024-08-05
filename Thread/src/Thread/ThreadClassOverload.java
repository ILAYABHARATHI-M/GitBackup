package Thread;
class Hello    {
	void start() {       //Thread class implements runnable interface
		                   // In thread class has a method called start//start method has implicit method of run:
		run();              //while we call start method in our class it automatically call the current class
	}                        //run method //we need to write a run method in our class
	void run() {
		System.out.println("welcome");
	}
}
public class ThreadClassOverload  extends Hello{
	void run() {
		System.out.println("hi");
	}
public static void main(String[] args) {
	ThreadClassOverload op =new ThreadClassOverload ();
	op.start();
}
}
