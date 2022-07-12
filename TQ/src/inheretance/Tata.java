package inheretance;

public class Tata extends Car {
	
	int id,modelno,installment;
	String modeofpayment;
	
//	void setData1(int id,int modelno,String modeofpayment,int installment)
//	{
//		this.id=id;
//		this.modelno=modelno;
//		this.modeofpayment=modeofpayment;
//		this.installment=installment;
//	}
	
	
	void discount()
	{
		double discount;
		  if(installment==0 && modeofpayment.equalsIgnoreCase("cash"))
		  {
			 discount=price*15/100;	
			
			System.out.println("Discount: " + discount);
			
		  }
		  else if (installment==0 && modeofpayment.equalsIgnoreCase("online" ))
		  {
			 discount=price*15/100;	
	  		System.out.println("Discount: "+ discount);
	  	  }
		  else if(installment==2 && modeofpayment.equalsIgnoreCase("cash")||modeofpayment.equalsIgnoreCase("online" ))
		  {
			 discount=price*8/100;	
	  		System.out.println("Discount: "+ discount);
	  	  }
		  else if( installment==3 )
		  { 
	  		System.out.println("No discount");
	  	  }	
		
		
		
		
	}
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
//	public int getModelno() {
//		return modelno;
//	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
//	public int getInstallment() {
//		return installment;
//	}
	public void setInstallment(int installment) {
		this.installment = installment;
	}
//	public String getModeofpayment() {
//		return modeofpayment;
//	}
	public void setModeofpayment(String modeofpayment) {
		this.modeofpayment = modeofpayment;
	}
	void display()
	{
		super.display();
		System.out.println(id+" "+modelno+" "+modeofpayment+" "+installment);
	}

}
