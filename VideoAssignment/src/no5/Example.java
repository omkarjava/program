package no5;

public class Example {

	public static void main(String[] args) {
		for(int i=2;i<100;i++)
		{
			int a=0;
			for(int j=2;j<i-1;j++)
			{
	          if(i%j==0)
	          {
	        	  a=a+1;
	          }
			}
			if(a==0)
			{
				System.out.println(i);
			}
			
		}

	}

}
