    package WrapperClasses;

    public class Wrapper1 {

	public static void main(String[] args)
	{
		int a=10;
		Integer i1=new Integer(a); //  boxing
		Integer i=a;//        autoboxing 
       //System.out.println(i);
		Integer it=500;
	    
		System.out.println(i==it);//memory location same String
		System.out.println(i.equals(it));//case same
		 
		int i2=it.intValue();//unboxing
		
		int a1=it;//auto unboxing
		//System.out.println(a1);
		
		Float f=new Float(200.5f);
		float f1=f;  //respective premetive data type autounboxing
		short s=f.shortValue();
		long l=f.longValue();
		int n=f.intValue();
		byte b=f.byteValue();
		double d=f.doubleValue();
		
		System.out.println(d);
		//
		
		//Integer h=new Integer(200);
		Integer h=200;
		Integer p=h;
		Float k=h.floatValue();
		System.out.println(k);
		System.out.println(p);
		
		
		
		
		
	}

}
