package javadesignPatterns;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Plan NAME");
    String name=sc.next();
    System.out.println("Enter the Units");
    int units=sc.nextInt();
    PlanInput pi=new PlanInput();
    Plan p=pi.getPlan(name);
    p.getRate();
    p.generateBill(units);
	}

}
