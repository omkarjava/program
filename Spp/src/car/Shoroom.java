     package car;

public class Shoroom {
	 
	 void Discount(cardetail a)
	 {
		int price=a.getprice();
		int installment=a.getinstallment();
		String payment=a.getpayment();
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

      }
