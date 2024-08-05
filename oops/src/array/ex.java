package array;
   class ex{
	  int  a[]= {10,50,20,40,30};
	  int b[]=new int[5];
	  int max=0;
	  int l=0;
	  void loop() {
		
		for( l=0;l<a.length;l++) {
			if(a[l]>max) {
				max=a[l];}}}
	  
	  
	void loop2() {			
					b[l]=max;
					max=0;
					a[l]=-1;
					loop();
					
					
					
				
				
			
	
			
		}
	   void show() {
		   
				
				
			for(int i=0;i<5;i++) {
				System.out.print(b[i]+" ");
				
			}
	   }

   
public static void main(String[] args) {
	ex o=new ex();
	o.loop();
	o.loop2();
	o.show();
	
	
	
	
}}
