package inheretance;

import java.util.Scanner;

public class Maintata {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Car Name,Brand,Year,Price");
	     String name=sc.next();
	     String brand=sc.next();
	     int launchyear=sc.nextInt();
	     int price=sc.nextInt();
	     System.out.println("Enter Id,Modelno,Modeofpayment,Installment");
	     int id=sc.nextInt();
	     int modelno=sc.nextInt();
	     String modeofpayment=sc.next();
	     int installment=sc.nextInt();
		  Tata t=new Tata();
//		 t.setData(name,brand,launchyear,price);
//		 t.setData1(id,modelno,modeofpayment,installment);
		 t.setName(name); 
		 t.setBrand(brand); 
		 t.setLaunchyear(launchyear);
		 t.setPrice(price);
		 t.setId(id); 
		 t.setModelno(modelno);
		 t.setModeofpayment(modeofpayment);
		 t.setInstallment(installment);
		 // t.setBrand("maruti");
		 t.discount();
		 t.display();

	}

}
