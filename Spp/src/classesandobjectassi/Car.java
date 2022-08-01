        package classesandobjectassi;

        import java.util.Scanner;

        public class Car {
    	int  id,year,price,installment;
    	String name,brandname,payment;
    	void input(int a,String b,int c,int d,String e,int i,String p)
    	{
    		id=a;
    	    name=b;
    		year=c;
    	    price=d;
    	    brandname=e;
    	    installment=i;
    	    payment=p;
    	}
    	public String toString()
    	{
    	return id+" "+name+" "+year+" "+price+" "+brandname+" "+installment+" "+payment	;
    	}
    	
           
    	void Discount()
    	{
    		double discount;
    	  if(installment==0 && payment.equals("cash"))
    	  {
    		 discount=price*15/100;	
    		
    		System.out.println(discount);
    		
    	  }
    	  if (installment==0 && payment.equals("online" ))
    	  {
    		 discount=price*15/100;	
      		System.out.println(discount);
      	  }
    	  if(installment==2 )
    	  {
    		 discount=price*5/100;	
      		System.out.println(discount);
      	  }
    	  if( installment==3 )
    	  { 
      		System.out.println("no discount");
      	  }
    	  
    	  }
    	
	public static void main(String[] args) {
		int  id,year,price,installment;
    	String name,brandname,payment;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("id,name,year,price,brandname,installment,payment");
    	id=sc.nextInt();
    	name=sc.next();
    	year=sc.nextInt();
    	price=sc.nextInt();
    	brandname=sc.next();
    	installment=sc.nextInt();
    	payment=sc.next();
    	Car c1=new Car();
    	c1.input(id ,name ,year ,price ,brandname ,installment ,payment);
    	System.out.println(c1);
    	c1.Discount();
	}

}
