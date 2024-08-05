package String;
import java.util.*;
public class duplicate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a name : ");
		String na=s.nextLine();
		
		char ch[]=na.toCharArray();
		//System.out.println(ch[0]+" "+ch[1]);
	
		for(int i=0;i<ch.length;i++) {
			int count =1;
			if(ch[i]!='1') {
				for (int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count=count+1;
						ch[j]='1';
					}
				}
				if(count>1) {
					System.out.println("Duplicate value: "+ch[i]+" :"+"count = "+count);
					
				}
			
			
			}
		
			
		
	}
	

}
}