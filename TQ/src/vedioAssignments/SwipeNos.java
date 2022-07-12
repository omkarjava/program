    package vedioAssignments;

    import java.util.Arrays;

    public class SwipeNos {

	public static  void main(String[] args) {
		int a[]= {12,0,4,0,5,8};
		int b=a.length;
		int min=a[1];
		for(int i=0;i<b;i++)
		{ 
			if(a[i]<min)
			{
//				int c=a[i];
//				a[i]=a[i+1];
//				a[i+1]=c;
				min=a[i];
				
			}
		}
		System.out.println("Minimum Value Of Array:"+ min);
		
	}

}
