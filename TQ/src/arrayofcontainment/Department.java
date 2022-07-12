    package arrayofcontainment;

    import java.util.Arrays;

    public class Department {
	int did;
	String dname;
	Student stud[];
	Department(int did,String dname,Student stud[])
	{
		this.did=did;
		this.dname=dname;
		this. stud=stud;
	}
	public String toString()
	{
		return did + " "+ dname+" "+Arrays.toString(stud);
	}

}
