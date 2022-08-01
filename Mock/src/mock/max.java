package mock;

public class max {

	public static void main(String[] args) {
		int a=53089;
		  int b; 
		  int large=0;
		while(a!=0)
		{
          int r=a%10;
          if(large<r)
        	 large=r; 
          a=a/10;
		}
		System.out.println(large);

	}

}
