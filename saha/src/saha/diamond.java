package saha;

public class diamond {
public static void main(String[] args) {
	for(int i=0;i<=4;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}
		for(int n=0;n<=i;n++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	for(int i=5;i>=0;i--) {
		for (int j=0;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
		for(int n=5;n>=i;n--) {
			System.out.print(" ");
		}
	}
	
	
}
}
