
package assignmentNo9;

public class Example2 {
	
	void array(int a[],int b)
	{
		System.out.println("Element:" + a[b]);
	}
	void add(int c,int d)
	{
		System.out.println("Divison"+c/d);
	}
	int getStringLength(String s) //throws NullPointerException
	{
		System.out.println(" " + s );
		if(s==null)
		{
			//System.out.println("null String");
			throw new NullPointerException("String is null");
		}
		return s.length();
		
	}

	public static void main(String[] args) {
		 Example2 e=new  Example2();
		 int a[]= {4,5,6,2,3};	
		 try
		 {
		 e.array(a, 4);
		 e.add(5, 10);
		 e.getStringLength("zvbsxb");
		 }
		 catch(IndexOutOfBoundsException |ArithmeticException|NullPointerException i)
		 {
			 System.out.println(i);
		 }
//		 finally
//		 {
//			 close();
//		 }
	}

}
