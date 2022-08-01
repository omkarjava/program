   package car;

    public class cardetail {
	int  year,price,installment;
	String name,brandname,payment;
	
	
	
	
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

    }
