package no5;

public class Square extends Rectangle
{ 
	

    Square()
	{
    	super.area();
    	super.perimeter();	
		
	}
    void square()
    {
    	double d=length*width;
    	System.out.println(d*d);
    }
	
//	void display()
//	{
//		//super.display();
////		super.area();
////    	super.perimeter();
//		//System.out.println(square);
//	}
}
