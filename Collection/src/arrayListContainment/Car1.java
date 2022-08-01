package arrayListContainment;

import java.util.ArrayList;
import java.util.Scanner;

public class Car1 {

	int id,price,year;
	String name;
	Car1(int id,int price,int year,String name)
	{
		this.id=id;
		this.price=price;
		this.year=year;
		this.name=name;
	}
    public String toString()
    {
    	return id+" "+price+" "+year+" "+name;
    }
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
		
		for(Company a:c)
		{
			for(Car v:a.ca)
			{
				if(v.year>2000 && v.price>600000)
				{
					System.out.println(v.name+" "+v.price+" "+a.name);
				}
			}
		}
}
}
