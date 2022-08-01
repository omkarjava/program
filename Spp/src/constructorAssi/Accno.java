package constructorAssi;

public class Accno {
	private int accno,balance;
	private String name,bank;
	  public void setaccno(int accno)
	  {
		  this.accno=accno;
	  }
	  int getaccno()
	  {
		  return accno;
	  }
	  public void setname(String name)
	  {
		  this.name=name;
	  }
	  String getname()
	  {
		  return name;
	  }
	  public void setbank(String bank)
	  {
		  this.bank=bank;
	  }
	  String getbank()
	  {
		  return bank;
	  }
	  public void setbalance(int balance)
	  {
		  this.balance=balance;
	  }
	  int getbalance()
	  {
		  return balance;
	  }
   
	  public void acceptdetails(int accno,String name,String bank,int balance)
	  {
	      this.accno=accno;
	      this.name=name;
	      this.bank=bank;
	      this.balance=balance;
	        
	  }
	public static void main(String[] args) {
	

	}

}
