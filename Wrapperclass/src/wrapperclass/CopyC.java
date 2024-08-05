package wrapperclass;

public class CopyC {
	String name ;
	String pass;
	public CopyC(String name,String pass) {
		this.name=name;
		this.pass=pass;
		System.out.println(name);
		System.out.println(pass);
	}
	public CopyC(CopyC ref) {
	name=ref.name;
	name=ref.name;
	name="hi";
	pass="hello";
	System.out.println(name+" "+pass);

	}

	public static void main(String[] args) {
	    CopyC ref =new CopyC("saha","devan");
	    CopyC  ref2 =new CopyC(ref);
	    
	    System.out.println(ref.name+" "+ref.pass);
	    

}}
