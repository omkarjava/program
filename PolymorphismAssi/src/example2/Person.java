package example2;

public class Person {
	int age;
	String name,gender;
	Address ad;
	Person(int age,String name,String gender,Address ad)
	{
		this.age=age;
		this.name=name;
		this.gender=gender;
		this.ad=ad;
		
	}
	public String toString()
	{
		return  age+" " + name+" " + gender+" " + ad ;
	}

	public static void main(String[] args) {
		
	}

}
