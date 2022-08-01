    package assignment10;

    import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

    public class LinkListEmp {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		LinkedList<Emp> e=new LinkedList<Emp>();
//		System.out.println("Enter id name dept");
//		for(int i=0;i<4;i++)
//		{
//			
//			int id=sc.nextInt();
//			String name=sc.next();
//			String dept=sc.next();
//			e.add(new Emp(id,name,dept));
//			
//		}
//		System.out.println(e);
//		String dep=" ";
//		for(int i=0;i<e.size();i++)
//		{
//			if(e.get(i).id==10)
//			{
//				dep=e.get(i).dept;
//			}
//		}
//		
//		ListIterator<Emp> le=e.listIterator();
//		while(le.hasNext())
//		{
//			Emp em=le.next();
//			if(em.dept.equalsIgnoreCase(dep)) 
//			{
//				le.remove();
//			}
//		}
//		System.out.println(e);
		
		
		
		
		
		
		
		
		LinkedList<Emp> em=new LinkedList<>();
     Scanner sc=new Scanner(System.in);
	 char c=' ';
	 do
	 {
		  System.out.println("Enter the Emp id + name + dept ");	
		  int id=sc.nextInt();
		  String name=sc.next();
		  String dept=sc.next();
		  em.add(new Emp(id,name,dept))  ;
		  System.out.println("Add next Student (Y/N)");
			c=sc.next().charAt(0);  
		
	 }
	 while(c=='Y');
	 String dep=" ";
     for(int i=0;i<em.size();i++)
     {
	   if(em.get(i).id==10)
	   {
		  dep=em.get(i).dept;
	   }
     }
	 	ListIterator<Emp> list=em.listIterator();
	 while(list.hasNext())
	 {
		 Emp ea=list.next();
		 if(ea.dept.equals(dep))
		 {
			 list.remove();
		 }
	 }
	System.out.println(em);	
		
		
		
		
	}

}
