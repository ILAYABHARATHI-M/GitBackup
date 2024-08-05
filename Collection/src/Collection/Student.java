package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparator<Student>//,Comparable<Student> 
{
	int age;
	String name;
	int rank;
	public Student(int age,String name,int rank) {
		this.age=age;
		this.name=name;
		this.rank=rank;
	}

	public String toString() {
		return age+":"+name+":"+rank;

	}
	public int compareTo(Student that) {
		if(this.rank>that.rank) {
			return 1;
		}
		else
			return -1;
	}


	public static void main(String[] args) {
		ArrayList<Student> li=new ArrayList<Student>();
		li.add(new Student (23,"sahadevan",2));
		li.add(new Student (21,"prasanth",1));
		li.add(new Student (22,"dinesh varma",3));
		li.add(new Student (24,"muniraj",5));
		li.add(new Student (25,"manu ",4));
		Comparator<Student> stdus=new Comparator<Student>() {

			@Override
			public int compare(Student i, Student j) {
				if(i.rank>j.rank) {
					return 1;
				}
				else
					return -1;
			}
		};
		Collections.sort(li,stdus);

		for(Student s :li)
			System.out.println(s);
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	





}
