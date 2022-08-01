    package objectAndClassesCopy;

    public class Person 
    {
	public String name;
	public int age;
	public String gender;
	private float bankBalance;
	
	Person()
	{
		
	}
	
	Person(String name,int age1,String gender)
	{
	this.name=name;
	age=age1;
	this.gender=gender;
	}
	
	Person(String name,String gender)
	{
	this.name=name;
	
	this.gender=gender;
	}
	
	
	
	void setName(String name2)
	{
		name=name2;
	}
	
	void setGender(String gender)
	{
		this.gender=gender;
	}
	
	void setAge(int ageeds)
	{
		age=ageeds;
	}
	
	public String toString()
	{
		return "Name = "+name+" "+age+" "+gender ;
	}
	

	public float getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(float bankBalance) {
		this.bankBalance = bankBalance;
	}

	





	public static void main(String[] args) 
	{
	

	}

}
