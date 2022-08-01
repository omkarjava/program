package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class CollectionGeneric {

	public static void main(String[] args) {
	  ArrayList <Integer> a=new ArrayList <>();
    
	  a.add(10);
	  a.add(30);
	  a.add(50);
	  a.add(40);
	  a.add(10);
	  a.add(10);
	  a.add(30);
	  a.add(50);
	  a.add(40);
	  a.add(10);
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number"); 
	   int d=sc.nextInt();
	   int c=0;
	  for(Integer s:a)
	  {
		
		  if(s==d)
		  {
			  c++;
		  }
		  //System.out.println(a.get(i)+" "+c);
	  }
	  System.out.println(c);
	  
//	  for(int i=0;i<a.size();i++)
//	  {
//		  int c=0;
//		  for(int j=0;j<a.size();j++)
//		  {
//		    if(i==j)
//		    {
//		    	c++;
//		    	j='a';
//		    }
//		     
//		  }
//		  if(c>0&&i!='a')
//		  System.out.println(a.get(i)+" "+c);
//	  }
	  
//	  for(int i=0;i<a.size();i++)
//	  {
//		  int c=0;
//		  for(int j=0;j<a.size();j++)
//		  {
//		    if(a.get(i).equals(a.get(j))&& j<i)
//		    {
//		    	break;
//		    }
//		    if(a.get(i).equals(a.get(j))&& j>=i)
//		    {
//		    	c++;
//		    }
//		     
//		  }
//		  if(c!=0)
//		  {
//		  System.out.println(a.get(i)+" "+c);
//		  }
//	  }
	  
	  
	  
	}

}
