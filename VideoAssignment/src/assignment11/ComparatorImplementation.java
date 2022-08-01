package assignment11;

import java.util.Comparator;

public class ComparatorImplementation implements Comparator <Student> {

	
	public int compare(Student s, Student s1)
	{
		if(s.rollno>s1.rollno)
	  		return 1;
	  	    else if(s.rollno<s1.rollno)
	  		return -1;
//	  	    else
//	  	    	if(s.age>s1.age)
//	  		  		return 1;
//	  		  	    else if(s.age<s1.age)
//	  		  		return -1;
//		
//			return s.name.compareTo(s1.name);
		    return 0;
	}
	
	
	
	
}
