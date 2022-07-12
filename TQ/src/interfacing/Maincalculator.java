     package interfacing;

     import java.util.Scanner;

     public class Maincalculator {

	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the No1 , No2 ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Scicalculator s=new Scicalculator ();
		//Calculator s=new Scicalculator();
		s.set(a, b);
		s.add();
		s.divide();
		s.multiply();
		s.subtract();
		s.power();
		s.square();
	}

}
