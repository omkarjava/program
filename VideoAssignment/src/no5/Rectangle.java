    package no5;

    public class Rectangle {
	
	double length=12,width=14,s;
	Rectangle(){};
    Rectangle(double length,double width)
	          {
		        this.length=length;
		        this.width=width;
	          }
    void area()
    {
    	double s=length*width;
    	System.out.println(s);
    }
    void perimeter()
    {
    	double p=2*(length+width);
    	System.out.println(p);
    	
    }
    void display()
    {
    	System.out.println(length+" "+width);
    }
}
