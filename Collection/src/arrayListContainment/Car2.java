package arrayListContainment;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Car2 {

	public static void main(String[] args) {
		ArrayList<Company> c=new ArrayList<>();
		ArrayList<Car> ca=null;
		Scanner sc=new Scanner (System.in);
        System.out.println("Departments ");
        int s=sc.nextInt();
		for( int i=0;i<s;i++)
		{
			System.out.println("Company id  +name ");
        	int cid=sc.nextInt();
        	String cname=sc.next();
        	ca=new ArrayList<>();
        	for(int j=0;j<2;j++)
        	{
        		System.out.println("Car id +price+ year +name ");
            	int id=sc.nextInt();
            	int price=sc.nextInt();
            	int year=sc.nextInt();
            	String name=sc.next();
            	ca.add(new Car(id,price,year,name));
            	
        	}
        	
        	c.add(new Company(cid,cname,ca));
        	
		}
		 int yr=0;
		 for(int i=0;i<c.size();i++)
           {
			 Company cca=c.get(i);
        	   for(int j=0;j<cca.ca.size();j++)
        	   {
        		   if(cca.ca.get(j).id==105)
        		   {
        			   yr=cca.ca.get(j).year;
        		   }
        	   }
           }
           System.out.println(yr);
           
         ListIterator<Company> le=c.listIterator(); 
   		 while(le.hasNext())
   		 {	
   			
   				ListIterator<Car> li=ca.listIterator();
   				while(li.hasNext())
   				{
   					Car cm=li.next();
   					if(cm.year==yr)
   					{
   						li.remove();
   					}
   				}
   			 le.next();
   		 }
   		 System.out.println(c);
   		

	}

}
