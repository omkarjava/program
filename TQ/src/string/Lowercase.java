package string;

public class Lowercase {

	public static void main(String[] args) {
		String g="JAVA IS A PROGRAMMING LANGUAGE";
		String g1="";
		char v;
		for(int i=0;i<g.length();i++)
		{
			v=g.charAt(i);
			if(v>=64&&v<=97)
			{
				g1+=(char)(v+32);
			}
			else
			{
				g1+=v;
			}
		}
		System.out.println(g1);

	}

}
