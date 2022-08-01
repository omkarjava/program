package bank;

public class account {
	int accno,balance ;
	String name,contact;
    int getbalance()
    {
    	return balance;
    }
    void setbalance(int balance)
    {
    	this.balance=balance;
    	
    }
    int getaccno()
    {
    	return accno;
    }
    void setaccno(int accno)
    {
    	this.accno=accno;
    }
    String getname()
    {
    	return name;
    }
    void setname(String name)
    {
    	this.name=name;
    }
    String getcontact()
    {
    	return contact;
    }
    void setcontact(String contact)
    {
    	this.contact=contact;
    }
    
}
