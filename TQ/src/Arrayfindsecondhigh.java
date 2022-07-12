
public class Arrayfindsecondhigh {

	public static void main(String[] args) {
		  int a[]= {5,8,7,9,5,12,3,3,65,4};
		  int large=0;
		  int secondlarge=0;
		  for(int i=0;i<a.length;i++)
		  {
			  if(a[i]>large)
			  {
				  secondlarge=large;
				  large=a[i];
			  }
			  else if (secondlarge<a[i])
			  {
				  secondlarge=a[i];
			  }
		  }
		  
		  System.out.println(secondlarge);
		  System.out.println(large);
		  
		  
	}

}
