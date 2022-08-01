package video1;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array Size");
        int size=sc.nextInt();
        int a[]=new int [size];
        System.out.println("Enter the Array Element");
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        }
	    for(int i=0;i<a.length;i++)
	    {
	    	int c=0;
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[i]==a[j])
	    		{
	    			c++;
	    			a[j]='#';
	    		}
	    	}

			if(a[i]!='#')
			{
			System.out.println(a[i]+" = "+ c);
			}
	    }
        	
        
	}

}
