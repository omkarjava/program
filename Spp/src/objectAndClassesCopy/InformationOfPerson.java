package objectAndClassesCopy;

public class InformationOfPerson 
{
	
	public static void main(String[] args)
	{
		
		Person p1 = new Person();
		
		p1.setName("omkar");
		p1.setAge(25);
		p1.setGender("Male");
		
		p1.setBankBalance(50000);
		
		System.out.println(p1.getBankBalance());
		
		System.out.println(p1);
		
		
		Person p2 = new Person("Swapnil",24, "male");
		
		System.out.println(p2);
		
		Person p3 = new Person();
		p3.setName("Shakib");
		p3.setGender("Male");
		
		System.out.println(p3);
		
		Person p4 = new Person("Shakib2", "male");
		
		
		
		
		
	}

}
