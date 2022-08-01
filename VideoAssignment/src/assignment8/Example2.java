        package assignment8;

        public class Example2 {

	    public static void main(String[] args) 
	    {
		
		String s="HELLO$WORLD";
		String s1[]=s.split("\\$");
		
		for(String s3:s1)
		{
			System.out.println(s3);
		}
         
	}

}
