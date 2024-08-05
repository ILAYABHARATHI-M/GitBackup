package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class Productdetails{
	private int User_Id;
	private int Product_Id;
	private String Product_Name;
	private int Product_Price;

	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public int getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public int getProduct_Price() {
		return Product_Price;
	}
	public void setProduct_Price(int product_Price) {
		Product_Price = product_Price;
	}
	public Productdetails(int User_Id,int Product_Id,String Product_Name,int Product_Price) {
		this. User_Id=User_Id;
		this.Product_Id =Product_Id;
		this. Product_Name=Product_Name;

		this. Product_Price=Product_Price;
	}
	
}

public class Userdetails   {
	private int User_Id;
	private String User_Name;
	private String User_Pass;
	private String User_Mail;
	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getUser_Pass() {
		return User_Pass;
	}
	public void setUser_Pass(String user_Pass) {
		User_Pass = user_Pass;
	}
	public String getUser_Mail() {
		return User_Mail;
	}
	public void setUser_Mail(String user_Mail) {
		User_Mail = user_Mail;
	}

	public Userdetails(int User_Id,	String User_Name,String User_Pass,String User_Mail) {
		this.User_Id = User_Id;
		this.User_Name = User_Name;
		this.User_Pass = User_Pass;
		this.User_Mail = User_Mail;
	}
	
	public static void main(String[] args) {
		ArrayList<Userdetails> Ulist =new ArrayList<>();
		ArrayList<Productdetails> Plist =new ArrayList<Productdetails>();
		Plist.add(new Productdetails(20002,1001,"Cup",15));
		Plist.add(new Productdetails(20005,1003,"Waterbottle",30));
		Plist.add(new Productdetails(20006,1005,"Pickle",20));
		Plist.add(new Productdetails(20007,1004,"Cigarate",15));
		Plist.add(new Productdetails(20002,1007,"Sundal",50));
		Plist.add(new Productdetails(20006,10010,"Muttamass",100));
		Ulist.add(new Userdetails(20001,"Sahadevan","Saha@123","saha123@gmail.com"));
		Ulist.add(new Userdetails(20004,"Prashant","prasa@123","pattu@gmail.com"));
		Ulist.add(new Userdetails(20005,"Varma","varma@123","killervarma@gmail.com"));
		Ulist.add(new Userdetails(20011,"Muni","mtnu@123","nishanthini@gmail.com"));
		Ulist.add(new Userdetails(20021,"Manu","has@123","mysuruu@gmail.com"));
		Ulist.add(new Userdetails(20045,"Aravind","fru@123","pattinampakkam@gmail.com"));
		Ulist.add(new Userdetails(20006,"Yuvaraj","vain@123","sarakuadict@gmail.com"));
		Iterator<Userdetails> itr=Ulist.iterator();
		while (itr.hasNext()) {
			Userdetails u=itr.next();
		
		Iterator<Productdetails> ptr=Plist.iterator();
		while (ptr.hasNext()) {
			Productdetails p=ptr.next();
			
		
		if(p.getUser_Id()==u.getUser_Id()) {
			System.out.println();
			System.out.println("Username: "+u.getUser_Name()+"\nProductName:"+p.getProduct_Name()
			+"\nProduct price:"+p.getProduct_Price()+"\nMail of user :"+u.getUser_Mail()+"");
		}
			}
		}
		



	}

}


