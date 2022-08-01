package assignmentNo9;

public class Example1 {
	
	
	 void str(String s,int j)
	{
		System.out.println(s.charAt(j));
	}
	
	
     void array(int dr[],int i)
	{
		System.out.println(" element at index : "+dr[i]);
	}
	

	public static void main(String[] args) {
		Example1 e =new Example1();
		int dr[]= {2,4,5,56,6,5};
		try {
		e.str("igi", 6);
        e.array(dr, 4);
		}
		catch (StringIndexOutOfBoundsException |ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
	}

}
