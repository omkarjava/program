package day3;

        import java.util.Scanner;

        public class dowhilemenu {

	    public static void main(String[] args) {
		int c;
		do
		{
		Scanner sc= new Scanner (System.in)	;
	    System.out.println("Enter your choice");
	    int  choice=sc.nextInt();
	    switch(choice) {
	    case 1 :System.out.println("maharastrian thali");
	             System.out.println("how many thali");
	             int s=sc.nextInt();
	             int b=s*1500;
	             System.out.println("total bill:"+ b);
		         break;
	    case 2 :System.out.println("gujarati thali");
	             System.out.println("how many thali");
	             int d=sc.nextInt();
	             int g=d*150;
	             System.out.println("total bill:"+ g);
		         break;
	    case 3 :System.out.println("punjabi thali");
	             System.out.println("how many thali");
	             int f=sc.nextInt();
	             int k=f*100;
	             System.out.println("total bill:"+ k);
		         break;
		         default:
		         System.out.println("go to home");	 
	             }
	             System.out.println("do you want repeat menu:(y/n):");
	 			 c=sc.next().charAt(0);
	             }         
		         while(c=='y'|| c=='y');
	             System.out.println("ok bye");

	
	             }
	             }

	

