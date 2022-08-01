        package bank;

        public class bank {
	    void gapay(int amount, account a)
	    {
		int bal=a.getbalance();
		System.out.println("Available Balance:"+bal);
		if(bal>amount)
		{
			bal=bal-amount;
			a.setbalance(bal);
			System.out.println("Remaining Balance:"+a.getbalance());
		}
		else
			System.out.println("Insufficient Balance");
	     }
        
	    
}
