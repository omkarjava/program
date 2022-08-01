    package classesandobject;

    public class StudentData {
	int id,marks;
	String name,dept;
	void input (int i,String m,int h,String j)
	{
		id=i;
		name=m;
		marks=h;
		dept=j;
	
	}
    void display()
    {
    	System.out.print(id+" "+name+" "+marks+" "+dept);
    }

	public static void main(String[] args) {
		StudentData s1=new StudentData();
		StudentData s2=new StudentData();
        s1.input(10,"raj",25,"Electrical");
        s1.display();
        System.out.println();
       
        s2.input(11,"ram",20,"Electrical");
        s2.display();
        System.out.println();
        System.out.println(s1);
	}

    }
    
