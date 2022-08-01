package assignment8;

public class ExampleNo10 {

	public static void main(String[] args) {
		String s=" THE SKY IS THE LIMIT ";
		String s1[]=s.split(" ");
		int a[]=new int [s1.length];
		
		for(int i=1;i<s1.length;i++)
		{
			int sum=0;
			for(int k=0;k<s1[i].length();k++)
			{
			
			   for(int j='A';j<'Z';j++)
			    {
				if(i==j)
				 {
					sum=sum +(j-64);	
				 }
			
			     }
			}
			a[i]=sum;
			System.out.println(s1[i]+" "+sum);
		}

	}

}
