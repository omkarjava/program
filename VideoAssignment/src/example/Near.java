package example;

public class Near {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[]= {7,8,5,10,8,4,7,9,6,3,2};
	       
		int s=6;
		int b=0;
		int a=0;
		int v=0;
		
		for(int i=0;i<c.length;i++)
		{
			b=s-c[i];//3,2,5,0,2,5,6,3,1,4,7,9
			if(a<b)
			{
				a=c[i];
				
			}
			int g=a-c[i];//1,2,-1,4,2,-2,1,3,0,3,4
			 if(a>g)
			{
				v=c[i];
			}
		}
		System.out.println(a);	
		
//		for(int i=0;i<c.length;i++)
//		{
//			if(a>s)
//			{
//				v=c[i];
//			}
//		}
		System.out.println(v);
	}

}
