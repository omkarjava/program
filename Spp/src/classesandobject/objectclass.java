package classesandobject;

import java.util.Scanner;

public class objectclass {

		 int id,marks;
	        String name,dept,sports;
     void setData(int i,String n,String d,int m,String s)
	    {
		    id=i;
		    name=n;
		    dept=d;
		    marks=m;
		    sports=s;
	     }
     public String toString()
     {
 	    return id+" "+name+" "+dept+" "+marks+" "+sports;
     }
     void sportsMarks()
     {
    	 switch(sports)
    	 {
    	 case "Khokho":System.out.println(marks+2);
    	 break;
    	 case "Hockey":System.out.println(marks+5);
    	 break;
    	 case "Badminton":System.out.println(marks+4);
    	 break;
    	 
    	 }
// 	if(sports.equals("Badminton"))
// 	{
// 		marks=marks+5;
// 		System.out.println("new marks are:"+marks);
// 	}
// 	else if	(sports.equals("Hockey"))
// 	{
// 		marks=marks+3;
// 		System.out.println("new marks are:"+marks);	
// 	}
// 	else if (sports.equals("khokho"))
// 	{
// 		marks=marks+2;
// 		System.out.println("new marks are:"+marks);	
// 	}
// 	else if (sports.equals("no"))
// 	{}
     }
	    public static void main(String[] args) {
	    	int id,marks;
	    	String name,dept,sports;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("id,name,dept,marks,sports:");
	    	id=sc.nextInt();
	    	name=sc.next();
	    	dept=sc.next();
	    	marks=sc.nextInt();
	    	sports=sc.next();
	    	
	    	objectclass s1=new objectclass();
	       s1.setData(id,name,dept,marks,sports);
	       System.out.println(s1);
	       s1.sportsMarks();
	       
	       
	   	objectclass s2=new objectclass();   
	    System.out.println("id,name,dept,marks,sports:");
   	    id=sc.nextInt();
    	name=sc.next();
   	    dept=sc.next();
      	marks=sc.nextInt();
   	    sports=sc.next();
        s2.setData(id,name,dept,marks,sports);
	    System.out.println(s2);
	    s2.sportsMarks();
	    
	    objectclass s3=new objectclass();
    	System.out.println("id,name,dept,marks,sports:");
   	    id=sc.nextInt();
   	    name=sc.next();
     	dept=sc.next();
   	    marks=sc.nextInt();
   	    sports=sc.next();
   	    s3.setData(id,name,dept,marks,sports);
	    System.out.println(s3);
	    s3.sportsMarks();	

	  
	}

}
