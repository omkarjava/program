        package nestedForLoopPatterns;

        public class jhf {

	    public static void main(String[] args) {
		int a=0,r=8;
		int b=1;
		for(int i=1;i<=r;i++)
		{
          for (int j=1;j<=(i*2-1);j++)
          {
           System.out.print(a+" ");
           int c=a+b;
           a=b;
           b=c;      
	      }
         System.out.println();
         a=0;
         b=1;
        }
                     }} 