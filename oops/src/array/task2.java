package array;

import java.util.Arrays;

public class task2 {
	public static void main(String[] args) {
		int a[]= {34,65,76,8787,8664,23244,};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<max) {
				max=a[i];
			}
		}
		System.out.println("minimum value is ="+min+"\nmaximum value is ="+max);
		
	}

}
