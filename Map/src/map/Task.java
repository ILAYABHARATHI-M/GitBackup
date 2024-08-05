package map;

 class Task1 {
int a=10;
void add1() {
	System.out.println("hi");
}
}
public class Task extends Task1{
	int a=20;
	void add() {
		
//		super.add();
		System.out.println("hello");
	}
	public static void main(String[] args) {
//		Task1 t=new Task();
//		t.add();  
//		System.out.println(t.a);
		int b=0;
//
		int a[] = {1,2,3,4,5,6,7,8};
		while(b<a.length) {
			System.err.print(a[b]+"a");
			b++;
		}
	}
}
