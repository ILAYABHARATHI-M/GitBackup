package wrapperclass;

public class Innerclass {
	//LOCAL INNER CLASS
	private String name;
	String show() {
		System.out.println("IAM OUTER CLASS");
	
		 class saha{
			void show1() {
				System.out.println("sahadevAN");
			}
		 }
			saha s= new saha();
			s.show1();
			return name;
		}

public static void main (String [] args) {

	Innerclass s1=new Innerclass();
	s1.show();
}
}

