    package nestedForLoopPatterns;

    public class Pattern {

	public static void main(String[] args) {
	int r=5;
	int a=0,b=1;
	for(int i=0;i<=r;i++)
	{
	for(int j=1;j<=i;j++)
	{
	System.out.print(a+" ");	
	int c=a+b;
	    a=b;
	    b=c;
	}
	System.out.println();
	}

	}

    }
