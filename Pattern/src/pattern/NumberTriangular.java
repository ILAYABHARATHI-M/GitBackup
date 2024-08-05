package pattern;

public class NumberTriangular {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) 
	{
	for(int j=4;j>=i;j--) 
	{
		System.out.print(" ");
	}	
	for(int a=1;a<=i;a++) 
	{
		System.out.print(" "+i);
	}
	System.out.println();
	}
}
}
