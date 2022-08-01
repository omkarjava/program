package comparator;

import java.util.ArrayList;
import java.util.Collections;



public class StudentComparator {

	public static void main(String[] args) {
    ArrayList<Student>s=new ArrayList<>();
		
		s.add(new Student (10,"ram","mech",85));
		s.add(new Student (12,"ramesh","elec",80));
		s.add(new Student (13,"rahul","comp",90));
		s.add(new Student (17,"avi","civil",75));
		s.add(new Student (6,"anvi","comp",82));
		s.add(new Student (18,"raj","comp",82));
		s.add(new Student (19,"kiran","mech",65));
		s.add(new Student (7,"sachin","mech",85));
		s.add(new Student (9,"anand","elec",80));
		s.add(new Student (11,"golu","comp",90));
		
		Collections.sort(s, new StudentDeptComparator ());
        System.out.println(s);
        
        Collections.sort(s, new StudentNameComparator ());
        System.out.println(s);
        
        
	}

}
