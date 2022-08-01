            package day3;
 
            import java.util.Scanner;

            public class Dowhile {

	        public static void main(String[] args) {
		    int  a=100,b=20,c=20,d=50,ch;
		
		    do
		    {
			System.out.println("1.maharastian thali");
			System.out.println("2.gujarati thali");
			System.out.println("3.bengali thali");
			System.out.println("4.punjabi thali");
             Scanner sc= new Scanner (System.in);
			 System.out.println("Enter your choice :");
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1 :System.out.println("rate:"+a);
			break;
			case 2 :System.out.println("rate:"+b);
			break;
			case 3 :System.out.println("rate:"+b);
			break;
			case 4 :System.out.println("rate:"+b);
			break;
			default: System.out.println("go to home");
			}
			System.out.println("do you want repeat menu:(y/n):");
			c=sc.next().charAt(0);
		    }while(c=='y'|| c=='y');
		    System.out.println("ok bye");

	        }

            }
