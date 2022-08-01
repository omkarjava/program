package wrapperAssignment;

public class Example4 {
	public void showNum(Number i)
	{
		System.out.println(i);
	}
    
//	public void showNum(int i)
//	{
//		System.out.println(i);
//	}

//	public void showNum(Integer i)
//	{
//		System.out.println(i);
//	}
//
//	public void showNum(Long i)
//	{
//		System.out.println(i);
//	}
//
	public void showNum(long k)
	{
		System.out.println(k);
	}
//	public void showNum(Double i)
//	{
//		System.out.println(i);
//	}

	public static void main(String[] args) {
		
		int i=50;
		int k=45;
		Example4 a=new Example4();
		a.showNum(i);
	    a.showNum(k);
	}

}
