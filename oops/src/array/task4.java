package array;

public class task4 {
   public static void main(String[] args) {
	   int[] a = {1, 2, 3, 4, 5};
       int[] b= new int[a.length];

       for (int i = 0; i < a.length; i++) {
           b[i] = a[i];
       }
       System.out.println("the copied values in b[]: ");
       for (int i = 0; i < a.length; i++) {
    	   System.out.print(b[i]+" ");
       }
}

}
