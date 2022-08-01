package comparator;

import java.util.Comparator;

public class StudentDeptComparator implements Comparator<Student>{
	
	
	public int compare(Student s, Student s1)
	{
		if(s.dept.equals(s1.dept))
		{
			return s.name.compareTo(s1.name);
		}
		else
			return s.dept.compareTo(s1.dept);
	}
	

	

}
