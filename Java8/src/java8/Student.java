package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
	String Name;
	long MobNumber;
	int Tamil;
	int English;
	int Maths;
	int Science;
	int SocialScience;
	int total;
	public Student(String name, long mobNumber, int tamil, int english, int maths, int science, int socialScience) {

		Name = name;
		MobNumber = mobNumber;
		Tamil = tamil;
		English = english;
		Maths = maths;
		Science = science;
		SocialScience = socialScience;
		total =Tamil+English+Maths+Science+SocialScience;
	}

	@Override
	public String toString() {
		return "Name=" + Name + ", MobNumber=" + MobNumber + ", Tamil=" + Tamil + ", English=" + English
				+ ", Maths=" + Maths + ", Science=" + Science + ", SocialScience=" + SocialScience + "Totalmarks: " +total;
	}



	public static void main(String[] args) {
		List <Student> list = new ArrayList<Student>();
		list.add(new Student("Sahadevan",8526184576l, 78, 79, 68, 90, 94));
		list.add(new Student("dinesh   ",983242342l, 87, 97, 86, 45, 84));
		list.add(new Student("Prashanth",7002437438l, 68, 99, 98, 90, 94));
		list.add(new Student("Yuvaraj  ",9503234234l, 98, 99, 68, 90, 94));
		list.add(new Student("Aravind  ",954282394l, 56, 67, 34, 26, 74));
		list.add(new Student("Manu     ",826452983l, 18, 69, 58, 70, 44));
		list.add(new Student("Viceky   ",893246632l, 98, 99, 98, 99, 98));
		list.add(new Student("Mohan    ",9823446738l, 78, 79, 88, 90, 94));
		//System.out.println(list);
		Stream <Student> s = list.stream();
		List <Student> flist= s.filter(n->n.Tamil<35||n.English<35||n.Maths<35||n.Science<35||n.SocialScience<35).collect(Collectors.toList());
		Stream <Student> ss = list.stream();
		List <Student> plist= ss.filter(n->n.Tamil>35&&n.English>35&&n.Maths>35&&n.Science>35&&n.SocialScience>35).collect(Collectors.toList());

		Stream <Student> s1 = plist.stream();
		List <Student > agrade= s1.filter(n-> n.total>400).collect(Collectors.toList());
		Stream <Student> s2 = plist.stream();
		List <Student > bgrade= s2.filter(n-> n.total>300&&n.total<400).collect(Collectors.toList());

		System.out.println("Failed Students:");
		flist.forEach(n-> System.out.println(n.Name +"\t\t"+n.total));
		System.out.println("A grade Students\n");
		agrade.forEach(n-> System.out.println(n.Name +"\t\t"+n.total));
		System.out.println("\nB grade Students\n");
		bgrade.forEach(n-> System.out.println(n.Name +"\t\t"+n.total));
	}
}
