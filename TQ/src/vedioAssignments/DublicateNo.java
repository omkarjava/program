    package vedioAssignments;

    public class DublicateNo {
    public static void main(String[] args) {
	int a[]= {12,1,7,1,8,2,3,3};
	int j=a.length;
	for(int i=0;i<a.length;i++)
	{
	 for(j=i+1;j<a.length;j++)
	  {
		if(a[i]==a[j])
		 {
		  System.out.println("Dublicate Element:"+a[i]);
			  
		 }
		  
	  }
	}
  
	
	
	
	
}
}
