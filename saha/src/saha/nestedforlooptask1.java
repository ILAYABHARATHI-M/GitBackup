package saha;
public class nestedforlooptask1 {
    public static void main(String[] args) {
        int a = 1;
           
        

        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=3; j++) {
            	
                if (a % 2 == 0) {
                    
                    System.out.print("  "); 
                    
                } else {
                     
                    System.out.print(a);
                  
                }
                a++;
            }
            System.out.println(); 
        }}}
    