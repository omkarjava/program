package practice;

public class Staticout {
	static int x;
	static int y;
	void add(int a,int b)
	{
		x=a+b;
		y=x+b;
	}
    
   public void display()
   {
	System.out.println(x);
   }
	
		
	

	public static void main(String[] args) {
		Staticout b=new Staticout();
		Staticout c=new Staticout();
		int a=2;
		b.add(a, a+1);
		c.add(5, a);
		b.display();
		c.display();
		System.out.println(b+" "+c);

	}

}
