package aggregationArrayGS;

import java.util.Arrays;


public class Department {
	
	int did;
	String dname;
	Student stud[];
	public int getDid() 
	{
		return did;
	}
	public void setDid(int did)
	{
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Student[] getstud() {
		return stud;
	}
	public void setstud(Student[] stud) 
	{
		this.stud = stud;
	
		
		
	}
	public String toString()
	{
		return did + " "+ dname+" "+Arrays.toString(stud);
	}


}
