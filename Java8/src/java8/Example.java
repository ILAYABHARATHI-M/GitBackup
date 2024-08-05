package java8;
/*@FunctionalInterface*/
//interface lambda{        // Non return type abstract method
//	String show();
//}
//public class Example {
//	public static void main(String[] args) {
//		
//	
//   lambda l=()-> "dshsdevsn";
//   System.out.println( l.show());
//	}
//}
  
//interface lambda{
//	void show();              //return type abstract method
//}
//public class Example {
//	public static void main(String[] args) {
//		
//	
//   lambda l=()-> System.out.println("dshsdevsn");
//    l.show();
//	
//}}
@FunctionalInterface //Return type with arguments
interface lambda{
	String show(String a,String b);
	 static void add() {
		System.out.println("saha");
		
	}
	 default void show1() {// IN FUNCTIONAL INTERFACE WE CAN ADD DEFAULT AND STATIC METHOD
		 
			System.out.println("sorry");
		}
}
public class Example {
	public static void main(String[] args) {
		
	
   lambda l=(a,s)-> {return a+s;};
    System.out.println(l.show("saha", "devan"));
    lambda.add();
	l.show1();
}}