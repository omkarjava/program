package classesandobject;

        public class Student1 {
	    int id,marks;
	        String name,dept,sports;
        void setData(int i,String n,String d,int m,String s)
	    {
		    id=i;
		    name=n;
		    dept=d;
		    marks=m;
		    sports=s;
	     }
        void display()
        {
    	    System.out.println(id+" "+name+" "+dept+" "+marks+" "+sports);
        }
        void sportsMarks()
        {
    	if(sports.equals("Badminton"))
    	{
    		marks=marks+5;
    		System.out.println("new marks are:"+marks);
    	}
    	else if	(sports.equals("Hockey"))
    	{
    		marks=marks+3;
    		System.out.println("new marks are:"+marks);	
    	}
    	else if (sports.equals("khokho"))
    	{
    		marks=marks+2;
    		System.out.println("new marks are:"+marks);	
    	}
    	else if (sports.equals("no"))
    	{}
        }
	    public static void main(String[] args) {
	       Student1 s1=new Student1();
	       Student1 s2=new Student1();
	
	   s1.setData(101, "raj", "computer", 70, "Badminton");
	   s1.display();
	   s1.sportsMarks();
	      System.out.println();
	
	   s2.setData(102, "riya", "ENTC", 65, "khokho");
	   s2.display();
	   s2.sportsMarks();
	      System.out.println();
	
	      Student1 s3=new Student1();
	  s3.setData(103, "ramesh", "ENTC", 65, "no");
	  s3.display();
	  s3.sportsMarks();
      }}