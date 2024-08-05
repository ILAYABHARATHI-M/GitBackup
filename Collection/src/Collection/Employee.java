package Collection;
import java.util.*;
public class Employee {
	int EmpId;
	String EmpName;
	int EmpSalary;
	long EmpMobile;

	public Employee() {}
	public Employee(int EmpId,String EmpName,int EmpSalary,long EmpMobile) {
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.EmpSalary=EmpSalary;
		this.EmpMobile=EmpMobile;
	}
	
	public String toString() {
		return EmpId+" "+EmpName+" "+EmpSalary+" "+EmpMobile;
	}
	
		
		
	public static void main(String[] args) {
	
		long Salary=0;
		Scanner sc= new Scanner(System.in);
		List <Employee> EmpList=new ArrayList();
		for(int i=1;i<3;i++) {
			
		System.out.println("Enter employee name :");
		String name=sc.nextLine();
        System.out.println("Enter employee Id:");
		 int id=sc.nextInt();
		 Iterator itr=EmpList.iterator();
			while(itr.hasNext()) {
				Employee emp=(Employee) itr.next();
				if (emp.EmpId==id) {
					System.out.println("Invalid input Id");
					System.exit(0);
				}
				
			}
		System.out.println("Enter employee Salary :");
	    int salary =sc.nextInt();
		System.out.println("Enter employee MobileNumber :");
		long number=sc.nextLong();
		EmpList.add(new Employee(id,name,salary,number));
		System.out.print(sc.nextLine());
		}
		Iterator it=EmpList.iterator();
		while(it.hasNext()) {
			Employee emp=(Employee) it.next();
			System.out.println("Annual salary :"+emp.EmpName+"="+emp.EmpSalary*12);
		}
		
		Iterator it1=EmpList.iterator();
		while(it1.hasNext()) {
			Employee emp=(Employee) it1.next();
			Salary=emp.EmpSalary+Salary ;
			
		}
		System.out.println("Total monthly salary:"+Salary);
		
		
		
	}

}
