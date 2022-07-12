        package vedioAssignments;

        public class a {

	    public static void main(String[] args) {
		int a[]={5,4,7,8,9,2,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length ;j++)
			{
				if (a[i]+a[j]==12)
				{
				System.out.print(a[i]+" "+a[j]);
				}
				
			}
			//System.out.println();
		}

	}

}
