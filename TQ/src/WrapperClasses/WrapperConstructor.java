package WrapperClasses;

public class WrapperConstructor {

	public static void main(String[] args) {
		Integer i=new Integer(20); // int 
		Integer i1=new Integer("50");// String
		System.out.println(i);
		
		Character c=new Character('j'); //only char
		
		Float f=new Float(5);   //double
		Float f1=new Float(5.2f);//float
		Float f2=new Float("654");//string
		 
		//value of ..wrap primitive data type to wrapper classes public static 
		//3 overloaded  methods for byte ,short,int ,long
		
		Integer it1=Integer.valueOf(4);
		Integer it2=Integer.valueOf("266");
		Integer it3=Integer.valueOf("111", 2);
		
		System.out.println(it3);
		//it will use to convert value in object
		//when we work get data from  backend we dosent creat  new constructor 
		//like a 	Integer i=new Integer(20);
		// we use that Integer it1=Integer.valueOf(4);

		
		int o=Integer.parseInt("39289");
		float m=Float.parseFloat("300.2") ;
		System.out.println(o);
		System.out.println(m);
		//it will use to convert value in premitive data type
		
		
		
		Float hg=Float.valueOf(5);
		System.out.println(hg);
		//Byte n=Byte.valueOf("d");
		Character v=Character.valueOf('k');
		System.out.println(v);
		Double s=Double.valueOf(265);
		System.out.println(s);
		//Short h=Short.valueOf("h");
		
	}

}
