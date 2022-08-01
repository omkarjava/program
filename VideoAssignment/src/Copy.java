
public class Copy {
	int a;
	String s;
    Copy(int a,String s)
    {
    	this.a=a;
    	this.s=s;
    }
    Copy(Copy obj)
    {
    	this.a=obj.a;
    	this.s=obj.s;
    	
    }
    void display()
    {
    	System.out.println(a+" "+s);
    }
	public static void main(String[] args) {
		Copy c=new Copy(5,"bkjb");
		Copy c1=new Copy(c);
		c.display();
		c1.display();

	}

}
