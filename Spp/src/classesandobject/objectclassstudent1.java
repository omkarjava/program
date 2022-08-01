package classesandobject;

public class objectclassstudent1 {
	int id,marks;
	String name,dept;
	void input (int i,String m,int h,String j)
	{
		id=i;
		name=m;
		marks=h;
		dept=j;
	
	}
    public String toString()
    {
    	return id+" "+name+" "+marks+" "+dept;
    }

	public static void main(String[] args) {
		objectclassstudent1 s1=new objectclassstudent1();
		objectclassstudent1 s2=new objectclassstudent1();
        s1.input(10,"raj",25,"Electrical");
        System.out.println(s1);
       // System.out.println();
       
        s2.input(11,"ram",20,"Electrical");
        System.out.println(s2);
       // System.out.println();
       // System.out.println(s1);
	
	 System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
	}

}
