package bank;

import java.util.Scanner;

public class mainBank {

	public static void main(String[] args) {
		int m;
		account a1=new account ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:name / accno / balance / contact");
		String name=sc.next();
		int accno=sc.nextInt();
		int balance=sc.nextInt();
		String contact=sc.next();
		a1.setname(name);
		a1.setaccno(accno);
		a1.setbalance(balance);
		a1.setcontact(contact);
		//System.out.println(a1);
		bank b=new bank();
		System.out.println("Enter amount withdraw");
		int a=sc.nextInt();
		b.gapay(a,a1);
		
	}

}
