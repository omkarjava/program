    package inheritanceGetterSetter;

import java.util.Scanner;

public class Main 
    {

    public static void main(String[] args) 
    {
    	
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Driver id");
        int id=sc.nextInt();
        System.out.println("Enter Car id");
        int Id=sc.nextInt();
		Driver1 d=new Driver1();
        d.setId(id);
        d.setName("ram");
        d.setContact("9696599684");
        Car1 c=new Car1();
        c.setId(Id);
        c.setBrand("TATA");
        c.setName("STROME");
        c.setD(d);
        c.setBrand("Maruti");
        System.out.println(c);
	}

    }
