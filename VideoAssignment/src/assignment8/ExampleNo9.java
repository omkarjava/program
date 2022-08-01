    package assignment8;

    public class ExampleNo9 {

	public static void main(String[] args) {
		String s=" THe SKY Is THE LIMIT ";
		String s1[]=s.split(" ");
		int a[]=new int [s1.length];
		
		for(int i=1;i<s1.length;i++)
		{   
			int sum=0;
			//int sum1=0;
			for(int j=0;j<s1[i].length();j++)
			{
				if(s1[i].charAt(j)>='A'&& s1[i].charAt(j)<='Z')
				{
				sum=sum +(s1[i].charAt(j)-64);
			    }
				else if(s1[i].charAt(j)>='a'&& s1[i].charAt(j)<='z')
				{
				sum=sum +(s1[i].charAt(j)-96);	
				}
			
			}
			a[i]=sum;
			System.out.println(s1[i]+" "+sum);
		}
	    //System.out.println(sum);
        
	      System.out.println();
	    	for(int i=1;i<a.length;i++)
	    	{
	    		for(int j=i+1;j<a.length;j++)
	    		{
	    			if(a[i]>a[j])
	    			{
	    		     	int b=a[i];
	    			    a[i]=a[j];
	    			    a[j]=b;
	    				
	    			    String d=s1[i];
	    			    s1[i]=s1[j];
	    			    s1[j]=d;
	    			}		
	    						
	    		}
	    		System.out.println(s1[i]+" "+a[i]);
	            
	    	}
	    	
	
	    }
	
	}


