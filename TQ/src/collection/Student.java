package collection;

public class Student implements Comparable<Student>{
	int id,marks;
	String name;
	Student(int id,int marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	
	
    public String toString()
    {
    	return id+" "+marks+" "+name;
    }
//    int compareTO(Student s)
//	{
//		
//    		return 0;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(this.marks>s.marks)
    		return -1;
    	else if(this.marks<s.marks)
    		return 1;
    	else
		return 0;
	}

}
