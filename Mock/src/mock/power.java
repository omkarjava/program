package mock;

public class power {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		int k=1;
		while(a>0)
		{
			int s=a%10;
			   for(int i=1;i<=b;i++)
			   {
				   k=k*s;  
			   }
			         
			   a=a/10;
			   System.out.println(k);
		}
       
	}

}
