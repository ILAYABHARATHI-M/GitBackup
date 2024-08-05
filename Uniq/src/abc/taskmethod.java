package abc;

public class taskmethod {
	void sub()
	{
		int a =10;
		int b = 12;
		System.out.println(a+b);
	}
	void add(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void main(String [] args) {
		taskmethod s=new taskmethod();
		
		s.sub();
	}

}
