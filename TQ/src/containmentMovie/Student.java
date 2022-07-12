    package containmentMovie;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	int rollno;
	String sname;
	Department de[];
	

	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Department[] getDe() {
		return de;
	}


	public void setDe(Department[] de) {
		this.de = de;
	}
    public String toString ()
    {
	return rollno+" "+sname+" "+Arrays.toString(de);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student st[]=new Student[2];
		for(int i=0;i<2;i++)
		{
		System.out.println("enter the Did ,Dname");	
		int id=sc.nextInt();
		String dname=sc.next();
		Department de[]=new Department[2];
		for(int j=0;j<2;j++)
		{
			System.out.println("enter srollno,name");
			int srollno=sc.nextInt();
			String name=sc.next();
			Department de1=new Department();
			de1.setId(id);
			de1.setName(name);
			de[j]=de1;
			
		}
			
			Student st1=new Student();
			st1.setRollno(id);
			st1.setSname(dname);
			st1.setDe(de);
			st[i]=st1;
			
			
			
		}
		System.out.println(Arrays.toString(st));
//        for(Student s:st)
//        {
//        	for(Department d:s.de)
//        	{
//        		if(d.getName().equals("electrical"))
//        		{
//        		System.out.println();
//        		}
//        	}
//        }
		
		
    
	}

}
