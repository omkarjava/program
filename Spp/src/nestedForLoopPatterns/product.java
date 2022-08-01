package nestedForLoopPatterns;

public class product {

	public static void main(String[] args) {
	   int product=1;
	   int a=323;
	   while(a!=0)
	   {
		  int r=a%10;
		  product=product*r;
		  a=a/10;
		  System.out.print("product of Digit :"+product);
	   }
      
	}

}
