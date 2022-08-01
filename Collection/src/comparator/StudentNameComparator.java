package comparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
	
	
	public int compare(Student s, Student s1)
	{
		if(s.name.equals(s1.name))
		{
			return s.id-s1.id;
		}
		else
			return s.name.compareTo(s1.name);
	}
	
	

}
