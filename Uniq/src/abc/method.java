package abc;

public class method {
	
	String div(String a,String b)
	{
		return a+b;
	}
	
	int mul()
	{
		int a=100;
		int b=100;
		return a*b;
	}
	
	void sub( int a,int b)
	{
		System.out.println(a+b);
	}

	 void add()
	{
	int a=10;
	int b=20;
	System.out.println(a=b);

	}
	   
	  public static void main(String [] args)
	  {
	    System.out.println("hello world");
	    method s=new method();
	    s.add();
	    s.sub(19, 16);
	    System.out.println(s.mul());
	    System.out.println(s.div("saha", "devan"));
	    
	    



	  
	  }




}
