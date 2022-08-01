        package car;

        import java.util.Scanner;

        public class maincar {
 
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
	   //  System.out.println("Enter the installment method payment ");
	   //  installment=sc.nextInt();
	   //  payment=sc.next();
 	     c1.Discount(c2);
	     
	    //System.out.println(c1);
	   // System.out.println(c1);
	    // System.out.println(c1);*/
	    

	}

}
