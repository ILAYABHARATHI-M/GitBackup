package pattern;

public class ReverseincreasePattern {
public static void main(String[] args) {
	for(int i=0;i<4;i++)
	{
		for(int j=3;j>i;j--) 
		{
			System.out.print("  ");
		}
		for(int a=0;a<=i;a++) 
		{
			System.out.print("* ");
		}
		System.out.println();
	}                                                                   
}
}
