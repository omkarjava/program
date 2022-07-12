    package superchaining;

    import java.util.Scanner;

    public class Mainfamily {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Grandfather Name Nname Sname");
		String name=sc.next();
		String mname=sc.next();
		String sname=sc.next();
		Grandfather g= new Grandfather();
		g.grandFather(name, mname, sname);
        g.display();
        
        
        System.out.println("Enter Father name");
        String fname=sc.next();
		Father f=new Father();
		f.fatherName(fname);
	    f.display(name,sname);
	    
	    
	    System.out.println("Enter son Name");
	    String sonname=sc.next();
		Son s=new Son();
		s.sonName(sonname);
		s.display(fname,sname);
		
	}

}
