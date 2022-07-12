package containment;

public class Main {

	public static void main(String[] args) {
		Car ca=new Car();
		ca.setId(1);
		ca.setName("nexon");		
        ca.setModel("vxi");
        ca.setPrice(550000);
        Company co=new Company(5,"tata",2022,ca);
        System.out.println(co);
        
        Car ca1=new Car();
		ca1.setId(2);
		ca1.setName("Safari");		
        ca1.setModel("vdi");
        ca1.setPrice(1257850);
        Company co1=new Company(5,"tata",2022,ca1);
        System.out.println(co1);
        
        Car ca2=new Car();
		ca2.setId(3);
		ca2.setName("Harrier");		
        ca2.setModel("vxi");
        ca2.setPrice(950000);
        Company co2=new Company(5,"tata",2022,ca2);
        System.out.println(co2);
        
        Car ca3=new Car();
		ca3.setId(4);
		ca3.setName("Innova");		
        ca3.setModel("vdi");
        ca3.setPrice(3050000);
        Company co3=new Company(8,"Toyota",2022,ca3);
        System.out.println(co3);
        
        Car ca4=new Car();
		ca4.setId(5);
		ca4.setName("Tiago");		
        ca4.setModel("vxi");
        ca4.setPrice(550000);
        Company co4=new Company(5,"tata",2022,ca4);
        System.out.println(co4);
        
        
        
        
        
	}

}
