
public class PrimeNoExample {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
         //do not include 1 and number itself
		
		int num=9,i=2;     
		int mid=num/2;  //3    
		while(i<=mid)  //7  3 i=2  i=3     i=4
		{
			if(num%i==0)  //7%2==0  7%3==0
			{
				//System.out.println("Nt a prime number");
				break;
			}
			i++;
		}
		
		if(i>mid)
		{
			System.out.println("Prime number");
		}
		else
			System.out.println("Not Prime");
	}

}
