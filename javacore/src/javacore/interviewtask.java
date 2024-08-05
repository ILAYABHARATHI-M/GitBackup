package javacore;

public class interviewtask {
public static void main(String[] args) {
	int [] a = {2,4,6,9,10};
	for(int i=0;i<a.length;i++) {
		if(a[i]%3==0) {
			a[i]=a[i]-a[i]*2;
		}
		else if(a[i]%2==0) {
			a[i]=a[i]*2;
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	
}
}
