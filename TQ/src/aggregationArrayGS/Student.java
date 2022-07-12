package aggregationArrayGS;

public class Student {
	

	int id,marks;
	String name,contact;
    Student(){}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	public String toString()
	{
		return id +" "+ name +" "+ marks +" "+ contact;
	}


	

}
