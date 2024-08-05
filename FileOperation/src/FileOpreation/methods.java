package FileOpreation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class methods {
public static void main(String[] args) throws IOException {
	File f1 =new File("D:\\saha");//to create folder
	f1.mkdir();
	File f2 =new File("D:\\saha\\saha.pdf");//to create file
	f2.createNewFile();
	System.out.println(f2.getCanonicalPath());
	System.out.println(f2.exists());  //methods//return boolean
	System.out.println(f2.length());//return integer
	System.err.println(f2.getAbsolutePath());//return string
	System.out.println(f2.canRead());//return boolean
	System.out.println(f2.canWrite());//return boolean
	System.out.println(f2.getName());//methods//return name of the file
	FileWriter f3= new FileWriter("D:\\saha\\saha.pdf");//new file writer to write a file
	f3.write("sahadevan chelladurai\nyou got a job from nowhere ");//write method
	f3.close();
	FileReader f4= new FileReader("D:\\saha\\saha.pdf");//read method 1 //to create a file reader 
	Scanner scanner = new Scanner(f4);
	while(scanner.hasNextLine()) {    //character stream
		System.out.println(scanner.nextLine()) ;
 	}
	scanner.close();
	System.out.println(f2.length());
	FileReader f5= new FileReader("D:\\saha\\saha.pdf");//read method 2
	int i=0;
	while((i=f5.read())!=-1) {//byte stream
		System.err.print((char)i);
	}
	
}
}//end of file operations
