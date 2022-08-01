package assignment_4;

public class ReadArrayElement {

	public static void main(StringExample[] args) {
		int a[]={2,3,15,15,3,2};
        for(int i=0;i<a.length-1;i++)
        {
        	if(a[i]==a[a.length-1-i])
        	{
        	  System.out.println("same");
        	}
        	else 
        	{
        		System.out.println("Not Same");
        	}
        }
	}

}
