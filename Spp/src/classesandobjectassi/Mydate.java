    package classesandobjectassi;
    import java.util.Scanner;
    public class Mydate {
    int date,month,year;
     
    void input (int i,int m,int j)
    {
      date=i;
      month=m;
      year=j;
    }
    void data()
    {
    	if ( date>0 && date<=30 && month>0 && month<=12 && year>0)
    	{
    		System.out.println(date+"/ "+month+"/"+year);
         }
    	
 
    	else
    	{
    		System.out.println("invalid");
    	}
    		
    }
    public String toString()
    {
    	return ("date="+date/month/year);
    }
	public static void main(String[] args) {
		 int date,month,year;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("date/month/year");
	     date=sc.nextInt();
	     month=sc.nextInt();
	     year=sc.nextInt();
	     Mydate d1=new Mydate();
	     d1.input(date, month, year);
	     d1.data();
	     System.out.println();
	     
	} 
    }
