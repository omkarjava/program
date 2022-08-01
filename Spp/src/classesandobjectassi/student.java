   package classesandobjectassi;
   import java.util.Scanner;
   public class student 
   {
   int id,m1,m2,m3,marks,percentage;
   String name,dept;
   void input (int i,String m,String j,int a,int b,int c)
 	{
 		id=i;
 		name=m;
 		dept=j;
 	     m1=a;
 	     m2=b;
 	     m3=c;
 	}
   void marks()
	{
	marks=m1+m2+m3;
	System.out.println("marks="+marks);
	}
   void percentage()
	{
		percentage=marks*100/300;
		System.out.println("percentage="+percentage+"%");	
	}
   void result()
	{
	    if (percentage>=80)
		{
			System.out.println("1st class");
		}
		if  (percentage>=60)	
		{
		System.out.println("2nd class");	
		}
		if (percentage>=45)	
		{
		System.out.println("3rd class");
		}
		if (percentage>=35)	
		{
		System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+m1+" "+m2+" "+m3;
		
	}
	public static void main(String[] args) {
		 int id,m1,m2,m3;
	     String name,dept;
       Scanner sc=new Scanner(System.in);
       student s1=new student();
       System.out.println("Enter:id,name,dept,m1,m2,m3");
       id=sc.nextInt();
       name=sc.next();
       dept=sc.next();
       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();
       s1.input(id,name,dept,m1,m2,m3);
       System.out.println(s1);
       s1.marks();
       s1.result();
       s1.percentage();
       
       student s2=new student();
       System.out.println("Enter:id,name,dept,m1,m2,m3,dept");
       id=sc.nextInt();
       name=sc.next();
       dept=sc.next();
       m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();
       s2.input(id,name,dept,m1,m2,m3);
       System.out.println(s2);
       s2.marks();
       s2.result();
       s2.percentage();
	}

    }
