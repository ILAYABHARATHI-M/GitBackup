package javacore;

public class SecondLargest {
public static void main(String[] args) {
	int temp=0;
     int [] a = {1,23,56,67,8,58,4,34};
     for(int i=0;i<a.length-1;i++) {
    	 for(int j=i+1;j<a.length-1;j++) {
    		 if(a[i]<a[j]) {
    			temp =a[j];
    			a[j]=a[i];
    			a[i]=temp;
    			
    		 }
    	 }
     }
    // for(int k=0;k<a.length-1;k++) {
    	 System.out.println("Second largest number: "+a[1]);
    	 
    // }
}
}
