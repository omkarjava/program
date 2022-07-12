package collection;
import java.util.ArrayList;
public class CollectionNonGeneric {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
      a.add(40);
      a.add(2.5);
      a.add("raj");
      a.add(60);
      a.add(80);
      a.add(35); 
      a.add("riya");
      a.add(78.5);
	  a.add(new Stud(102,"ram",65))	;
	  a.add(new Stud(103,"rakesh",75))	;
		
	   System.out.println(a);	
		
		for(Object o:a)
		{
			String s=o.getClass().getName();
			if(s.equalsIgnoreCase("java.lang.Double"))
			{
			System.out.println(o);
			}
			//System.out.println(s);
		}
		
		
		
		
		
		
	}

}
