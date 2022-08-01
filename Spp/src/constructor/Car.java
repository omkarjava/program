      package constructor;
      import java.util.Scanner;
      public class Car {
	  int id,price,discount,installment;
	  String name,brandname,payment;
	  void setid(int id)
	  {
		this.id=id;
	  }
	  int getid()
	  {
		return id;
	  }
	  void setname(String name)
	  {
		this.name=name;
	  }
	 String getname()
	 {
		return name;
	 }
	 void setbrandname(String brandname)
	 {
		this.brandname=brandname;
	 }
	 String getbrandname()
	 {
		return brandname;
	 }
	 void setprice(int price)
	 {
		this.price=price;
	 }
	 int getprice()
	 {
		return price;
	 }
	 void setpayment(String payment)
	  {
	 	this.payment=payment;
	  }
	 String getpayment()
	 {
		return payment;
	 }
	  void setinstallment(int installment)
	  {
		this.installment=installment;
	  }
	   int getinstallment()
	   {
		return installment;
	   }
	
	void Discount( int installment,String payment)
	{
		
		double discount;
		  if(installment==0 && payment.equals("cash"))
		  {
			 
			 discount=price*15/100;	
			
			System.out.println("discount amount:"+discount);
			
		  }
		  if (installment==0 && payment.equals("online" ))
		  {
			 discount=price*15/100;	
	  		System.out.println("discount amount:"+discount);
	  	  }
		  if(installment==2 )
		  {
			 discount=price*5/100;	
	  		System.out.println("discount amount:"+discount);
	  	  }
		  if( installment==3 )
		  { 
	  		System.out.println("no discount");
	  	  }  
		
	}
	public String toString()
	{
		return id+" "+name+" "+brandname+" "+price+" "+payment+" "+installment;
	}
	

	public static void main(String[] args) {
		Car c=new Car();
		
		c.setid(10);
		c.setname("Nexon");
		c.setbrandname("Tata");
		c.setprice(555000);
		System.out.println(c);
		
		Car b=new Car();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the payment mode:");
		String payment=sc.nextLine();
		System.out.println("Enter the installment method:");
		int installment=sc.nextInt();
		
		c.Discount(installment, payment);
		
		
//	    b.getpayment();
//	    b.getinstallment();
//	    b.Discount(installment,payment);
//	    System.out.println(b+"5efvbhnijmok,fvgbuhnijmk");
	}

}
