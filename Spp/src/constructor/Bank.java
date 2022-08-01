    package constructor;
    import java.util.Scanner;
    public class Bank {
	int accno,balance,contact,amount;
	String name;
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	void setaccno(int accno)
	{
		this.accno=accno;
	}
	int getaccno()
	{
		return accno;
	}
	void setcontact(int contact)
	{
		this.contact=contact;
	}
	int getcontact()
	{
		return contact;
	}
	void setbalance(int balance)
	{
		this.balance=balance;
	}
	int getbalance()
	{
		return balance;
	}
	void setamount(int amount)
	{
		this.amount=amount;
	}
	int getamount()
	{
		return amount;
	}
	public String toString()
	{
		return name+" "+accno+" "+contact+" "+balance+" "+amount;
	}
	void balance(int balance,int amount)
	{  
//		 balance = b.getbalance(balance);
//	     amount=5000;
		if(balance>amount)
		{
			balance=balance-amount;
			setbalance(balance);
			System.out.println("Remaining Balance:"+getbalance());
		}
		else
		{
			System.out.println("Insufficient Balance");
	     }

	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter: Name,Accno,Contact,Balance,Amount");
	    String name=sc.next();
	    int accno=sc.nextInt();
	    int contact=sc.nextInt();
	    int balance=sc.nextInt();
	    int amount=sc.nextInt();
	    Bank b=new Bank();
        b.setname(name);
        b.setaccno(accno);
        b.setcontact(contact);
        b.setbalance(balance);
        b.setamount(amount);
        System.out.println("Bank Details :"+b);
        
        //Bank ba=new Bank();
        //ba.balance(b);
        b.balance(b.getbalance(),b.getamount());
        
        
	}

}
