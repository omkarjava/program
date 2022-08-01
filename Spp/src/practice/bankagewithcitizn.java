        package practice;

        import java.util.Scanner;

        public class bankagewithcitizn {

	    public static void main(String[] args) { 
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		System.out.println("enter the city:");
		char ct=sc.next().charAt(0);
		ct='p';
		if(age>=18&&ct=='p') 
		{
	    System.out.println("Applicable for the bank account");
	    }
	    else
	    System.out.println("Not Applicable for the bank account");	
		}
	    }
	    


