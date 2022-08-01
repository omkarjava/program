    package string;

    public class SmallLengthWorld {

	public static void main(String[] args) {
		String s= "This is an umbrella";
		String s1[]=s.split(" ");
		//int g=0;
		
		for(int i=0;i<s1.length;i++)
		{
			int g=0;
			for(int j=0;j<s1[i].length();j++)
		    {
				g++;
			}
			if(g>0)
			{
			 System.out.println(s1[i]+" "+g);
			}
		}
		
	}

}
