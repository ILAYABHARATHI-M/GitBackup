package String;

public class MethodsInString {  
	public static void main(String[] args) {
		String name="SAHADEVAN C";
		String name1="sahadevan c";
		System.out.println("length= "+name.length());// lengthOf method is return type
		
		System.out.println("CharAt();"+name.charAt(4));//charAt method is return type index based value
		
		System.out.println(name.equals(name1));//return type boolean 
		
		System.out.println(name.equalsIgnoreCase(name1));//return type boolean
		
		System.out.println(name.concat(name1));//join to Strings
		
		System.out.println("contains: "+name1.contains("saha"));//return boolean
		
		System.out.println("compare to: "+name.compareTo(name1));//return ascii values //difference of the letters
		
		System.out.println("Index of: " +name.indexOf('S'));//return integer index value
		
		System.out.println("last Index of: " +name.lastIndexOf('A'));//return integer index value
		
		System.out.println(name.substring(4,9));//return type String
		
		System.out.println(name.replace("SAHA", "MAHA"));
		
		System.out.println(name.replaceAll(name1, name));
		name.compareTo("saha");
		System.out.println(name1.toUpperCase());
		System.out.println(name1);
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name1.trim());//trim the first and last empty spaces
		
		char name3[]=name1.toCharArray();//change the string to char data type array
		System.out.println(name3[3]);
		
		System.out.println("Start with : "+name.endsWith("N"));
		
		System.out.println("Ends with: "+name1.endsWith(" C"));
		
		int a=10;
		System.out.println("value of :"+String.valueOf(a)+10);
		
		String d="saha";
		String c= new String("saha").intern();// change heap memory to scp memory so the memory address are same
		
		System.out.println("intern"+(c==d));
		
		System.out.println(c.hashCode());//return the memory address of the reference
		System.out.println(d.hashCode());
		
		System.out.println(c.isEmpty());//if it contains no values return true
		System.out.println("blank"+c.isBlank());//if it contains no character return true
		
		String e[]=name.split("");
		for(String f:e) {
			System.out.println("split" +f);
		}
		
		
		String n="*";
		System.out.println(n);
		System.out.println(n.toUpperCase());
		String Saha="QQWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm!!@#$%^&*()_+-=[]{}|:;''<>?,./";
		String pass="QC";
		System.out.println(Saha.contains(pass));
		
		
		
	}

}
