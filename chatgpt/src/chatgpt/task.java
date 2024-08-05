package chatgpt;
import java.util.*;
class school {
	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int S_Science;
	private int tot;
	static int avg;
	private int grade;
	
	
	
  public int getTamil() {
		return Tamil;
	}



	public void setTamil(int tamil) {
		Tamil = tamil;
	}



	public int getEnglish() {
		return English;
	}



	public void setEnglish(int english) {
		English = english;
	}



	public int getMaths() {
		return Maths;
	}



	public void setMaths(int maths) {
		Maths = maths;
	}



	public int getScience() {
		return Science;
	}



	public void setScience(int science) {
		Science = science;
	}



	public int getS_Science() {
		return S_Science;
	}



	public void setS_Science(int s_Science) {
		S_Science = s_Science;
	}



	public int getTot() {
	
			tot=Tamil+English+Maths+Science+S_Science;
			
		return tot;
	}



	public void setTot(int tot) {
		this.tot = tot;
	}



	public int getAvg() {
		return avg;
	}



	public void setAvg(int avg1) {
		avg = avg1;
	}



	
	
	public int avg() {
		
		 avg=getTot()/5;
		return avg;
	}
	public void grade() {
		
			
			
			if(avg>90&&avg<=100) {
				System.out.println("\n\n\nyour grade is O");
			}
			
			if(avg>75&&avg<=90) {
				System.out.println("\n\n\nYour grade is A");
			}
			if(avg>50&&avg<=75) {
				System.out.println("\n\nYour grade is B");
			}
			if(avg>35&&avg<=50){
				System.out.println("\n\n\nYour grade is C");
				
			}
			if(avg<35) {
				System.out.println("\n\n\nYour grade is F");
			}
		}
	}


	public class task extends school{
public static void main(String[] args) {
	task e=new task();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter marks scored in Tamil:");
	int t=s.nextInt();
	e.setTamil(t);
	System.out.println("Enter marks scored in English:");
	int en=s.nextInt();
	e.setEnglish(en);
	System.out.println("Enter marks scored in Maths:");
	int m=s.nextInt();
	e.setMaths(m);
	System.out.println("Enter marks scored in Science:");
	int sc=s.nextInt();
	e.setScience(sc);
	System.out.println("Enter marks scored in Socialscience:");
	int ss=s.nextInt();
	e.setS_Science(ss);
	System.out.println("Total marks scored"+e.getTot());
	System.out.println("Average marks scored"+e.avg());
	e.grade();
	

	}}
