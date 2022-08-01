package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainStudent {

	public static void main(String[] args) {
		ArrayList<Student>st=new ArrayList<>();

		st.add(new Student(12,"ram","ele",85));
		st.add(new Student(13,"raj","comp",75));
		st.add(new Student(14,"rahul","ele",55));
		st.add(new Student(15,"ramesh","mech",65));
		st.add(new Student(16,"sachin","ele",95));
		st.add(new Student(17,"avi","civil",70));
		st.add(new Student(1,"pooja","entc",80));
		st.add(new Student(2,"mona","comp",83));
		st.add(new Student(20,"shian","civil",65));
		st.add(new Student(5,"anjali","mech",45));
		st.add(new Student(32,"neha","entc",88));
		System.out.println(st);
		
		HashMap<String,Integer>hm=new HashMap<>();
		
		for(Student g:st)
		{
		  if(hm.containsKey(g.dept))
		  {
	       int a=hm.get(g.dept)+1;
	       hm.put(g.dept, a);
			
		  }
		  else
		  {
			  hm.put(g.dept, 1);
		  }
		}
		System.out.println(hm);
		
//		for(Student g:st)
//		{
//		  if(hm.containsValue(g.dept))
//		  {
//	       int a=hm.get(g.dept)+1;
//	       hm.put(g.dept, a);
//			
//		  }
//		  else
//		  {
//			  hm.put(g.dept, 1);
//		  }
//		}
//		System.out.println(hm);
		
	}

}
