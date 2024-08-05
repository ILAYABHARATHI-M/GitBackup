package array;

public class task1 {
public static void main(String[] args) {
	int a[]= {1,4,6,7,-1,-3,6,-7,-8,-9,0,0,0};
	int p=0;
	int n=0;
	int z=0;
	System.out.println("positive numbers are:");
	for(int i=0;i<a.length;i++) {
		if(a[i]>0) {
			p++;
			
			System.out.print(a[i]+",");}
		}
	System.out.println();
	System.out.println("Negative numbers are:");
	for(int i=0;i<a.length;i++) {
		 if(a[i]<0) {
			n++;
		
			System.out.print(a[i]+",");
		}}
	System.out.println();
	
     for(int i=0;i<a.length;i++) {
		if(a[i]==0){
			z++;
		
	
		}}
	
	System.out.println();
	System.out.println("positive count is= "+p);
	System.out.println("negative count is= "+n);
	System.out.println("zero count is= "+z);
}
}
