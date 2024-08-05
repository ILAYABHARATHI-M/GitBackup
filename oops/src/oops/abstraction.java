package oops;
abstract class Loginpage{
	protected int a;
	private int b;
	abstract void pass();
	abstract  void name();
	void show() {
		System.out.println("sahadevan chelladurai");
	}}
abstract  class user extends Loginpage {
	void pass() {
		System.out.println(++a);
		System.out.println("password");
	}}
	class abstraction extends user {
		void name() {
			System.out.println("name");
		}
	
	public static void main(String[] args) {
		abstraction obj= new abstraction();
		obj.name();
		obj.show();
		obj.pass();
		
	}

	}
