package vedioAssignments;

public class RepeatedWorld {

	public static void main(String[] args) {
		String s="java is programming java is ";
		String s1[]=s.split(" ");
   
		for(int i=0;i<s1.length;i++)
		{
			int c=0;
			int cn=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					c++;
					cn++;
				}
			}
			if(c>0)
			{
			 System.out.println(s1[i]+"="+cn);
			}
		}
		
		
		
		
		
	}

}
