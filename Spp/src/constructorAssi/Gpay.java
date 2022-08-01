    package constructorAssi;

    public class Gpay {   
	public void transferAmmount(int amount ,Accno a)
	{
	System.out.println("Tansaction in process");
	int bal=a.getbalance();
	a.setbalance(bal-amount);
	System.out.println("Amount transfer"+"\n accnos "+a.getaccno()+"\nbalance is Rs."+a.getbalance());
	}
	

	public static void main(String[] args) {
	 Accno b=new Accno();
	//b.acceptdetails(123456002, "ram", "sbi", 5000);
	b.setaccno(124563); 
	b.setname("raj");
	b.setbank("SBI");
	b.setbalance(50000);
	 
	 
    Gpay c=new Gpay();
    c.transferAmmount(200, b);
	}

    }
