
public class Febo {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				c=a+b;
				System.out.print(" " +c);
				a=b;b=c;
			}
			System.out.println();
		}
      
	}

}
