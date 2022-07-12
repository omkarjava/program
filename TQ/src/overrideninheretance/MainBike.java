package overrideninheretance;

public class MainBike {

	public static void main(String[] args) {
		PulserRs p=new PulserRs();
		p.setData(100000,"Black","Sport", "Bjaj");
        p.pulserData(175,"Pulsor" , "200");
        p.pulserRs("BS-6", 40);
        System.out.println(p);
        p.wheelNo();
        p.gears();

	}

}
