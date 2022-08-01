    package classesandobject;

    import java.util.Scanner;

    public class AreaOfCircle {
	  int rsquare (int r)
	{
		return r*r;
	}
	void area(int square)
	{
		double area=3.14*square;
		System.out.println("area of circle:"+area);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Radius Of The Circle");
		int r=sc.nextInt();
		AreaOfCircle c1=new AreaOfCircle();
		int square=c1.rsquare(r);
		c1.area(square);  
		
		
		System.out.println("Enter the Radius Of The Circle");
		r=sc.nextInt();
		AreaOfCircle c2=new AreaOfCircle();
		square=c2.rsquare(r);
		c2.area(square);	
		

	}

}
