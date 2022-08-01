package objectAndClassesCopy;

public class ReferanceVeriables implements Cloneable {
	
	int id;
	String name;
	
	
	
	void display()
	{
		System.out.println("copy");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ReferanceVeriables a=new ReferanceVeriables();
		
//		a.id=5;
//		a.name="ram";
       // a.display();
        //ReferanceVeriables a1=new ReferanceVeriables();
		//System.out.println(a.id+a.name);
		a.display();
		//ReferanceVeriables b=new ReferanceVeriables();
		ReferanceVeriables b =(ReferanceVeriables) a.clone();
		b.display();
	}

}
