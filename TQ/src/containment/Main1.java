package containment;

public class Main1 {

	public static void main(String[] args) {
		Car1 ca=new Car1();
		ca.setId(1);
		ca.setName("nexon");		
        ca.setModel("vxi");
        ca.setPrice(550000);
        Company1 co=new Company1();
        co.setId(8);
        co.setName("tata");
        co.setYear(2022);
        co.setCa(ca);
        System.out.println(co);

	}

}
