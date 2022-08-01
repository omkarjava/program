        package program;

        public class p2 {

	    public static void main(String[] args) {
		int a=1452145263;
		 int s=a;
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			
			while(a!=0)
			{
				int f=a%10;
				if(f==i)
				{
					cnt++;
				}
				a=a%10;
				
			}
		    	a=s;
			 if(cnt>0)
			 System.out.println(i +" "+ cnt);
		}
		

	}

}
