     package practice;
     import java.util.Scanner;

     public class AreaOfRectangle { 
	
	
	 
	 void areaOfRectangle(int length,int bredth)
	 {
	double area= length*bredth;
	 System.out.println("areaOfRectangle ="+ area);
	 }
	 
	 
    
	public static void main(String[] args) {
		int m; 
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length,bredth");
		AreaOfRectangle a1=new AreaOfRectangle ();
		int length=sc.nextInt();
		int bredth=sc.nextInt();
        a1.areaOfRectangle(length, bredth);   
        System.out.println("next area of rectangle:(y/n)");
        m=sc.next().charAt(0);
	  } 
		while(m=='y' && m=='y' );
	    System.out.println("ok");
	  }
      }
