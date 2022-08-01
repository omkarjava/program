package classesandobject;

     public class Declaire {
	 int id,marks;
	 String name,dept;
	  
	 void Student(int id, String name,String dept,int marks)
	 {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	 }
	 void display()
	 {
		 System.out.println(id+" "+name+" "+dept+" "+marks);
	 }

	public static void main(String[] args) {
		 int id=10;
		String name="ram";
		String dept="mech";
		int marks=10;
		Declaire s1=new Declaire();
		s1.Student(id, name, dept, marks);
		s1.display();
		

	}

}
