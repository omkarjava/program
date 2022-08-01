   package classesandobjectassi;
   import java.util.Scanner;
  
   public class NationalGame 
   {
	

	
	void nationalgame(String country)
	{
	switch (country)
	{
	case "india":
	
	System.out.println("National game is Hockey");
	break;
	
	case "china":
	
		System.out.println("National game is Tennis");
		break;
	
	case "bangladesh":
	
		System.out.println("National game is Kabaddi");
		break;
	
	case "italy":
	
		System.out.println("National game is Football");
		break;
	
	case "United states":
	
		System.out.println("National game is Baseball");
		break;
	
	default:
	
	System.out.println("Invalid Country");
	break;
	
	}
	}
	
	

	public static void main(String[] args) {
		String country;
		Scanner sc=new Scanner(System.in);
		NationalGame c1=new NationalGame();
		System.out.println("Enter the country name");
		country=sc.next();
		
		c1.nationalgame(country);
		
	
	}

}
