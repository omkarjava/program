package overrideninheretance;

public class Student extends Person {
	int id,percent;
	String dept;
	
	void studentDetail(int id,int percent,String dept)
	{
		this.id=id;
		this.percent=percent;
		this.dept=dept;
		
	}
	
	void grade(int percent)
	{
		if(percent>=80)
			System.out.println("Grade:"+"a");
		else if(percent>=70)
			System.out.println("Grade:"+"b");
		else if(percent>=60)
			System.out.println("Grade:"+"c");
	}
	void display()
	{
		super.display();
		System.out.println(id+" "+percent+" "+dept);
	}

}
