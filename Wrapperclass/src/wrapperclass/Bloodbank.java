package wrapperclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bloodbank {
       String ename;
     List <Bloodbank>li=new ArrayList<Bloodbank>();
      long emob;

    static int apositive =10;
    static int anegative =10;
    static int bpositive =10;
    static int opositive =10;


    Scanner sc =new Scanner(System.in);

    public Bloodbank() {

    }
    void start() throws InterruptedException{
        Scanner s=new Scanner(System.in);
        System.err.println();
        System.out.println("\t \t \t \t   Welcome to ABC Blood Bank \n");
        System.out.println("Please register your name and mobile number \n");
        System.out.println("Enter your name: ");
         ename = s.nextLine();
        
       
        System.out.println("Enter your mobile number: ");
        String mob = s.nextLine();
        System.out.println();
        if(mob.length()==10) { 
        	try {
        	 emob=Long.valueOf(mob);
        	
        	}
        	catch(Exception e) {
        		System.err.println("Enter only valid input");
        		start();
        	}

        System.out.println("Welcome "+ename);
        System.out.println();
        if(!li.isEmpty()) {
        	
        	byte mobileFlag=0;
        	for(Bloodbank b:li) {
        	
        		if(b.emob==emob) {
        			System.out.println("This number is already registerted in the of "+ename);
        			System.out.println("Please Enter any key to continue \n");
        			execute();
        			start();
        			mobileFlag=1;
        			break;
        			
        		}
        	}
        	if(mobileFlag!=1) {
        		li.add(new Bloodbank(ename,emob));
        	}
        }else {
        	li.add(new Bloodbank(ename,emob));
        	
        }
        execute();
        start();
        }
        else
        {
        	System.err.println("Mobile number should contain 10 digits");
        	System.err.println("Please try again");
        }
        
        start();
        
    }

    void execute() throws InterruptedException {

        System.out.println("Enter any key to continue \n");
        System.out.println("Press 1 for Details : Press 2 for Donating the blood : Press 3 for receiving blood : Press 4 for exit");
        int a=sc.nextInt();
        if(a==1) {
            details();
        }
        else if(a==2) {
            donate();
        }
        else if(a==3) {
            receive();
        }
        else if(a==4){
            exit();
        }
        else{
            System.out.println("Invalid input");
        }


    }
    void details() throws InterruptedException{
        System.out.println("A+ : "+ Bloodbank.apositive+" units");
        System.out.println("A- : "+Bloodbank.anegative+" units");
        System.out.println("B+ : "+Bloodbank.bpositive+" units");
        System.out.println("O+ : "+Bloodbank.opositive+" units");
        System.out.println();
        String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
        for(int i=0;i<s.length();i++) {
         Thread.sleep(100);
         System.out.print(s.charAt(i));
         
        }
  
    }
    void donate() throws InterruptedException {
        System.out.println("We have registered your name and the number");
        System.out.println(ename+"  "+emob);
        System.out.println("Which Blood group you want to donate ");
        System.out.println(" 1 for A+ \n 2 for A- \n 3 for B+ \n 4 for O+ ");
        int a=sc.nextInt();
        switch(a) {
            case 1:
                donateApositive();
                break;
            case 2:
                donateAnegative();
                break;
            case 3:
                donateBpositive();
                break;
            case 4:
                donateOpositive();
                break;
            default:
                System.out.println("invalid input");

        }
    }
    void donateApositive() throws InterruptedException {
            System.out.println("Our team will call you and tell the date and time for donating the blood\n");
            String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
            for(int i=0;i<s.length();i++) {
             Thread.sleep(100);
             System.out.print(s.charAt(i));
             
            }
            
        }

    void donateAnegative() throws InterruptedException {
            System.out.println("Our team will call you and tell the date and time for donating the blood\n");
            String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
            for(int i=0;i<s.length();i++) {
             Thread.sleep(100);
             System.out.print(s.charAt(i));
             
            }
       }
    void donateBpositive() throws InterruptedException {
            System.out.println("Our team will call you and tell the date and time for donating the blood\n");
           String s= "!!!Thank you "+ename+" and have a nice day\n!!!";
           for(int i=0;i<s.length();i++) {
            Thread.sleep(100);
            System.out.print(s.charAt(i));
            
           }
        }

    void donateOpositive() throws InterruptedException {
            System.out.println("Our team will call you and tell the date and time for donating the blood\n");
            String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
            for(int i=0;i<s.length();i++) {
             Thread.sleep(100);
             System.out.print(s.charAt(i));
             
            }
        }

    void receive() throws InterruptedException {
        System.out.println("Which Blood group you want to receive ");
        System.out.println(" 1 for A+ \n 2 for A- \n 3 for B+ \n 4 for O+ ");;
        int a=sc.nextInt();
        switch(a) {
            case 1:
                receiveApositive();
                break;
            case 2:
                receiveAnegative();
                break;
            case 3:
                receiveBpositive();
                break;
            case 4:
                receiveOpositive();
                break;
            default:
                System.out.println("invalid input");

        }


    }
    void receiveApositive() throws InterruptedException {
        System.out.println("We have registered your name and the number ");
        System.out.println(ename+"  "+emob);
        System.out.println("Enter the unit to receive ");
        int a=sc.nextInt();
        if (a==0||a<=0){
            System.err.println("Invalid input");

        }
       else if(apositive>a) {
            apositive =  apositive -a;
            System.out.println(" As per your request we are giving you "+a+" unit\n");
            System.out.println(" current stock of A+ is "+  apositive+" unit");
        }
        else if (apositive<a) {
            System.err.println("We don't have that much stock we will arrange it in sometime\n");

        }

        else{
            System.out.println("Error");
        }
        String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
        for(int i=0;i<s.length();i++) {
         Thread.sleep(100);
         System.out.print(s.charAt(i));
         
        }
    }
    void receiveAnegative() throws InterruptedException {
        System.out.println("We have registered your name and the number ");
        System.out.println(ename+"  "+emob);
        System.out.println("Enter the unit to receive ");
        int a=sc.nextInt();
        if (a==0||a<=0){
            System.err.println("Invalid input");

        }
        else if(anegative>a) {
            anegative =  anegative -a;
            System.out.println(" As per your request we are giving you "+a+" unit\n");
            System.out.println("  current stock of A- is "+  anegative+" unit");
        }
        else if (anegative<a) {
            System.err.println("We don't have that much stock we will arrange it in sometime\n");

        }
        else {
            System.out.println("Error\n");

        }
        String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
        for(int i=0;i<s.length();i++) {
         Thread.sleep(100);
         System.out.print(s.charAt(i));
         
        }

    }
    void receiveBpositive() throws InterruptedException {
        System.out.println("We have registered your name and the number ");
        System.out.println(ename+"  "+emob);
        System.out.println("Enter the unit to receive ");
        int a=sc.nextInt();
        if (a==0||a<=0){
            System.err.println("Invalid input");

        }
        else if(bpositive>a) {
            bpositive=  bpositive -a;
            System.out.println(" As per your request we are giving you "+a+" unit\n");
            System.out.println(" current stock of B+ is "+  bpositive+" unit");
        }
        else if (bpositive<a) {
            System.err.println("We don't have that much stock we will arrange it in sometime\n");

        }
        else {
            System.out.println("Error\n");

        }
        String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
        for(int i=0;i<s.length();i++) {
         Thread.sleep(100);
         System.out.print(s.charAt(i));
         
        }


    }
    void receiveOpositive() throws InterruptedException {
        System.out.println("We have registered your name and the number ");
        System.out.println(ename+"  "+emob);
        System.out.println("Enter the unit to receive ");
        int a=sc.nextInt();
        if (a==0||a<=0){
            System.err.println("Invalid input");

        }
        else  if(opositive>a) {
            opositive=  opositive -a;
            System.out.println(" As per your request we are giving you "+a+" unit\n");
            System.out.println(" current stock of O+ is  "+  opositive+" unit");
        }
        else if (opositive<a) {
            System.err.println("We don't have that much stock we will arrange it in sometime\n");

        }
        else {
            System.out.println("Error\n");

        }  
        String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
        for(int i=0;i<s.length();i++) {
         Thread.sleep(100);
         System.out.print(s.charAt(i));
         
        }


    }
    void exit() throws InterruptedException {
    	String s= "!!!Thank you "+ename+" and have a nice day!!!\n";
        for(int i=0;i<s.length();i++) {
         Thread.sleep(100);
         System.out.print(s.charAt(i));
         
        }

        System.exit(3);
    }
    public Bloodbank(String ename,long emob) {
        this.ename=ename;

        this.emob=emob;

    }
    public String toString(){
        return ename+"  "+"  "+emob;
    }

    public static  void main(String[] args) throws InterruptedException {

        Bloodbank b =new Bloodbank();
        b.start();

    }
}
