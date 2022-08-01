    package comparable;

    public class Student implements Comparable<Student> {
	int id,marks;
	String name,dept;
	Student(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
	 public int compareTo(Student e)
	    {
		   //return this.dept.compareTo(e.dept);
	       if(this.dept.equals(e.dept)) 
	       {  
	         
		   if(this.marks>e.marks)
	    		return 1;
	    	else if(this.marks<e.marks)
	    		return -1;
	    	else
	    		return this.name.compareTo(e.name);   
	       }  
	       else
	       {
	    	   //return this.id-e.id;
	    	   return this.dept.compareTo(e.dept);
	       }
	    }
	 
	    
	public static void main(String[] args) {
	

	}
	

}
