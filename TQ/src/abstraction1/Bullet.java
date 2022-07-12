package abstraction1;

public  class Bullet extends Bike {
	 int modelno;
	 int installment;
	  
	 void setData( int modelno,  int installment)
	 {
		this.modelno=modelno; 
		this.installment=installment;
	 }
	 void gears()
	    {
		 System.out.println("5 gears");
	     }
        void features()
		  {
			System.out.println("Selfstart");
		  }
		void  seatno()
		  {
			System.out.println("two seats");
		   }
		void  discount()
		{
			int discount;
			if(installment==0)
			{
				discount =price*15/100;
				System.out.println("Discount: "+ discount);
				
			}
			if(installment==2)
			{
				discount =price*10/100;
				System.out.println("Discount: "+ discount);
				
			}
			if(installment==3)
			{
				discount =price*5/100;
				System.out.println("Discount: "+ discount);
				
			}
			
		}
		
		void display()
		{
			super.display();
			
			System.out.println( modelno +" "+ installment );
		}

}
