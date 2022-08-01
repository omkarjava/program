package example2;

public class MainPerson {

	public static void main(String[] args) {
		Address ad=new Address( );
		ad.setCity("satara");
		ad.setState("maharastra");
		ad.setCountry("india");
		Person d=new Person(45, "ram", "male", ad) ;
       
		System.out.println(d);
		
		
	}

}
