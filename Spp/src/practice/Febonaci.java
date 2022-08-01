        package practice;

        public class Febonaci {

	    public static void main(String[] args) {
		int d=5;
		int c=0,a=1,b=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(c+" ");
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}

	}

}
