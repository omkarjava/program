   package video1;

   public class Q7 {


	public static void main(String[] args) {
		
	int a=4;
	int i=1;
	int mid=a/2;
	int b=2;
	while(i<=mid)
	{
		if(a%b==0)
		{
		 break;
	    }
	 i++;
	}
	if(i>mid)
		System.out.println("prime");
	else
		System.out.println("not prime ");
	
	}

}
