        package string;

        public class AlphabeticalOccurancesofCharacter {

	    public static void main(String[] args) {
		String s1="the quick brown for jumps over the lazy dog";
        char ch []=s1.toCharArray();
        
        char c='a';
		for(int j=0;j<=26;j++)
		{
				if(c<='z')
				{
					for(int i=0;i<ch.length;i++)
					{
					  if(c==ch[i])
					   {
						System.out.println(c+" = "+i);
						
		         	   }
					
				    }
					c++;
				}
				
			
		}
		   
//		     for(char i='a';i<='z';i++)
//	            {
//	        	for(int j=0;j<ch.length;j++)
//	        	{
//	        		if(i==ch[j])	        		
//	        		{
//	        		 System.out.println(i+" = "+j);
//	        		}
//		        }
//		
//		
//	             }

	   }
}