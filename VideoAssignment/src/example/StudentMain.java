package example;

import java.util.ArrayList;
import java.util.HashMap;

    public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student>s=new ArrayList<>();
		ArrayList<Course>c=new ArrayList<>();
		c.add(new Course(12,"java"));
		ArrayList<Course>c1=new ArrayList<>();
		c1.add(new Course(15,"c++"));
		ArrayList<Course>c2=new ArrayList<>();
		c2.add(new Course(12,"java"));
		ArrayList<Course>c3=new ArrayList<>();
		c3.add(new Course(12,"html"));
		ArrayList<Course>c4=new ArrayList<>();
		c4.add(new Course(12,"css"));
		
		s.add(new Student(12,"ram","cs",85,c));
		s.add(new Student(13,"ramesh","ee",75,c1));
		s.add(new Student(14,"raj","entc",80,c2));
		s.add(new Student(15,"rahul","cs",55,c3));
		s.add(new Student(16,"neha","it",95,c4));
		
		
		System.out.println(s);
      HashMap<String,Integer>hm=new HashMap<>();
      
     
		for(Course a:c)
		{
			if(hm.containsKey(a.cname))
			{
				int g=hm.get(a.cname);
				hm.put(a.cname, g);
			}
			else 
			{
				hm.put(a.cname,1);
			}
				
		}
       System.out.println(hm);
	}

}
