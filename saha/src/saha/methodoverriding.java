package saha;

	class A10 {
		static int a=10;
		void show() {
			
			System.out.println("Iam A");
		}
	}
		class B10 extends A10{
			
			void show() {
				a=50;
				System.out.println("Iam B");
			}
	}
		class methodoverriding extends B10{
			
			void show() {
				a=900;
				System.out.println("Iam C");
			}

 
	public static void main(String[] args) {
		methodoverriding s = new methodoverriding();
		    s.show();
		    System.out.println(s.a);
            B10 n = new B10(); 
            System.out.println(n.a);
            
	}
}