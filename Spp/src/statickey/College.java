package statickey;

public class College {
	int id,marks;
	String name,dept;
	public static  String collegename ="kjcoemr" ;
	College()
	{
		
	}
	public College (int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public String toString ()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
	

	public static void main(String[] args) {
		
	College gh=new College(10,"bhb","jhjn",6);
	System.out.println(College.collegename);
	 
		System.out.println(gh);	
	
	
			
	
      
       
	}
	
	

}
