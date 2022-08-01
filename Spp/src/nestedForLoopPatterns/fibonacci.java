 package nestedForLoopPatterns;

public class fibonacci {
 
	public static void main(String[] args) {
		int a=1,j,i,b=0;
		for(i=0;i<=10;i++)
		{ 
			int c;
			c=a+b;
			System.out.print("  "  +  c   );
			a=b;
			b=c;
		}
		//System.out.println();

	}

}
