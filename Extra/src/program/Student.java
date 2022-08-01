package program;

public class Student {
	
	 public void getid()
	{
		System.out.println(5);
	}
	 public void Display()
	 {
		this.getid();
		System.out.println(2);
	 }
	

	public static void main(String[] args) {
		Student s=new Student();
		s.Display();
       
	}

}
