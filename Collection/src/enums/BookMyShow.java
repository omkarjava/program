package enums;
interface A{
	void distcription();
}
public enum BookMyShow implements A{
	
	
	SILVER(150)
	{
		public String toString()
		{
			return "Rate Of Silver Tickets Is:Rs 150/-";
		}
		 public void distcription()
			{
			   System.out.println( "Rate Of Silver Tickets Is:Rs 150/-");	
			}
		
		
		
	},
	GOLD (200)
	{
		public String toString()
		{
			return "Rate Of Gold Tickets Is:Rs 200/-";
		}
		public void distcription()
		{
		   System.out.println( "Rate Of Gold Tickets Is:Rs 200/-");	
		}
	
	},
	PLATINUM(250)
	{
		public String toString()
		{
			return "Rate Rf Platinum Tickets Is:Rs 250/-";
		}
		public void distcription()
		{
		   System.out.println( "Rate Rf Platinum Tickets Is:Rs 250/-");	
		}
	
	};
	int rate;
	private BookMyShow(int rate)
	{
		this.rate=rate;
	}
//    public void distcription()
//	{
//	   System.out.println("Rate Of Tickets Is:"+rate);	
//	}
//	void message()
//	{
//		System.out.println("Rate Of Tickets Is:"+rate);
//	}
	

}
