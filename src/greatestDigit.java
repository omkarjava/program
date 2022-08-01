
public class greatestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7462,max=num%10;
		
		while(num!=0)
		{
			int r= num%10;
			if(r>max)
			max=r;
			
			
			num=num/10;
			
		}
		
		System.out.println("greatest digit is: "+max);
	}

}
