package video1;


public class Demo {

	public static void main(String[] args) {
//		byte input=125;
//		Byte data=new Byte (input);
//		int result=data.compareTo((byte)128);
//		System.out.println(data+""+result);
//		
//		try {
////			int i,sum;
////			sum=10;
////			for(i=-1;i<3;++i)
////				sum=(sum/i);
//			System.out.println("A");
//			throw new NullPointerException("hello");
//		}
//		catch(ArithmeticException a)
//		{
//			System.out.println("B");
//		}
//		byte b=50;
//		Byte input=new Byte(b);
//		Byte input1=new Byte(b+"");
//		//Byte input2=new Byte(127);
		
		
//		String input="+127";
//		Byte copy=Byte.valueOf(input);
//		String str=input+" "+copy;
//		System.out.println(str);
		int num=1123211;
		int c=num;
		int r,s=0;
		while(num>0)
		{
			//System.out.println(num);
			 r=num%10;
			s=(s*10)+r;
			num=num%10;
			
		}
		System.out.println(s);
		
		
		
	}

}
