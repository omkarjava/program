package containment;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Department dept[]=new Department[2];
		for(int i=0;i<2;i++)
		{
			
		System.out.println("Enter Dept name & Total Emp :Employee list "+" "+(i+1)+" "+"Department");	
		String dname=sc.next();
		int totalemp=sc.nextInt();
			Employee e[]=new Employee[totalemp];
			for(int j=0;j<e.length;j++)
			{
			System.out.println("id,name,salary,contact,address"+" "+(j+1)+" "+"employee");	
			int id=sc.nextInt();
			String name=sc.next();
			int salary=sc.nextInt();
			String contact=sc.next();
			String address=sc.next();
			
			Employee e1=new Employee();
			e1.setId(id);
			e1.setName(name);
			e1.setSalary(salary);
			e1.setContact(contact);
			e1.setAddress(address);
			
			e[j]=e1;
			
			}
			
			Department dept1=new Department();
			dept1.setName(dname);
			dept1.setTotalemp(totalemp);
			dept1.setE(e);		
			
			dept[i]=dept1;
			
			
		}
		
		for(Department d:dept)
		{
			for(Employee s:d.e)
			{
				if(s.getAddress().equals("pune") && s.getSalary()>30000)
				{
				System.out.println(d.dname+" "+s.id+" "+s.address+" "+s.name+" "+s.contact);	
				}
			
			}
		}
		
		
		

	}

}
