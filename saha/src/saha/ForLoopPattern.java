package saha;

public class ForLoopPattern {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=4;j>=0;j--) {
				if(i<j) {
					System.out.print("  ");
				}
				else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}

}
