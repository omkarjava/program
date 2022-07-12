       package array2d;


       public class MinCharacter {

	   public static void main(String[] args) {
		

		char a[]= {'A','D','E','x','z','R'};
		char min=a[0];
		for(char i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		
		System.out.println("Min char="+min);
		
		char b[]= {'A','D','E','x','z','R'};
		char max=b[4];
		for(char i=0;i<a.length;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
			}
			
		}
		
		System.out.println("Max char="+max);
		
		
		
		
	}

}
