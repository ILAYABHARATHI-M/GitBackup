package saha;
import java.util.Scanner;

public class task2 {
	Scanner s=new Scanner(System.in);
	int tamil;
	int english;
	int maths;
	int science;
	int sscience;
	int sum;
	int avg;
	
	int total() {
		System.out.println("Enter mark scored in tamil:");
		tamil=s.nextInt();
		System.out.println("Enter mark scored in English:");
		english=s.nextInt();
		System.out.println("Enter mark scored in maths:");
		maths=s.nextInt();
		System.out.println("Enter mark scored in science:");
		science=s.nextInt();
		System.out.println("Enter mark scored in sscience:");
		sscience=s.nextInt();
        sum=(tamil+english+maths+science+sscience);
		System.out.println("Total mark scored ="+sum);
			
		return sum;
		
	}
	
	int average() {
		
		avg=sum/5;
		

		return avg;
	}
	void grade(int avg) {
		
	
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
	public static void main(String[] args) {
		task2 t=new task2();
		t.total();
		 if(t.tamil<35||t.english<35||t.maths<35||t.science<35||t.sscience<35) {
	        	System.out.println("You are failed in one subject \n grade not calculated");
				
			}
		 else {
		t.grade(t.average());
		}
		
		
	}

}
