package mock;

    public class MaxNO {

	public static void main(String[] args) {
		int a=1516248;
		   
		while(a!=0)
		{
          int r=a%10;
		   if(r>a) 
			  r=a;
		    
			a=a/10;
			System.out.print(r);		
		}
		
		

	}

}
