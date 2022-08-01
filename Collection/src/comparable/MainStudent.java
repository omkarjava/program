    package comparable;

    import java.util.ArrayList;
    import java.util.Collections;

    public class MainStudent {

	public static void main(String[] args) {
		
		ArrayList<Student>s=new ArrayList<>();
		
		s.add(new Student (10,"ram","mech",85));
		s.add(new Student (12,"ramesh","elec",80));
		s.add(new Student (13,"rahul","comp",90));
		s.add(new Student (17,"avi","civil",75));
		s.add(new Student (6,"anvi","comp",82));
		s.add(new Student (18,"raj","comp",82));
		s.add(new Student (19,"kiran","mech",65));
		
//		Collections.reverse(s);
//		System.out.println(s);
		Collections.sort(s);
		//Collections.reverse(s);
		System.out.println(s);

	}

}
