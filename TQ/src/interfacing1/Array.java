package interfacing1;

import java.util.Arrays;
import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student1 s[]=new Student1 [2];
		System.out.println("s1");
		  for(int i=0;i<2;i++)
		   {
		   System.out.println("movie id,name,");
		   int id=sc.nextInt();
		   String name=sc.next();
		   Student1 m=new Student1 ();
		   m.setId(id);
		   m.setName(name);
		   s[i]=m;
		   
	       }
		  System.out.println("s2");
		  Student1 s2[]=new Student1 [2];
		  for(int j=0;j<2;j++)
		   {
		   System.out.println("movie id,name,");
		   int id=sc.nextInt();
		   String name=sc.next();
		   Student1 m=new Student1(); 
		   m.setId(id);
		   m.setName(name);
		   
		   s2[j]=m;
	       }
		  int k=0;
		  for(Student1 d:s)
		  {
			  
			  for(Student1 e:s2)
			  {
				  if(d.getId()==e.getId() && d.getName().equals(e.getName()))
				  {
					k++;  
				  }
			  }
		  }
		  
		  Student1  a[]=new  Student1 [(s.length+s2.length)-(k*2)];
		  int b=0;
		  for(Student1 d:s)
		  {
			  int c=0;
			  for(Student1 e:s2)
			  {
				  if(d.getId()==e.getId() && d.getName().equals(e.getName()))
				  {
					c++;  
				  }
			  }
			 if(c==0)
			 {
				 a[b]=d;
				 b++;
			 }
			  
		  }
//		  for(Student1 d:s2)
//		  {
//			  int c=0;
//			  for(Student1 e:s)
//			  {
//				  if(d.getId()==e.getId() && d.getName().equals(e.getName()))
//				  {
//					c++;  
//				  }
//			  }
//			 if(c==0)
//			 {
//				 a[b]=d;
//				 b++;
//			 }
//			  
//		  }
		 System.out.println(Arrays.toString(s));
		 System.out.println(Arrays.toString(s2));
		 System.out.println(Arrays.toString(a));
		 
		  
}
}