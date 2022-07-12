package hierachielInheretance;

public class MainFather {

	public static void main(String[] args) {
		System.out.println("Sun Father Details");
		Son s=new Son();
		s.fatherDetail("ram", "mane", 55);
		s.sonDetail("BE","raj");
		s.Display();
		//System.out.println(s);
		
		System.out.println("Daughter Father Details");
        Daughter d=new  Daughter();
        d.fatherDetail("ram", "mane", 55);
        d.daughterDetail("female","riya","ME");
        d.Display();
       // System.out.println(d);
	}

}
