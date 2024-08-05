package Exception;
import java.util.*;
 class Main {
	private String  Name;
	private long  Phonenumber;
	private String  MailId;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getMailId() {
		return MailId;
	}
	public void setMailId(String mailId) {
		MailId = mailId;
	}
}
	class  Task1EncapusulationAndException extends  Main{
		
	
	
		
	
		 void InputName() {
			 Scanner s1 =new Scanner(System.in);
			 System.out.println("Enter your name:");
			 String a=s1.nextLine();           
			 setName(a);
			
		}
		void InputNumber() {
			 Scanner s1 =new Scanner(System.in);
			 System.out.println("Enter your phone number: ");
			 long ph=s1.nextLong();
			 setPhonenumber(ph);
			
		}
		void InputMailId() {
			 Scanner s1 =new Scanner(System.in);
			 System.out.println("Enter your MailId: ");
			 String ma=s1.nextLine();
			 setMailId(ma);
			
		}
		void Show() {
			System.out.println("Your name is: ");
			System.out.println(getName());
			System.out.println("Your Phone number is: ");
			System.out.println(getPhonenumber());
			System.out.println("Your MailId is: ");
			System.out.println(getMailId());
		}
		void Method() {
			InputName();
			InputMailId();
			try {
				InputNumber();}
			catch(Exception e) {
				System.out.println("!!!!!!!!!Invalid phone number try again!!!!!!!!!!!");
				Method();
			}
			
			Show();
		}
		public static void main(String []args) {
			Task1EncapusulationAndException en=new Task1EncapusulationAndException();
		
		
		
			en.Method();
		
	


}}
