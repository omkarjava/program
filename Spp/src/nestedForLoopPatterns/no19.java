        package nestedForLoopPatterns;

        public class no19 {

	    public static void main(String[] args) {
		int r=5;
		for (int i=0;i<=r;i++)
		{
		for (int j=1;j<=r;j++)
		{
		int b=(i+j)%2;
		System.out.print(b);
		}
		System.out.println();
		}

	    }

        }
