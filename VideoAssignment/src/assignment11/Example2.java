package assignment11;

import java.util.ArrayList;
import java.util.Collections;

public class Example2 {

	public static void main(String[] args) {
		
      ArrayList<Student>st=new ArrayList<>();
      
      st.add(new Student(25,5,"ram"));
      st.add(new Student(30,51,"raj"));
      st.add(new Student(35,15,"rahul"));
      st.add(new Student(45,18,"ramesh"));
      st.add(new Student(50,9,"mangesh"));
      st.add(new Student(55,8,"rajesh"));
      st.add(new Student(59,9,"sachin"));

      Collections.sort(st, new ComparatorImplementation ());
      
      System.out.println(st);
      
      
      
      
      
      
	}

}
