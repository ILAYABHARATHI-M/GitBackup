package chatgpt;

public class methodoverloading {
	public void method1(long i) {
		System.out.println("Your mobile number is:"+ i);
	}
public void method1(long k,long j) {
	System.out.println("Your mobile number is:"+ k);
	System.out.println("Your mobile number is:"+ j);
	}
	

	public static void main(String[] args) {
		methodoverloading s=new methodoverloading();
		s.method1(123456789,123456745);
	
	
}
}
