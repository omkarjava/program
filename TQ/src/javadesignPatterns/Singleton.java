package javadesignPatterns;

public class Singleton {

	
	//static Singleton obj=new Singleton (); //early instantiation
	static Singleton obj=null;   // lazy instantiation
	String str;
//	private Singleton()
//	{
//		str="Core Java";
//	}
//	public static Singleton getInstance()
//	{
//		
//		return obj;
//	}
//	
	private Singleton ()
	{
		str="Core Java";
	}
	public static Singleton getInstance()
	{
		if(obj==null)
		{
			obj=new Singleton ();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Singleton s1=new Singleton ().getInstance();
		Singleton s2=new Singleton ().getInstance();
		Singleton s3=new Singleton ().getInstance();
		
		s1.str=s1.str.toLowerCase();
		
		System.out.println(s1.str);
		System.out.println(s2.str);
        System.out.println(s3.str);
	}

}
