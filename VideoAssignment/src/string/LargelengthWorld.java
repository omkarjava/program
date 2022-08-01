package string;

public class LargelengthWorld {

	public static void main(String[] args) {
		String s= "This is an umbrella";
		String s1[]=s.split(" ");
		int g=0;
		for(int i=0;i<s1.length;i++)
		{
			if(g<s1[i].length())
			{
				g=s1[i].length();
			}
			if(g>4)
			{
				System.out.print(s1[i]+" ");
			}
		}
    
	}

}
