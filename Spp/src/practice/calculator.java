       package practice;

       import java.util.Scanner;

       public class calculator {
	  
	   void  calculator(int ras,int num,int num3)
	    {  
		
		switch(ras)
		{
		
		case 1  :System.out.println("multiplication="+(num*num3));
		break;
		case 2  :System.out.println("Addition="+(num+num3));
		break;
		case 3  :System.out.println("Division="+(num/num3));
		break;
		case 4  :System.out.println("substract="+(num-num3));
		break;
		default :System.out.println("invalid");
		}
	}
   
	public static void main(String[] args) {
		char m ;
		do
		{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		System.out.println("Enter the Number");
		int num2=sc.nextInt();
		System.out.println("Enter the Number");
		int num3=sc.nextInt();
		calculator s1=new calculator ();
	    s1.calculator(num,num2,num3);
	    System.out.println("do you wat repeat : (y/n)");
	     m=sc.next().charAt(0);
		}
		while(m=='y' && m=='y' );
	    System.out.println("ok");
	    }

}
