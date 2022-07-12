package multilevelInheretance;

public class MainBike {

	public static void main(String[] args) {
		PulsorRs p=new PulsorRs();
		p.setData(100000,"Black","Sport", "Bjaj");
        p.pulsurData(175,"Pulsor" , "200");
        p.pulsorRs("BS-6", 40);
        System.out.println(p);
        p.wheelNo();
        p.gears();
	}

}
