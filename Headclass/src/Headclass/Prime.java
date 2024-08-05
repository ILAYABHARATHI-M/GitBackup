package Headclass;



public  class Prime {
	String prime(int num){
		String s="";
		int a=num;
		int b=0;
		for(int i=2;i<a-1;i++) {
			if(a%i==0)
			{
				b=1;
			}
		}
		if(b==0) {
			s="Given number is a prime number";
		}
		if(b>0) {
			s="Given number is Not a prime number";
		}
		return s;
	}
}