     package car;

    import java.util.Scanner;

import classesandobjectassi.Car;

    public class car1 {
	int  year,price,installment;
	String name,brandname,payment;
	
	
//	car1()
//	{
//		
//	}
	
	int getyear()
    {
    	return year;
    }
    void setyear(int year)
    {
    	this.year=year;  	
    }
    String getname()
    {
    	return name;
    }
    void setname(String name)
    {
    	this.name=name;
    	
    }
    String getbrandname()
    {
    	return brandname;
    }
    void setbrandname(String brandname)
    {
    	this.brandname=brandname;
    	
    }
    String getpayment()
    {
    	return payment;
    }
    void setpayment(String payment)
    {
    	this.payment=payment;
    	
    }int getinstallment()
    {
    	return installment;
    }
    void setinstallment(int installment)
    {
    	this.installment=installment;  	
    }
    int getprice()
    {
    	return price;
    }
    void setprice(int price)
    {
    	this.price=price;  	
    }
    public String toString()
    {
    	return year+name+brandname+payment+installment+price;
    }
    public void Discount()
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
		int  year,price,installment;
		String name,brandname,payment;
		Scanner sc=new Scanner(System.in);
	
		cardetail c2=new cardetail();
		System.out.println("Enter: year,name,brandname,payment,installment,price");
	    year=sc.nextInt();
	    name=sc.next();
	    brandname=sc.next();
	    payment=sc.next();
	    installment=sc.nextInt();
	    price=sc.nextInt();
	    c2.setyear(year);
	    c2.setname(name);
	    c2.setbrandname(brandname);
	    c2.setpayment(payment);
	    c2.setinstallment(installment);
	    c2.setprice(price);
	     System.out.println(c2);
	    
	     Shoroom c1=new Shoroom();
	   
 	     c1.Discount(c2);   

	     }

    
         }

    
