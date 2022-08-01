package constructorAssi;

public class Account 
{
	long accno;
	String customername;

	 void setaccno(long accno)
	 {
		 this.accno=accno;
	 }
	 long getaccno()
	 { 
		 return accno;
	 }
	 void setcustomername(String customername)
	 {
		 this.customername=customername;
	 }
	 String getcustomername()
	 {
		 return customername;
	 }
	 void display()
	 {
		 System.out.println( accno+" "+customername);
	 }

	public static void main(String[] args) {
		Account a=new Account();
		a.setaccno(123455356);
		a.setcustomername("shyam");
		a.display();
		
		
		
		
	}
	

}
