package array;

public class task3 {
	public static void main(String[] args) {
        String [] a = {"1","1","2","3","4","4","3","2"};

       
        for (int i = 0; i < a.length; i++) {
            int count = 1;

     
            if (a[i] != "a") {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
        
                        a[j] = "a";
                    }
                }

         
                if (count > 1) {
                    System.out.println("Duplicate value: " + a[i] + " - Count: " + count);
                }
            }
        }
    }
}