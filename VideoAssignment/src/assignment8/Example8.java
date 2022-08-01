package assignment8;

public class Example8 {

	public static void main(String[] args) {
		String s=" THE SKY IS THE LIMIT ";
	//	char c[]=s.toCharArray();
		String s1[]=s.split(" ");
		
		for(int i=1;i<s1.length;i++)
		{
			int sum=0;
			for(int  j=0;j<s1[i].length();j++)
			{
				sum=sum +(s1[i].charAt(j)-64);
			
			}
			 
			System.out.println( s1[i] + " " + sum );	 
		}
		

	}

}
