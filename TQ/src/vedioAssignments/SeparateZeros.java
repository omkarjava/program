        package vedioAssignments;

        import java.util.Arrays;

        public class SeparateZeros {

	    public static void main(String[] args) {
		int a[]= {12,0,7,0,8,0,3};
		int j=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			
			  if(a[i]>a[j])
			  {
				int b=a[i];
				a[i]=a[j];
				a[j]=b;
			  }	
			
		}
		System.out.print(Arrays.toString(a));
		

	}

}
