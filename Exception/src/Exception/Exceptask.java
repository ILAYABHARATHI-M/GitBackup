package Exception;
import java.util.*;
class UserException extends Exception{
	public UserException(String data) {
		super(data);
	}
}
class NameException extends UserException{
	public NameException(String data) {
		super(data);	
	}
}
class NumberException extends UserException{
	public NumberException(String data) {
		super(data);
	}
}
class PassException extends UserException{
	public PassException(String data) {
		super(data);
	}
}
class MailException extends UserException{
	public MailException(String data) {
		super(data);
	}
}
class method{
	String Name;
	long PhoneNumber;
	String Pass;
	String Mail;
	char check;
	void inputName() throws NameException {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter your name: ");
		Name =s1.nextLine();
		char check1[]=Name.toCharArray();
		check=check1[0];
		if(!(Character.isUpperCase(check))) {
			throw new NameException("Enter first Alphabet as capital" );
		}
		
	}
	void InputPhoneNumber() throws NumberException {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter your PhoneNumber: ");
		try {
		PhoneNumber=s1.nextLong();
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		String phn=Long.toString(PhoneNumber);
		int n=10;
		
		if(n!=phn.length()) {
			throw new NumberException(" PhoneNumber Should be in 10 digits" );
			
		}
		
	}void Pass() throws PassException{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter your Password: ");
		Pass=s1.nextLine();
		int max=Pass.length();
		int UpperCasecount =0;
		int LowerCasecount=0;
		int SpecialCharactercount=0;
		int Digitcount=0;
		
		
		for(int i=0;i<Pass.length();i++) {
			char c=Pass.charAt(i);
			if(Character.isUpperCase(c))
				UpperCasecount++;
			else if(Character.isDigit(c))
		         Digitcount++;
			else if(Character.isLowerCase(c))
		         LowerCasecount++;
			else if(c=='~'||c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='-'||c=='_'||c=='='||c=='+'||c=='['||c==']'||c=='{'||c=='}'||c==';'||c==':'||c==','||c=='.'||c=='<'||c=='>'||c=='/'||c=='?')
				SpecialCharactercount++;
		}
		if(!(max>=8&&UpperCasecount>=1&&LowerCasecount>=1&&Digitcount>=1&&SpecialCharactercount>=1)) {
			throw new PassException("Password must contain:\none UppercaseLetter\none Lowercaseletter\none Specialcharecter");
		}
		
	}
	void Mail() throws MailException {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter your MailId: ");
		Mail=s1.nextLine();
		String mail=Mail.toLowerCase();
		if(!(mail.contains("@gmail.com"))||mail.contains("@yahoo.com")) {
			throw new MailException("MailId should contain @gmail.com");
		}
	}
	void show() {
		System.out.println("Your Name Is:"+ Name);
		System.out.println("Your PhoneNumber Is:"+ PhoneNumber);
		System.out.println("Your Mail Is:"+ Mail);
		
	}
//	public static void Handle() {
//		
//	}
	void Excep() throws NameException, NumberException, PassException, MailException {
		try {
			inputName();
			}
			catch(NameException e){
				System.out.println(e);
				inputName();

			}
			try {
				InputPhoneNumber();
			}
			catch(NumberException e) {
				System.out.println(e);
				InputPhoneNumber();
			}
			try {
				Pass();
			}
			catch(PassException e) {
				System.out.println(e);
				Pass();
			}
			try {
				Mail();
			}
			catch(MailException e) {
				System.out.println(e);
				Mail();
			}
			show();
	}
}

public class Exceptask  {
	public static void main(String[] args) throws NameException, NumberException, PassException, MailException {
		method s=new method();
		s.Excep();
	}
	

}
