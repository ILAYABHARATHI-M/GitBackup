package oops1;
interface Vechicle{
	void ride();
}
 class car implements Vechicle{
   public void ride() {
	   System.out.println("Iam riding car");
   }
}
	   
  class Bike implements Vechicle{
	   public void ride() {
		   System.out.println("Iam riding a bike");
	   }
   }
   class mechanic {
	   void check(Vechicle c) {
		   System.out.println(">>>checking>>>>>");
		  c.ride();
	   }
   }
  
   class customer{
	   public static void main(String[] args) {
		   mechanic m=new mechanic();
		
		   car c1 =new car();
		   m.check(c1);
		   Bike b1 =new Bike();
		   m.check(b1);
		
	}
   }


