package pattern;

public class Diomondpattern {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) 
		{
			for(int j=5;j>i;j--) 
			{
				System.out.print("  ");
			}
			for(int k=i;k>0;k--) 
			{
				System.out.print(" *  ");
			}
			
			System.out.println();
		}
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print("  ");
			}
			for(int k=4;k>i;k--) 
			{
				System.out.print("   *");
			}
			System.out.println();
		}
	}

}
