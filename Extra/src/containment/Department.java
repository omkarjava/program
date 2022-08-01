package containment;

public class Department {
	
	int totalemp;
	String dname;
	 Employee e[];
	public int getTotalemp() {
		return totalemp;
	}
	public void setTotalemp(int totalemp) {
		this.totalemp = totalemp;
	}
	public String getName() {
		return dname;
	}
	public void setName(String dname) {
		this.dname = dname;
	}
	public Employee[] getE() {
		return e;
	}
	public void setE(Employee[] e) {
		this.e = e;
	}
	public String toString()
	{
		return  totalemp + dname +e;
	}
	
	
	

}
