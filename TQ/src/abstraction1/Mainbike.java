package abstraction1;

import java.util.Scanner;

public class Mainbike {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter Bullet price , model , brand , modelno, installment");
		int price=sc.nextInt();
		String model=sc.next();
		String brand=sc.next();
		 int modelno=sc.nextInt();
		 int installment=sc.nextInt();
		 
		Bullet b=new Bullet();
		b.setData(price, model,  brand);
        b.setData(modelno,installment);
        b.display();
        b.gears();
        b.features();
        b.seatno();
        b.discount();
      //  System.out.println(b);
      
        
        System.out.println();
        
		System.out.println("Enter Activa Aprice, Amodel , Abrand , Amodelno , Ainstallment");
		int aprice=sc.nextInt();
		String amodel=sc.next();
		String abrand=sc.next();
		 int amodelno=sc.nextInt();
		 int ainstallment=sc.nextInt();
        Activa a=new Activa();
        a.setData(aprice,  amodel,abrand);
        a.setData(amodelno, ainstallment);
        a.display();
        a.gears();
        a.features();
        a.seatno();
        a.discount();
      //  System.out.println(a);
        
        
        
	}

}
