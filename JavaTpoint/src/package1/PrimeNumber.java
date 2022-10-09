package package1;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=3;
		int c=0;
     for(int i=2;i<=a-1;i++)
     {
    	 if(a%i==0)
    	 {
    		 System.out.println("not prime Number");
    	 }
    	 else
    		c++; 
     }
		
	if(c>0)
		System.out.println("prime no");
		
		
		
		
		
	}

}
