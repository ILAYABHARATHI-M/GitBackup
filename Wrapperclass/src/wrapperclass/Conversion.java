package wrapperclass;

public class Conversion {
public static void main(String[] args) {
int a=20;
Integer b= Integer.valueOf(a);
System.out.println(a+b);
String c="4500";
Integer e=Integer.valueOf(c);
System.out.println(e+a);
boolean f=true;
Boolean f1=Boolean.valueOf(f);
System.out.println(f1.hashCode());
boolean f2=f1.booleanValue();
System.out.println(f2);
}
}
