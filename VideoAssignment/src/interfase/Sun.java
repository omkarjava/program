package interfase;

import java.util.Scanner;

public class Sun extends Father {
	
	
	void setdata()
	{
		System.out.println("son");
	}

	public static void main(String[] args) {
		
		Grandfather a=new Father();
		a.setdata();
//        Grandfather g=new Grandfather();
//        g.setdata();
		Father s=new Sun();
        s.setdata();
        
        
        
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter the name =");
//		String scanName = scan.next();
//		
//		if(scanName.equalsIgnoreCase("grandfather"))
//		{
//			Grandfather g=new Grandfather();
//			g.setdata();
//		}
//		else if(scanName.equalsIgnoreCase("father"))
//		{
//			Father g=new Father();
//			g.setdata();
//		}
//		else
//		{
//			Sun g=new Sun();
//			g.setdata();
//		}
//		
		
		
		
	}

}
