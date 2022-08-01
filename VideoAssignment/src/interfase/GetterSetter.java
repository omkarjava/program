package interfase;

public class GetterSetter extends Inter{
	
	int a;
	String name;
	 void data()
	 {
		 System.out.println("abstract class");
	 }
	public GetterSetter(int a,String name)
	{
		this.a=a;
		this.name=name;
	}
	
	void setdata()
	{
		
		System.out.println("run");
	}
	
	
	public static void main(String[] args) {
		GetterSetter  d=new GetterSetter (4,"khgb");
		d.setdata();
		
	    d.data();
	    d.iybngu();
		
		
	}

}
