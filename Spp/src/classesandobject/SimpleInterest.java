    package classesandobject;
    import java.util.Scanner;
    public class SimpleInterest {
	
	int interest (int p,int r,int t)
	{
		return p*r*t ;
	}
	void si(int in )
	{
		double si=in/100;
		System.out.println(si);
	}

	public static void main(String[] args) {
		int principle,interest,time;
		Scanner sc=new Scanner (System.in);
        System.out.println("principle,interest,time");
        principle=sc.nextInt();
        interest=sc.nextInt();
        time=sc.nextInt();
        SimpleInterest s1=new SimpleInterest();
        int in=s1.interest(principle,interest,time);
        s1.si(in);
        sc.close();
       
	    }

}
